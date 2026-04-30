select e.name as Employee
from Employee as e
left join Employee as e2
on e.managerId = e2.id
where e.salary > e2.salary;