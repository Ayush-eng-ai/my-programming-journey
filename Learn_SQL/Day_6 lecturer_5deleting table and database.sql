CREATE TABLE project(

		employee_id INT Primary key,
		Name VARCHAR(100) NOT NULL,
		Position VARCHAR (50),
		department VARCHAR (100) NOT NULL,
		Hire_Date DATE,
		Salary NUMERIC (10,2)
);
SELECT*FROM project;

INSERT INTO project(employee_id, name, position, department, hire_date, salary)
		VALUES (101,'Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			(102,'Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			(103,'Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			(104,'Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			(105,'Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			(106,'Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00);



-- 
DELETE FROM project
WHERE employee_id=105;


ALTER TABLE project
DROP COLUMN salary;

-- DROP TABLE IF EXITS project;

-- DROP DATABASE IF EXITS project;