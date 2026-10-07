# Write your MySQL query statement below
select distinct contest_id,round((count(register.user_id)/(select count(*) from users))*100.0,2) as percentage from users
inner join register 
on users.user_id=register.user_id
group by contest_id 
order by percentage desc,contest_id;