CREATE TABLE kashicapital.LOAN_APPLICATION (
ID int NOT NULL AUTO_INCREMENT ,  
CODE nvarchar(50),
STATUS nvarchar(50),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
PRIMARY KEY (ID));
-----------

CREATE TABLE kashicapital.LOAN_APPLICATION_CUSTOMER (
ID int NOT NULL AUTO_INCREMENT,
LOAN_ID int NOT NULL,
PRESENT_CUSTOMER numeric(1),
NEW_CUSTOMER numeric(1),
EXISTING_CUSTOMER_DETAIL nvarchar(255),
APPLICANT_NAME nvarchar(50),
COAPPLICANT_NAME nvarchar(50),
APPLICATION_SERIAL_NUMBER nvarchar(50),
CUSTOMER_NUMBER nvarchar(50),
LOAN_OFFICER_NAME nvarchar(50),
BRANCH_CODE nvarchar(50),
STATE nvarchar(50),
LOAN_TYPE_CODE nvarchar(50),
OCCUPATIONAL_INCOME numeric(10),
DOMESTIC_INCOME numeric(10),
INCOME_FROM_RENT numeric(10),
INCOME_FROM_OTHER_MEMBER numeric(10),
AGRICULTURAL_INCOME numeric(10),
SAL_INCOME numeric(10),
INCOME_FROM_MILK numeric(10),
INCOME_FROM_OTHER_SOURCE numeric(10),
TOTAL_HOUSEHOLD_INCOME numeric(10),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
	 PRIMARY KEY (ID) ,
   CONSTRAINT LOAN_APP_DETAIL_FK01 FOREIGN KEY (LOAN_ID) REFERENCES LOAN_APPLICATION (ID));
-----------

CREATE TABLE kashicapital.LOAN_CUSTOMER_DEPENDENT (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
NAME nvarchar(50),
RELATION nvarchar(100),
AGE nvarchar(10),
BUSINESS nvarchar(255),
INCOME nvarchar(50),
MOBILE_NUMBER nvarchar(20),
LIVING_STATUS nvarchar(50),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
   PRIMARY KEY (ID) ,
   CONSTRAINT LOAN_CUST_DEPENDENTS_FK01 FOREIGN KEY (LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));
   ----------

CREATE TABLE kashicapital.LOAN_TYPE (
LOAN_TYPE_ID int NOT NULL,
LOAN_TYPE_CODE nvarchar(50),
LOAN_TYPE_NAME nvarchar(50),
   PRIMARY KEY (LOAN_TYPE_ID));


CREATE TABLE kashicapital.APPLICATION_LOAN_DETAIL (
ID int NOT NULL AUTO_INCREMENT,
LOAN_ID int NOT NULL,
LOAN_TYPE_ID int NOT NULL,
LOAN_AMOUNT numeric(10),
LOAN_TERM numeric(10),
LOAN_OBJECTIVE nvarchar(200),
DEVICE_TYPE nvarchar(100),
DEVICE_LOAN_OBJECTIVE nvarchar(200),
SUPPLIER_NAME nvarchar(100),
COST_OF_MACHINE numeric (10),
CUSTOMER_CONTRIBUTION_AMOUNT numeric(10),
LOAN_AMOUNT_REQUIRED numeric(10),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
PRIMARY KEY (ID),
CONSTRAINT LOAN_TYPE_DETAIL_FK01 FOREIGN KEY (LOAN_ID) REFERENCES LOAN_APPLICATION (ID),
CONSTRAINT LOAN_TYPE_FK01 FOREIGN KEY(LOAN_TYPE_ID) REFERENCES LOAN_TYPE (LOAN_TYPE_ID));

