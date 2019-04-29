MYSQL query

 CREATE TABLE KASHICAPITAL.users (
	id int NOT NULL AUTO_INCREMENT,
	first_name nvarchar(100) ,
	last_name nvarchar(100) ,
	user_name nvarchar(100) ,
	password nvarchar(100) ,
	phone nvarchar(10),
	active numeric(1),
	deleted numeric(1),
	create_date TIMESTAMP,
	modified_date TIMESTAMP,
	PRIMARY KEY(id)
);


CREATE TABLE KASHICAPITAL.lead_customer (
	id int NOT NULL AUTO_INCREMENT,
	lead_id numeric(10) NOT NULL,
	first_name nvarchar(100),
	last_name nvarchar(100),
	nature_of_business nvarchar(50),
	phone nvarchar(10),
	aadhar_no nvarchar(12),
	pan_no nvarchar(10),
	voter_id_no nvarchar(15),
	address nvarchar(200),
	meeting_date TIMESTAMP,
	active numeric(1),
	deleted numeric(1),
	create_date TIMESTAMP,
	modified_date TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY(lead_id) REFERENCES KASHICAPITAL.lead_master(id)
);

CREATE TABLE KASHICAPITAL.lead_comments (
	id int NOT NULL AUTO_INCREMENT,
	lead_id numeric(10) NOT NULL,
	lead_status nvarchar(10),
	comments nvarchar(100),
	comment_by_user numeric(1),
	date_of_comment TIMESTAMP,
	modified_date TIMESTAMP,
	create_date TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY(lead_id) REFERENCES KASHICAPITAL.lead_master(id)
);

CREATE TABLE KASHICAPITAL.lead_customer_documents (
	id int NOT NULL AUTO_INCREMENT,
	lead_customer_id numeric(10) NOT NULL,
	document_name nvarchar(50),
	document_image BLOB ,
	create_date TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY(lead_customer_id) REFERENCES KASHICAPITAL.lead_customer(id)
);

commit;

INSERT INTO kashicapital.lead (id, code, status) VALUES (1, 'KC01', 'open' );
INSERT INTO kashicapital.lead_customer
(id,
lead_id,
first_name,
last_name,
nature_of_business,
phone,
aadhar_no,
pan_no,
voter_id_no,
address
)
VALUES
(1,1,'manu','sood','sofftware','8283829179','aadhar','pa73424','voter1234','s-12/122,nadesar');

CREATE DATABASE kashicapital /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
