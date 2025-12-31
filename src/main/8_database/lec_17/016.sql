SELECT
  "EmployeeID",
  INITCAP("FirstName") AS first_name_title,
  INITCAP("LastName")  AS last_name_title
FROM HR."employees";