CREATE TABLE kashicapital.LOAN_CUSTOMER_BUSINESS (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
ENTERPRISE_NAME nvarchar(100),
BUSINESS_ADDRESS nvarchar(255),
CITY nvarchar(50),
POST_OFFICE nvarchar(50),
DISTRICT nvarchar(50),
STATE nvarchar(50),
PIN_CODE nvarchar(50),
PHONE_NUMBER nvarchar(20),
MOBILE_NUMBER nvarchar(20),
EMAIL nvarchar(50),
PRESENT_BUSINESS_ACTIVITY nvarchar(255),
PROPOSED_BUSINESS_ACTIVITY nvarchar(255),
START_DATE TIMESTAMP (6),
TYPE_OF_COMPANY nvarchar(50),
BUSINESS_PREMISES_TYPE nvarchar(50),
GST_EXIST numeric(1),
GST_NUMBER nvarchar(50),
REGISTERED_OFFICE nvarchar(100),
NUMBER_OF_EMPLOYEE nvarchar(20),
REGISTERED_UNIT nvarchar(20),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
   PRIMARY KEY (ID) ,
   CONSTRAINT APP_BUSINESS_DETAIL_FK01 FOREIGN KEY (LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));
----------

CREATE TABLE kashicapital.LOAN_CUSTOMER_PARTNER_DETAIL (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
PARTNER_NAME nvarchar(50),
PARTNER_GURDIAN_NAME nvarchar(50),
DATE_OF_BIRTH TIMESTAMP (6),
GENDER nvarchar(20),
QUALIFICATION nvarchar(50),
YEARS_OF_EXPERIENCE numeric(10),
TYPE_OF_ACCOMODATION nvarchar(20),
CASTE nvarchar(50),
RELIGION nvarchar(50),
MOBILE_NUMBER nvarchar(20),
PAN_NUMBER nvarchar(20),
AADHAR_NUMBER nvarchar(20),
VOTER_CARD_NO nvarchar(20),
DIN_NUMBER nvarchar(20),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
   PRIMARY KEY (ID) ,
   CONSTRAINT CUST_PARTNER_DETAIL_FK01 FOREIGN KEY (LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));
-------------

CREATE TABLE kashicapital.LOAN_CUSTOMER_BANK_DETAIL (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
BANK_ACCOUNT_TYPE nvarchar(50),
BANK_NAME nvarchar(50),
BANK_BRANCH_NUMBER nvarchar(50),
ACCOUNT_NUMBER nvarchar(50),
ACCOUNT_START_DATE TIMESTAMP (6),
DEPOSIT_AMOUNT numeric(10),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
   PRIMARY KEY (ID) ,
   CONSTRAINT CUST_BANK_DETAIL_FK01 FOREIGN KEY (LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));
--------------
CREATE TABLE kashicapital.LOAN_CUSTOMER_LOAN_DETAIL (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
TYPE_OF_LOAN nvarchar(20),
LOAN_COMPANY_NAME nvarchar(50),
PURPOSE nvarchar(255),
LOAN_AMOUNT numeric(10),
BALANCE_LOAN_AMOUNT numeric(10),
LOAN_TERM nvarchar(255),
LOAN_INTEREST_RATE numeric(10),
LOAN_START_DATE TIMESTAMP (6),
LOAN_EMI_AMOUNT numeric(10),
LOAN_EMI_TYPE nvarchar(50),
LOAN_SECURITY nvarchar(50),
LOAN_AGREEMENT_INCORPORATED nvarchar(50),
PRESENT_LOAN_STATUS nvarchar(50),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
   PRIMARY KEY (ID) ,
   CONSTRAINT CUST_LOAN_DETAIL_FK01 FOREIGN KEY (LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));
--------
CREATE TABLE kashicapital.LOAN_APPLICATION_COMMENT (
ID int NOT NULL AUTO_INCREMENT,
LOAN_ID int NOT NULL,
LOAN_STATUS nvarchar(50),
COMMENTS nvarchar(255),
COMMENT_BY_USER numeric(10),
DATE_OF_COMMENT TIMESTAMP (6),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID),
	CONSTRAINT LOAN_APPLICANT_COMMENTS_FK01 FOREIGN KEY(LOAN_ID) REFERENCES LOAN_APPLICATION(ID) );

CREATE TABLE kashicapital.LOAN_APPLICATION_CUSTOMER_DOCUMENT (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
DOCUMENT_NAME nvarchar(50),
DOCUMENT_IMAGE BLOB,
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID),
	CONSTRAINT LOAN_CUST_DOCS_FK01 FOREIGN KEY(LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));

CREATE TABLE kashicapital.CUSTOMER_ASSET (
ID int NOT NULL,
ASSET_TYPE_CODE nvarchar(50),
ASSET_TYPE_NAME nvarchar(50),
PRIMARY KEY (ID));
	
