SELECT e.title
FROM Events e
LEFT JOIN Resources r ON e.event_id = r.event_id
GROUP BY e.event_id
HAVING COUNT(r.resource_id) = 0;
