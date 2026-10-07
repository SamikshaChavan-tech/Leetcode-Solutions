# Write your MySQL query statement below
select Sales.product_id,product.product_name from Sales
left join Product
on Sales.product_id=Product.product_id
group by Sales.product_id,Product.product_name
having min(sale_date)>='2019-01-01' and max(sale_date)<='2019-03-31';