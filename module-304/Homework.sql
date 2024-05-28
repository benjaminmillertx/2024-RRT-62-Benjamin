 weekend homework
-- Question 0.1
-- I want to see the count of the number of products in each product line
SELECT 
	productline_id, 
    COUNT(product_name)
FROM products
GROUP BY productline_id
ORDER BY productline_id;

-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name
SELECT 
	e.firstname AS "First Name",
    e.lastname AS "Last Name",
    c.customer_name AS "Customer Name",
    c.contact_firstname AS "Contact First Name",
    c.contact_lastname AS "Contact Last Name"
FROM employees e, customers c
WHERE e.id = c.sales_rep_employee_id
ORDER BY e.lastname, e.firstname;

-- question 0.3
-- I want to see a list of employees in each office.   Show the office name and the employee name
SELECT 
	o.city AS "Office",
    e.firstname AS "First",
    e.lastname AS "Last"
FROM employees e, offices o
WHERE o.id = e.office_id
ORDER BY o.id;
-- question 0.4
-- I want to see the total number of each employee type based on job title.. result should the job title and the number of employess with that job title.
SELECT e.job_title, COUNT(e.job_title) AS NumberInPosition
FROM employees e
GROUP BY e.job_title
ORDER BY COUNT(e.job_title) DESC;
-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending
SELECT c.customer_name, p.*
FROM customers c, payments p
WHERE c.id = p.customer_id
ORDER BY c.customer_name, p.amount DESC;
-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
SELECT * 
FROM products 
WHERE id NOT IN 
	(SELECT product_id 
    FROM orderdetails );


-- question 0.7
-- are there any customers that have never made an order

SELECT c.*
FROM customers c
WHERE id NOT IN
	(SELECT customer_id
    FROM orders);

-- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.
SELECT o.city, COUNT(c.id) AS "Number of Customers"
FROM offices o, customers c, employees e
WHERE e.id = c.sales_rep_employee_id
	AND o.id = e.office_id
GROUP BY o.id;

-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSPR - buy_price) 
SELECT p.product_name, p.buy_price, p.msrp, (p.msrp - p.buy_price) AS profit_margin
FROM products p
ORDER BY profit_margin DESC;

-- Question 2.5
-- I want to see the top 5 customers in each state based on margin 

/*Wasn't able to get the top 5 by state*/
SELECT 
	c.customer_name, 
    c.state,
    SUM(p.msrp - p.buy_price) AS profit_margin
FROM customers c, orders o, orderdetails od,  products p
WHERE c.id = o.customer_id
	AND o.id = od.order_id
	AND p.id = od.product_id
    AND c.state IS NOT NULL
GROUP BY c.id, c.state
ORDER BY c.state ASC, profit_margin DESC;

-- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold
SELECT e.id, e.firstname, e.lastname, SUM(quantity_ordered * price_each) AS "Highest Sales"
FROM employees e, customers c, orders o, orderdetails od
WHERE e.id = c.sales_rep_employee_id
	AND c.id = o.customer_id
    AND o.id = od.order_id
GROUP BY e.id
LIMIT 5;
-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)
SELECT 
	e.id, 
    e.firstname, 
    e.lastname, 
    SUM(p.msrp - p.buy_price) AS "Highest Profit Margin"
FROM 
	employees e, 
    customers c, 
    orders o, 
    orderdetails od, 
    products p
WHERE e.id = c.sales_rep_employee_id
	AND c.id = o.customer_id
    AND o.id = od.order_id
    AND p.id = od.product_id
GROUP BY e.id
LIMIT 5;
-- Question 5 
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004
SELECT *
FROM orders
WHERE YEAR(order_date) = 2004;
-- Question 6
-- I want to see the total amount of all orders grouped by the year
SELECT 
	YEAR(order_date) AS "Year",
	COUNT(id) AS "Order Count"
FROM orders
GROUP BY YEAR(order_date);
-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders
# Sort by quantity sold
SELECT 
	p.product_name AS "Product Name",
    SUM(od.quantity_ordered) AS QuantityOrdered
FROM products p, orderdetails od, orders o
WHERE p.id = od.product_id
	AND o.id = od.order_id
GROUP BY p.id
ORDER BY QuantityOrdered DESC
LIMIT 5;

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.
SELECT p.product_name, COUNT(o.id)
FROM products p, orderdetails od, orders o
WHERE o.id = od.order_id
	AND p.id = od.product_id
GROUP BY p.product_name;

-- question 7.6
-- how many products would be out of stock baed on the amount sold acrosss tiem.  -- not sure if the data will spoort this .. basically 
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
#Is quantity sold greater than stock
SELECT 
	p.product_name,
	(COUNT(o.id) * (SUM(od.quantity_ordered))) AS "Total Quantity Sold",
	MAX(p.quantity_in_stock) AS "Stock"
FROM products p, orderdetails od, orders o
WHERE o.id = od.order_id
	AND p.id = od.product_id
GROUP BY p.product_name
HAVING MAX(p.quantity_in_stock) < (COUNT(o.id) * (SUM(od.quantity_ordered)));
#Turns out everything would be in stock.

-- question 7.9
-- I want to see the distinct order status ordered alphabetically
SELECT DISTINCT status
FROM orders
GROUP BY status
ORDER BY status;

-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.  
# select distinct o.name as office_name, pl.productlines as product_line_name

#This may have to be theoretical... I'm getting server timeouts attempting this.
SELECT 
	o.city,
    pl.product_line
FROM 
	offices o, 
	employees e, 
    customers c, 
    orders ord, 
    orderdetails od, 
    products p, 
    productlines pl
GROUP BY pl.product_line
