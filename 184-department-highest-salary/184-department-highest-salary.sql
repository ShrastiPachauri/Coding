select d.name Department,e.name Employee,e.salary Salary
from Employee e join Department d on e.departmentId=d.id
where salary=(select max(salary) from employee where employee.departmentId=d.id);
