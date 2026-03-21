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

SELECT * FROM users1;

--Insert 5 sample users into the users table 
INSERT INTO users1 (username, email, age, city)
VALUES('Ayush Rajput', 'akshverma@gmail.com',25, 'Farrukhabad'),
		('Piyush Rajput','piyush@gmail.com',15,'Etah'),
		('Ayush Rajput', 'akshverma@yahoo.com',25, 'Farrukhabad'),
		('Piyush Rajput','piyush@gmail.com',15,'Etah'),
		('Ayush Rajput', 'akshverma@gmail.com',25, 'Farrukhabad'),
		('Piyush Rajput','piyush@gmail.com',15,'Etah');


SELECT username, city FROM users1;

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