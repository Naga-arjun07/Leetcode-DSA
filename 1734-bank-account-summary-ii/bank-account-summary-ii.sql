# Write your MySQL query statement below
select u.name as name , sum(amount) as balance
from users u
left join transactions t
on u.account = t.account 
group by u.account having sum(t.amount) > 10000 ; 