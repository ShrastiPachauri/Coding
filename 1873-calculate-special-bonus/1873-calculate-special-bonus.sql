/* Write your PL/SQL query statement below */

select employee_id,(case when name not like 'M%' and MOD(employee_id,2)<>0 then salary else 0 END)"bonus" from Employees;




