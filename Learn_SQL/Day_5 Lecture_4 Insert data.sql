CREATE TABLE employee(

		employee_id SERIAL Primary key,
		Name VARCHAR(100) NOT NULL,
		Position VARCHAR (50),
		department VARCHAR (100) NOT NULL,
		Hire_Date DATE,
		Salary NUMERIC (10,2)
);
SELECT*FROM employee;


INSERT INTO employee(name, position, department, hire_date, salary)
		VALUES ('Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			('Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			('Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			('Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			('Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00),
			('Ayush Rajput', 'Student', 'Data Science', '1-jan-2025', 65000.00);


-- Bleow this command change the column name 
-- ALTER TABLE employee
-- RENAME COLUMN position TO Position

-- Blew this commands deleting  inserted data in table
TRUNCATE TABLE employee;

TRUNCATE TABLE employee RESTART IDENTITY;
			