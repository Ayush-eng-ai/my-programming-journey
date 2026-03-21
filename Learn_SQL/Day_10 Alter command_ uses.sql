--Drop the table if it already exists 
DROP TABLE IF EXISTS users1;
--Creating the users table 
CREATE TABLE IF NOT EXISTS users1 (
	user_id SERIAL PRIMARY KEY,
	username VARCHAR(50) NOT NULL,
	email VARCHAR (100) NOT NULL,
	age INT,
	city VARCHAR(50)
);

SELECT
	*
FROM
	USERS1;

--Insert 5 sample users into the users table 
INSERT INTO users1 (username, email, age, city)
	VALUES('Ayush Rajput', 'akshverma@gmail.com',25, 'Farrukhabad'),
			('Piyush Rajput','piyush@gmail.com',19,'Etah'),
			('Ayush Rajput', 'akshverma@yahoo.com',25, 'Farrukhabad'),
			('Piyush Rajput','piyush@gmail.com',27,'Etah'),
			('Ayush Rajput', 'akshverma@gmail.com',25, 'Farrukhabad'),
			('Piyush Rajput','piyush@gmail.com',27,'Etah');


		SELECT
	USERNAME,
	CITY
FROM
	USERS1;

UPDATE users1
SET age=28, city='Kolkata'
WHERE username='Ayush Rajput';

UPDATE users1
SET city='India'
WHERE age>=20;

SELECT * FROM users1 ORDER BY user_id ASC;

UPDATE users1
SET age = age+1
WHERE email LIKE '%@gmail.com';

DELETE FROM users1 WHERE user_id = 6;



-- To Rename the username column to Full_Name

ALTER TABLE users1
RENAME COLUMN username TO Full_Name;

SELECT * FROM users1 ORDER BY user_id ASC;

--To change the age column's data type from INT to SMALLINT
ALTER TABLE users1
ALTER COLUMN age TYPE SMALLINT;

-- To add  a NOT NULL CONSTRAINT  to city column
ALTER TABLE users1
ALTER COLUMN city SET NOT NULL;


-- Adding check constraint to age column

ALTER TABLE users1
DROP CONSTRAINT age;

ALTER TABLE users1
ADD CONSTRAINT age CHECK (age >= 18);



INSERT INTO users1 (full_Name, email, age, city)
	VALUES('Rajkumar Rajput', 'rajkumar@gmail.com',29, 'Farrukhabad');

SELECT * FROM users1 ORDER BY user_id ASC;

--Alter table: Change of table name  
ALTER TABLE users1
RENAME TO customers;

SELECT * FROM customers ORDER BY user_id ASC;