CREATE TABLE kashicapital.LOAN_CUSTOMER_ASSET (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
ASSET_TYPE nvarchar(50),
CUSTOMER_ASSET_TYPE_ID int NOT NULL,
ASSET_QUANTITY numeric(10) NOT NULL,
ASSET_COST numeric(10) NOT NULL,
ASSET_DESCRIPTION nvarchar(200),
TOTAL_BUSINESS_ASSET numeric(10) NOT NULL,
TOTAL_HOME_ASSET numeric(10) NOT NULL,
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID),
	CONSTRAINT ASSET_TYPE_FK01 FOREIGN KEY(CUSTOMER_ASSET_TYPE_ID) REFERENCES CUSTOMER_ASSET (ID),
	CONSTRAINT CUST_LOAN_ASSET_FK01 FOREIGN KEY(LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));

	
CREATE TABLE kashicapital.LOAN_CUSTOMER_PARTNER_FIRM (
ID int NOT NULL AUTO_INCREMENT,
LOAN_CUSTOMER_ID int NOT NULL,
PARTNER_FIRM_NAME nvarchar(100),
FIRM_ADDRESS nvarchar(100),
PARTNER_FIRM_BANK_NAME nvarchar(50),
PARTNER_FIRM_BUSINESS_NATURE nvarchar(50),
DATE_CREATED TIMESTAMP (6), 
DATE_MODIFIED TIMESTAMP (6),
	PRIMARY KEY(ID),
	CONSTRAINT PARTNER_FIRM_FK01 FOREIGN KEY(LOAN_CUSTOMER_ID) REFERENCES LOAN_APPLICATION_CUSTOMER (ID));

-- Sample Data insert Queries --

