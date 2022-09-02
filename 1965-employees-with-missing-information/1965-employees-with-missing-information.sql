select employee_id 
from Employees full outer join Salaries using(employee_id)
where name is null or salary is null order by employee_id;

