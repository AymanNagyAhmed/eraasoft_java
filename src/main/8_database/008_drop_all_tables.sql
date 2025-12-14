BEGIN
   FOR t IN (SELECT table_name FROM all_tables WHERE owner = 'HR') LOOP
      EXECUTE IMMEDIATE 'DROP TABLE hr.' || t.table_name || ' CASCADE CONSTRAINTS';
   END LOOP;
END;
