SELECT e.title,
       ROUND(AVG(TIMESTAMPDIFF(MINUTE, s.start_time, s.end_time))) AS avg_duration_minutes
FROM Sessions s
JOIN Events e ON s.event_id = e.event_id
GROUP BY e.event_id;
