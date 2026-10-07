# Write your MySQL query statement below
select name ,IFNULL(SUM(distance),0) AS travelled_distance from Users

left join Rides
on Users.id=Rides.user_id
group by user_id

order by travelled_distance DESC,name;
