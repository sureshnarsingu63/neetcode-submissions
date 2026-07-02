-- Write your query below

-- select c.name 
-- from customers c
-- Left Join Orders o
-- ON c.id = o.customer_id
-- where o.customer_id is null;

select c.name 
from customers c
where Not Exists (
    select 1
    from orders o
    where o.customer_id = c.id
);


