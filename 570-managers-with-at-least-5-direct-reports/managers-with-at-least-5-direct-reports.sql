# Write your MySQL query statement below
select e.name as name
from employee e
join employee m 
on e.id = m.managerid
group by e.id
having count(m.managerId)>=5 ;
#where m.managerId is not null