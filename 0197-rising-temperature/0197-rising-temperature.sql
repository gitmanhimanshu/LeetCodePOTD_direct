# Write your MySQL query statement below
select w2.id as id from  weather as w1 join weather as w2 on w1.id+1=w2.id where w2.temperature >w1.temperature;