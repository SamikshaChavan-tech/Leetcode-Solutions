# Write your MySQL query statement below
select product_name ,sum(unit) as unit from Products 
inner join orders
on Products.product_id=Orders.product_id
WHERE order_date >= '2020-02-01'
AND order_date < '2020-03-01'
group by orders.product_id 
having unit>=100 ;