DROP TABLE IF EXISTS employee2;

CREATE TABLE employee2(
	employee_id INT primary key,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20),
	department VARCHAR(20),
	salary NUMERIC(10,2),
	joining_date DATE,
	age INT
);

SELECT * FROM employee2

COPY
employee2 (employee_id,first_name,last_name,department,salary,joining_date,age)
FROM 'D:\OFF Campuse Learning\Data Scienctist\Data_Analyst_Learning_phases\Learn_SQL\Day_12 employee_data excel.csv'
DELIMITER ','
CSV HEADER;
SELECT * FROM employee2