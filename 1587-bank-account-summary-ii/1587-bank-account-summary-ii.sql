/* Write your PL/SQL query statement below */
SELECT
    name AS name
    , SUM(amount) AS balance
FROM
    USERS u JOIN
    transactions t
ON
    u.account = t.account
GROUP BY
    u.account
    , u.name
HAVING
    SUM(amount) > 10000
; 