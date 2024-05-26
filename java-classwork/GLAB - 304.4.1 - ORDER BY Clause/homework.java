SELECT    orderNumber, orderlinenumber, quantityOrdered * priceEach
FROM    orderdetails
ORDER BY   quantityOrdered * priceEach DESC;

Output
orderNumber
orderLineNumber
quantityOrdered * priceEach
10403
9
11503.14
10405
5
11170.52
10407
2
10723.60
10404
3
10460.16
10312
3
10286.40

SELECT 
    orderNumber,
    orderLineNumber,
    quantityOrdered * priceEach AS subtotal
FROM    orderdetails
ORDER BY subtotal DESC;
SELECT    firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo;
Output
firstName
lastName
reportsTo
Diane
Murphy
NULL
Mary
Patterson
1002
Jeff
Firrelli
1002
William
Patterson
1056
Gerard
Bondur
SELECT    firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo DESC;

Output
firstName
lastName
reportsTo
...
data included before
...
Mami
Nishi
1056
Mary
Patterson
1002
Jeff
Firrelli
1002
Diane
Murphy
NULL
Summary
Use the ORDER BY clause to sort the result set by one or more columns.
Use the ASC option to sort the result set in ascending order, and the DESC option to sort the result set in descending order.
The ORDER BY clause is evaluated after the FROM and SELECT clauses.
In MySQL, NULL is lower than non-NULL values.
Example: <your_name_labname>.sql.
Do not add the questions in your SQL script file. 
Submit your SQL script file using the Start Assignment button on the assignment page in Canvas.


  


  
