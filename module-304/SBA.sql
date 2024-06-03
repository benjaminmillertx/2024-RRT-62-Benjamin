-- 3A
select d.name, count(c.id)
from department d, course c
where d.id = c.deptId
group by d.id
order by count(c.id) asc, d.name asc;

-- 3B
select c.name, count(sc.studentId)
from course c, studentcourse sc
where c.id = sc.courseId
group by c.id
order by count(sc.studentId) desc, c.name asc;

select p.product_name, max(od.buy_price) as max_offer, min(od.buy_price) as min_buy_price, avg(od.buy_price) as avg_buy_price
from product p, order_details od
where p.id = od.product_id
group by p.id;

SELECT
    p.product_name,
    MAX(od.buy_price) AS max_offer,
    MIN(od.buy_price) AS min_buy_price,
    AVG(od.buy_price) AS avg_buy_price,
    SUM(od.buy_price) AS total_spent
FROM
    product p
JOIN
    order_details od ON p.id = od.product_id
GROUP BY
    p.id
ORDER BY
    total_spent DESC;


