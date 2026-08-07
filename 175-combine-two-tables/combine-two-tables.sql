# Write your MySQL query statement below
select firstName , lastName  , city , state from person Left join address 
on person.personId = address.personId ;
