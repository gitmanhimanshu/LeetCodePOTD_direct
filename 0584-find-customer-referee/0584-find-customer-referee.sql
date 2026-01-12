# Write your MySQL query statement below
select c.name from Customer as c  where not (c.referee_id=2) or c.referee_id is null;