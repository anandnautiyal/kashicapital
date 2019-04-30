CREATE TABLE kashicapital.USERS (
	ID int NOT NULL AUTO_INCREMENT, 
	FIRST_NAME nvarchar(100) ,
	LAST_NAME nvarchar(100) ,
	USER_NAME nvarchar(100) ,
	PASSWORD nvarchar(100) ,
	PHONE nvarchar(10),
	ACTIVE numeric(1),
	DELETED numeric(1),
	DATE_CREATED TIMESTAMP (6),
	DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID)
);


CREATE TABLE kashicapital.LEAD_MASTER (
	ID int NOT NULL AUTO_INCREMENT,  
	CODE nvarchar(50),
	STATUS nvarchar(50),
	DATE_CREATED TIMESTAMP (6),
	DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID)
);

CREATE TABLE kashicapital.LEAD_CUSTOMER (
	ID int NOT NULL AUTO_INCREMENT, 
	lead_id int NOT NULL,
	name nvarchar(100),
	nature_of_business nvarchar(50),
	phone nvarchar(10),
	aadhar_no nvarchar(20),
	pan_no nvarchar(20),
	voter_id_no nvarchar(20),
	address nvarchar(200),
	meeting_date TIMESTAMP (6),
	active numeric(1),
	deleted numeric(1),
	create_date TIMESTAMP (6),
	modified_date TIMESTAMP (6),
	PRIMARY KEY(id),	
	CONSTRAINT LEAD_FK01 FOREIGN KEY (LEAD_ID) REFERENCES kashicapital.LEAD_MASTER (ID)
);

CREATE TABLE kashicapital.LEAD_COMMENT (
	ID int NOT NULL AUTO_INCREMENT, 
	LEAD_ID int NOT NULL,
	LEAD_STATUS nvarchar(50),
	COMMENTS nvarchar(255),
	COMMENT_BY_USER numeric(10),
	DATE_OF_COMMENT TIMESTAMP (6),
	DATE_CREATED TIMESTAMP (6), 
	DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID),
	CONSTRAINT LEAD_COMMENTS_FK01 FOREIGN KEY(LEAD_ID) REFERENCES kashicapital.LEAD_MASTER(ID) 
);

CREATE TABLE kashicapital.LEAD_CUSTOMER_DOCUMENT (
	ID int NOT NULL AUTO_INCREMENT,
	LEAD_CUSTOMER_ID int NOT NULL,
	DOCUMENT_NAME nvarchar(50),
	DOCUMENT_IMAGE BLOB,
	DATE_CREATED TIMESTAMP (6), 
	DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID),
	CONSTRAINT LEAD_CUST_DOCS_FK01 FOREIGN KEY(LEAD_CUSTOMER_ID) REFERENCES kashicapital.LEAD_CUSTOMER (ID)
);