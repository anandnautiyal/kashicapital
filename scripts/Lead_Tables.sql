CREATE TABLE lead (
	id number(10) NOT NULL,
	code varchar2(100),
	status varchar2(100),
	create_date TIMESTAMP,
	modified_date TIMESTAMP,
	PRIMARY KEY(id)
);


CREATE TABLE users (
	id number(10) NOT NULL,
	first_name varchar2(100) ,
	last_name varchar2(100) ,
	user_name varchar2(100) ,
	password varchar2(100) ,
	phone varchar2(10),
	active number(1),
	deleted number(1),
	create_date TIMESTAMP,
	modified_date TIMESTAMP,
	PRIMARY KEY(id)
);

CREATE TABLE lead_customer (
	id number(10) NOT NULL,
	lead_id number(10) NOT NULL,
	name varchar2(100),
	nature_of_business varchar2(50),
	phone varchar2(10),
	aadhar_no varchar2(12),
	pan_no varchar2(10),
	voter_id_no varchar2(15),
	address varchar2(200),
	meeting_date number(19),
	active number(1),
	deleted number(1),
	create_date TIMESTAMP,
	modified_date TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY(lead_id) REFERENCES lead(id)
);

CREATE TABLE lead_comments (
	id number(10) NOT NULL,
	lead_id number(10) NOT NULL,
	lead_status varchar2(10),
	comments varchar2(100),
	comment_by_user number(1),
	date_of_comment TIMESTAMP,
	modified_date TIMESTAMP,
	create_date TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY(lead_id) REFERENCES lead(id)
);

CREATE TABLE lead_customer_documents (
	id number(10) NOT NULL,
	lead_id number(10) NOT NULL,
	document_name varchar2(50),
	document_image BLOB ,
	create_date TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY(lead_id) REFERENCES lead(id)
);