# Write your MySQL query statement below
select Department.name as Department,Employee.name as Employee,Salary  from Employee
inner join department 
on departmentid=department.id
having salary=(select max(salary) from employee where departmentid=Department.id);