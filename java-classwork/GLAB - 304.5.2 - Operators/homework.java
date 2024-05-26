SELECT    customername, country
FROM    customers
WHERE    country = 'USA' OR country = 'France';

SELECT    customername, country, creditLimit  
FROM    customers
WHERE (country = 'USA' OR country = 'France') AND creditlimit > 100000;

SELECT  customername, country, creditLimit FROM    customers
WHERE    country = 'USA' OR country = 'France' AND creditlimit > 100000;
productCode
productName
productLine
productScale
productVendor
productDescription
quantityinStock
buyPrice
MSRPSELECT     productCode,  productName,  buyPrice
FROM    products
WHERE     buyPrice BETWEEN 90 AND 100;
SELECT productCode, productName, buyPrice
FROM products
WHERE  buyPrice >= 90 AND buyPrice <= 100;
To find the product whose buy price is not between $20 and $100, you can combine the BETWEEN operator with the NOT operator as follows:
SELECT productCode, productName, buyPrice FROM products
WHERE buyPrice NOT BETWEEN 20 AND 100;
Result
MySQL NOT BETWEEN example
You can rewrite the query above using the less than (>), greater than (>), and logical operator (AND) as the following query.
SELECT productCode, productName, buyPrice FROM products
WHERE  buyPrice < 20     OR     buyPrice > 100;
4) Example:  “IS NULL” Operator

Consider the customers table in the “classicmodels” database:
Customers Table
The following query uses the IS NULL operator to find customers who do not have a sales representative:
SELECT customerName, country, salesrepemployeenumber
FROM customers
WHERE salesrepemployeenumber IS NULL
ORDER BY  customerName;
 Result:
MySQL IS NULL Operator example
 The below query uses the IS NOT NULL operator to get the customers who have a sales representative:
SELECT customerName, country, salesrepemployeenumber
FROM  customers
WHERE  salesrepemployeenumber IS NOT NULL
ORDER BY customerName;
Result:
MySQL IS NOT NULL Operator example
The following query uses the LEFT JOIN predicate and the IS NULL operator  to find customers who have no order:
SELECT  c.customerNumber, c.customerName,  orderNumber, o.STATUS
FROM customers c
LEFT JOIN orders o
ON c.customerNumber = o.customerNumber
WHERE  orderNumber IS NULL;
 Result:
MySQL LEFT JOIN unmatched rows
Canvas submission Instructions: Please include the following deliverables in your submission -
All queries should be written and submitted in a single SQL script file named, for example :<your_name_labname>.sql.
Submit your SQL script file using the Start Assignment button in the top-right corner of the assignment page in Canvas.
CANVAS STAFF USE ONLY: Canvas Submission Guideline:
Instructions for Canvas Assignment Creation
Assignment Name: GLAB - 304.5.2 - Operators
Points: 100
Assignment Group: Module 304 - Relational Databases and SQL - (Not Graded)
Display Grade As: Complete/Incomplete
Do not count this assignment towards the final grade: Checked
Submission Types: Files Uploads
Allowed Attempts: Unlimited
Everything else is the default.


  
