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

select p.product_name, max(buy_price) as max_offer, min(buy_price) as min_buy_price, avg(buy_price) as avg_buy_price
from products p, order_details od
where p.id = od.product_id
group by p.id;

