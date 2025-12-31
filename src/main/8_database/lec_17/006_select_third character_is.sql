SELECT *
FROM HR."employees"
WHERE UPPER(SUBSTR("FirstName", 3, 1)) = 'E';
