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

-- 3D
select count(distinct sc.studentId) as Students, year(startDate) as Year
from studentcourse sc
group by year(sc.startDate)
order by year asc, Students desc;

-- 3E
select startDate, count(distinct sc.studentId) as students
from studentcourse sc
where month(startDate) = 8
group by startDate
order by startDate asc, students asc;

-- 3F
select s.firstname, s.lastname, count(sc.courseId) as course_count
from student s, studentcourse sc, course c
where s.id = sc.studentId
    and sc.courseId = c.id
    and c.deptId = s.majorId
group by s.id
order by course_count desc, firstname asc, lastname asc;

-- 3F
select s.firstname, s.lastname, count(sc.courseId) as course_count
from student s, studentcourse sc, course c
where s.id = sc.studentId
    and sc.courseId = c.id
    and c.deptId = s.majorId
group by s.id
order by course_count desc, firstname asc, lastname asc;

-- 3G -- may need to use round instead
select s.firstname, s.lastname, format(avg(progress),1) as avg_progress
from student s, studentcourse sc
where s.id = sc.studentId
group by s.id
having avg_progress < 50;

select s.firstname, s.lastname, round(avg(progress), 1) as avg_progress
from student s, studentcourse sc
where s.id = sc.studentId
group by s.id
having avg_progress < 50;

-- 312
select format(avg(progress),1) as avg_progress, c.name
from course c, studentcourse sc
where c.id = sc.courseId
group by c.id
order by avg_progress desc, c.name asc
limit 1;

-- 343
select firstname, lastname, avg(progress) as avg_progress
from faculty f, facultycourse fc, studentcourse sc
where f.id = fc.facultyId
and fc.courseId = sc.courseId
group by f.id
order by avg_progress desc;

-- 31
select firstname, lastname, min(progress), max(progress),
    CASE
        WHEN min(progress) < 40 THEN 'F'
        WHEN min(progress) < 50 THEN 'E'
        WHEN min(progress) < 60 THEN 'D'
        WHEN min(progress) < 70 THEN 'C'
        WHEN min(progress) < 80 THEN 'B'
        ELSE 'A'
    END as min_grade,
    CASE
        WHEN max(progress) < 40 THEN 'F'
        WHEN max(progress) < 50 THEN 'E'
        WHEN max(progress) < 60 THEN 'D'
        WHEN max(progress) < 70 THEN 'C'
        WHEN max(progress) < 80 THEN 'B'
        ELSE 'A'
    END as max_grade
from student s, studentcourse sc
where s.id = sc.studentId
group by s.id;






