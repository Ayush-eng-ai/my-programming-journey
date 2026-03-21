-- Day 11- SQL Assignment: Comprehensive Practice
			-- Example Table :Employee Information
	/*
		
			# Here's the SQL code to create a table for the assignment:
				~~ Drop the table if it already exists
				DROP TABLE IF EXISTS employees;
				-- Create the employees table
				CREATE TABLE employees (
				employee_id SERIAL PRIMARY KEY,
				first_name VARCHAR(50) NOT NULL,
				last_name VARCHAR(50) NOT NULL,
				department VARCHAR(50),
				salary DECIMAL(10, 2) CHECK (salary > 0),
				joining date DATE NOT NULL,
				age INT CHECK (age >= 18)
				)

	*/
                Drop the table if it already exists
				DROP TABLE IF EXISTS employees;
				-- Create the employees table
				CREATE TABLE employees (
				employee_id SERIAL PRIMARY KEY,
				first_name VARCHAR(50) NOT NULL,
				last_name VARCHAR(50) NOT NULL,
				department VARCHAR(50),
				salary DECIMAL(10, 2) CHECK (salary > 0),
				joining_date DATE NOT NULL,
				age INT CHECK (age >= 18)
				);
	SELECT * FROM employees;
		
	/*
		~ Insert some sample data into the ‘employees’ table: i
			—INSERT data into  employees Tables
			INSERT INTO employees (first_name, last_name, department, salary, joining_date, age)
			VALUES ®
			(Amit! Shay ", 60000.00,'2022-05-01', 29),
			('Neha', ‘Patel’, "HR', 55000.00, '2021-08-15', 32),
			(‘Ravi', Kumar’, ‘Finance’, 70000.00, '2020-03-10, 35),
			(‘Anjalf, Verma’, "IT, 65000.00, '2019-11-22", 28),
			(‘Suresh’, Reddy’, ‘Operations’, 50000.00, 2023-01-10, 26);

	*/

		 --    INSERT data into  employees Table
			-- INSERT INTO employees (first_name, last_name, department, salary, joining_date, age)
			-- VALUES 
			-- ('Amit', 'Shay','IT', 60000.00,'2022-05-01', 29),
			-- ('Neha', 'Patel', 'HR', 55000.00, '2021-08-15', 32),
			-- ('Ravi', 'Kumar’, 'Finance', 70000.00, '2020-03-10', 35),
			-- ('Anjalf', 'Verma', 'IT', 65000.00, '2019-11-22', 28),
			-- ('Suresh', 'Reddy','Operations', 50000.00, '2023-01-10', 26);
INSERT INTO employees 
(first_name, last_name, department, salary, joining_date, age)
VALUES 
('Amit', 'Shay', 'IT', 60000.00, '2022-05-01', 29),
('Neha', 'Patel', 'HR', 55000.00, '2021-08-15', 32),
('Ravi', 'Kumar', 'Finance', 70000.00, '2020-03-10', 35),
('Anjalf', 'Verma', 'IT', 65000.00, '2019-11-22', 28),
('Suresh', 'Reddy', 'Operations', 50000.00, '2023-01-10', 26);



/*
		# Practice Assignment Questions with Answers (Solution has given on next page) I
Q1: Retrieve all employees’ first names and their departments.
Q2: Update the salary of all employees in the ‘IT’ department by increasing it by 10%.
Q3: Delete all employees who are older than 34 years.
Q4: Add a new column "email" to the ‘employees’ table.
Q5: Rename the ‘department’ column to ‘dept_name’.
Q6: Retrieve the names of employees who joined after January 1, 2021.
Q7: Change the data type of the salary’ column to INTEGER".
Q8: List all employees with their age and salary in descending order of salary.
Q9: Insert a new employee with the following details: ‘Raj’, Singh’, 'Marketing’, 60000,
'2023-09-15', 30.
Q10: Update age of employee +1 to every employee |
*/


SELECT * FROM employees;
-- Assignment Questions
--Q1: Retrieve all employees’ first_name and their departments.

SELECT FIRST_NAME,
	DEPARTMENT
FROM EMPLOYEES;

--Q2: Update the salary of all employees in the 'IT' department by increasing it by 10%.

UPDATE employees
SET salary=salary + (salary*0.1 )
WHERE department ='IT';


SELECT * FROM employees;
--Q3: Delete all employees who are older than 34 years.

DELETE FROM employees
WHERE age>34;


--Q4: Add a new column `email` to the `employees` table.

ALTER TABLE employees
ADD COLUMN email VARCHAR(100);



--Q5: Rename the `department` column to `dept_name`.
ALTER TABLE employees
RENAME COLUMN department TO dept_name;

SELECT * FROM employees;
--Q6: Retrieve the names of employees who joined after January 1, 2021.

SELECT first_name, last_name, joining_date FROM employees
WHERE joining_date > '2021-01-01';


--Q7: Change the data type of the `salary` column to `INTEGER`.

ALTER TABLE employees 
ALTER COLUMN salary TYPE INTEGER USING salary::INTEGER;

--Q8: List all employees with their age and salary in descending order of salary.

SELECT first_name, age, salary FROM employees 
ORDER BY salary DESC;

--Q9: Insert a new employee with the following details: 
		-- ('Raj', 'Singh', 'Marketing', 60000, '2023-09-15', 30)

INSERT INTO employees(first_name, last_name, dept_name, salary, joining_date, age)
VALUES('Raj', 'Singh', 'Marketing', 60000, '2023-09-15', 30);
		
--Q10: Update age of employee +1 to every employee 

UPDATE employees
SET age=age+1;


	