Insert into KASHICAPITAL.LOAN_APPLICATION (ID,STATUS,DATE_CREATED,DATE_MODIFIED) values (1110,'InProcess',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.LOAN_TYPE (LOAN_TYPE_ID,LOAN_TYPE_CODE,LOAN_TYPE_NAME) values (1,'L1','Personal Loan');

INSERT INTO `kashicapital`.`customer_asset` (`ID`, `ASSET_TYPE_CODE`, `ASSET_TYPE_NAME`) VALUES ('1', 'AST1', 'HOME');

Insert into KASHICAPITAL.loan_application_customer (ID,LOAN_ID,PRESENT_CUSTOMER,NEW_CUSTOMER,EXISTING_CUSTOMER_DETAIL,APPLICANT_NAME,COAPPLICANT_NAME,APPLICATION_SERIAL_NUMBER,CUSTOMER_NUMBER,LOAN_OFFICER_NAME,BRANCH_CODE,STATE,LOAN_TYPE_CODE,OCCUPATIONAL_INCOME,DOMESTIC_INCOME,INCOME_FROM_RENT,INCOME_FROM_OTHER_MEMBER,AGRICULTURAL_INCOME,SAL_INCOME,INCOME_FROM_MILK,INCOME_FROM_OTHER_SOURCE,TOTAL_HOUSEHOLD_INCOME,DATE_CREATED,DATE_MODIFIED) values (1110,1110,0,1,'N/A','Varun','Ram','APP1110','1','Preet','LB00010','PUNJAB','1',10000,30000,60000,0,20000,30000,10000,20000,180000,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_customer_business (ID,LOAN_customer_ID,ENTERPRISE_NAME,BUSINESS_ADDRESS,CITY,POST_OFFICE,DISTRICT,STATE,PIN_CODE,PHONE_NUMBER,MOBILE_NUMBER,EMAIL,PRESENT_BUSINESS_ACTIVITY,PROPOSED_BUSINESS_ACTIVITY,START_DATE,TYPE_OF_COMPANY,BUSINESS_PREMISES_TYPE,GST_EXIST,GST_NUMBER,REGISTERED_OFFICE,NUMBER_OF_EMPLOYEE,REGISTERED_UNIT,DATE_CREATED,DATE_MODIFIED) values (1,1110,'Info Solution Pvt Ltd','PLOT 31313 PHASE 7, Mohali','MOHALI','PHASE 7','MOHALI','PUNJAB','160061','9888898888','9888898888','varun007@gmail.com','Growing','Growing',CURRENT_TIMESTAMP,'Pvt Ltd','IT',1,'GSTN0000151','sample desc','100','80',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_customer_dependent (ID,LOAN_customer_ID,NAME,RELATION,AGE,BUSINESS,INCOME,MOBILE_NUMBER,LIVING_STATUS,DATE_CREATED,DATE_MODIFIED) values (1,1110,'Amit','Brother','45','Job','500000','9888898888','Active',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_application_comment (ID,LOAN_ID,LOAN_STATUS,COMMENTS,COMMENT_BY_USER,DATE_OF_COMMENT,DATE_CREATED,DATE_MODIFIED) values (1,1110,'In Progress','Verification Pending',101,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.APPLICATION_LOAN_DETAIL (ID,LOAN_ID,LOAN_TYPE_ID,LOAN_AMOUNT,LOAN_TERM,LOAN_OBJECTIVE,DATE_CREATED,DATE_MODIFIED) values (1,1110,1,10000,12,'for shop ext',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_customer_partner_detail (ID,LOAN_CUSTOMER_ID,PARTNER_NAME,PARTNER_GURDIAN_NAME,DATE_OF_BIRTH,GENDER,QUALIFICATION,YEARS_OF_EXPERIENCE,TYPE_OF_ACCOMODATION,CAST,RELIGION,MOBILE_NUMBER,PAN_NUMBER,AADHAR_NUMBER,VOTER_CARD_NO,DIN_NUMBER,DATE_CREATED,DATE_MODIFIED) values (1,1110,'Nitin','Jeet Ram',CURRENT_TIMESTAMP,'M','MBA',15,'Accommodation1','Sharma','Hindu','9888898888','HDB75675S',1313315946,'VT5454','DIN4569',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_customer_loan_detail (ID,LOAN_CUSTOMER_ID,TYPE_OF_LOAN,LOAN_COMPANY_NAME,PURPOSE,LOAN_AMOUNT,BALANCE_LOAN_AMOUNT,LOAN_TERM,LOAN_INTEREST_RATE,LOAN_START_DATE,LOAN_EMI_AMOUNT,LOAN_EMI_TYPE,LOAN_SECURITY,LOAN_AGREEMENT_INCORPORATED,PRESENT_LOAN_STATUS,DATE_CREATED,DATE_MODIFIED) values (1,1110,'1','SBI','Home Loan',1000000,1000000,'Desc Req',9,CURRENT_TIMESTAMP,10100,'EMI_TYPE1','Company Docs','Desc Req','On going',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_application_customer_document (ID,LOAN_CUSTOMER_ID,DOCUMENT_NAME,DOCUMENT_IMAGE,DATE_CREATED,DATE_MODIFIED) values (1,1110,'PAN','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

Insert into KASHICAPITAL.loan_customer_bank_detail (ID,LOAN_CUSTOMER_ID,BANK_ACCOUNT_TYPE,BANK_NAME,BANK_BRANCH_NUMBER,ACCOUNT_NUMBER,ACCOUNT_START_DATE,DEPOSIT_AMOUNT,DATE_CREATED,DATE_MODIFIED) values (1,1110,'Saving','SBI','SBIN00013','105150215025',CURRENT_TIMESTAMP,800000,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO KASHICAPITAL.loan_customer_asset (ID, LOAN_CUSTOMER_ID, ASSET_TYPE, CUSTOMER_ASSET_TYPE_ID, ASSET_QUANTITY, ASSET_COST, ASSET_DESCRIPTION, TOTAL_BUSINESS_ASSET, TOTAL_HOME_ASSET,DATE_CREATED,DATE_MODIFIED) VALUES ('1', '1110', 'AST1', '1', '2', '500000', 'Home land', '0', '2',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO KASHICAPITAL.LOAN_CUSTOMER_PARTNER_FIRM (ID, LOAN_CUSTOMER_ID, PARTNER_FIRM_NAME,FIRM_ADDRESS,PARTNER_FIRM_BANK_NAME,PARTNER_FIRM_BUSINESS_NATURE,DATE_CREATED,DATE_MODIFIED) VALUES ('1', '1110', 'kashi finance', 'Gomti nagar lucknow', 'ICICI', 'giving loan',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
