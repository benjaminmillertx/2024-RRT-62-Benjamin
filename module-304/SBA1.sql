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

SELECT column1, column2, column3
FROM table_name;
Query 2:
SELECT column1, COUNT(*)
FROM table_name
GROUP BY column1;
Query 3:
SELECT column1, MAX(column2)
FROM table_name
GROUP BY column1;
Query 4:
SELECT column1, MIN(column2)
FROM table_name
GROUP BY column1;
Query 5:
SELECT column1, AVG(column2)
FROM table_name
GROUP BY column1;

code
-- XC1
select c.name
from course c
where c.id not in (select distinct courseId from facultycourse)
order by c.name asc;





