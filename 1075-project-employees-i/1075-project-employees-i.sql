# Write your MySQL query statement below
select distinct project_id,round(avg(experience_years),2) as average_years from Project
inner join employee
on project.employee_id=employee.employee_id
group by project_id