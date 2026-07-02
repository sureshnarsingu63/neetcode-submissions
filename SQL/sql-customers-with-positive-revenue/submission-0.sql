-- Write your query below

create INDEX idx_year_revenue
ON customers(year, revenue);

select customer_id 
from customers
where year = 2020 and revenue > 0;
