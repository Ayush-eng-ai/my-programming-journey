
CREATE TABLE employee2(
	employee_ID INT PRIMARY KEY,
	name VARCHAR(100)NOT NULL,
	position VARCHAR(50),
	department VARCHAR(50),
	hire_date  DATE,
	salary NUMERIC(10,2)
	
);
SELECT * FROM employee2;


INSERT INTO employee2(employee_id,name,position,department,hire_date,salary)
VALUES ('101','Ayush Rajput',' Data Analyst',' Data Science', '2025-01-01',150000.00),
	('102','Piyush Rajput', 'Student',' Schooling', '2025-01-01', '20000.00');

	Truncate table employee2  restart identity;


	DELETE FROM employee2
	WHERE employee_id=102;

	ALTER TABLE employee2
	DROP COLUMN salary;


	DROP TABLE IF EXISTS employee2;