/* Write your PL/SQL query statement below */
SELECT
    TO_CHAR(ds.date_id, 'RRRR-MM-DD') AS date_id
    , ds.make_name
    , COUNT(DISTINCT ds.lead_id) AS unique_leads
    , COUNT(DISTINCT ds.partner_id) AS unique_partners
FROM
    dailysales ds
GROUP BY
    ds.date_id
    , ds.make_name
;