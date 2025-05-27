SELECT user_id, full_name
FROM Users
WHERE user_id NOT IN (
    SELECT user_id
    FROM Registrations
    WHERE registration_date >= CURDATE() - INTERVAL 90 DAY
);
