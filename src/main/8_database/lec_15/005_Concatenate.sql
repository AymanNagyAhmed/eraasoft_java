SELECT
  "name" || ' - ' || TO_CHAR("salary") AS name_salary
FROM hr."doctor";
