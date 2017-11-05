CREATE TABLE item(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(16) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  category VARCHAR(15) NOT NULL,
  description VARCHAR(160)
  );

CREATE TABLE customer(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(64),
  last_name VARCHAR(64),
  email_address VARCHAR(64),
  address VARCHAR(64),
  country VARCHAR(32),
  state VARCHAR(12),
  phone_number VARCHAR(24)
);

CREATE TABLE table_info(
  id BIGINT PRIMARY KEY,  
  description VARCHAR(64),
  people_count BIGINT NOT NULL
);


CREATE TABLE restaurant(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	address VARCHAR(100) NOT NULL,
	phone VARCHAR(24) NOT NULL,
	email_address VARCHAR(70) NOT NULL,
	website VARCHAR(70),
	created_at DATE,
	active INT,
	total_users INT, 
);

CREATE TABLE users(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	password VARCHAR(10) NOT NULL,
	role VARCHAR(15) NOT NUll,
	active INT
);

CREATE TABLE order_info(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,	
	date DATE	
);

CREATE TABLE order_details(
	id BIGINT NOT NULL,
	table_id BIGINT NOT NULL,	
	item_id BIGINT NOT NULL,	
	item_quandity BIGINT NOT NULL,	
	PRIMARY KEY (id,table_id,item_id)	
);

