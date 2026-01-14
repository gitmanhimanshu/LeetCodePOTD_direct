# Write your MySQL query statement below
select we.id from Weather as w join Weather as we on we.recordDate= DATE_ADD(w.recordDate, INTERVAL 1 DAY) where we.temperature>w.temperature;