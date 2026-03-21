SELECT * FROM employee;

INSERT INTO employee(name,position,department,hire_date,salary)
VALUES ('Ayush Rajput',' Data Analyst',' Data Science', '2025-01-01',150000.00),
	('Piyush Rajput', 'Student',' Schooling', '2025-01-01', '20000.00');



TRUNCATE TABLE employee;

TRUNCATE TABLE employee RESTART IDENTITY;