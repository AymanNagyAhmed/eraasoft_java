-- ALTER TABLE HR."employees"
-- ADD "manager_id" NUMBER DEFAULT NULL;

SELECT *
FROM HR."employees"
WHERE "manager_id" IS NULL;