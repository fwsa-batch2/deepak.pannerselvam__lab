#BMW_SHOWROOM

CREATE DATABASES 'SHOWROOM'
```
CREATE DATABASES SHOWROOM;
```
CREATION OF TABLE 01-'USER'
```
CREATE TABLE USERS(USER_ID INT(10) PRIMARY KEY,NAME VARCHAR(25),PASSWORD VARCHAR(25),CONFIRM_PASSWORD VARCHAR(25),NUMBER BIGINT(10));
```
DESC USER;

| Field            | Type        | Null | Key | Default | Extra |
|:--:|:--:|:--:|:--:|:--:|:--:|
| USER_ID          | int         | NO   | PRI | NULL    |       |
| NAME             | varchar(25) | YES  |     | NULL    |       |
| PASSWORD         | varchar(25) | YES  |     | NULL    |       |
| CONFIRM_PASSWORD | varchar(25) | YES  |     | NULL    |       |
| NUMBER           | bigint      | YES  |     | NULL    |       |


INSERTION OF RECORDS INTO 'USER' TABLE
```
INSERT INTO USERS VALUES(0001,'DEEPAK_PANNER','DEEPAK@123','DEEPAK@123',8925003062);
```
```
INSERT INTO USERS VALUES(0003,'SARAVAN','SARAVAN@123','SARAVAN@123',8925003063);
```
INSERT INTO USERS VALUES(0004,'KICTHICK','KARTHICK@123','KARTHICK@123',8925003064);
```
Fetching the data from 'users' table
```
SELECT * FROM USERS;
```

| USER_ID | NAME          | PASSWORD     | CONFIRM_PASSWORD | NUMBER     |
|:--:|:--:|:--:|:--:|:--:|:--:|
|       1 | DEEPAK_PANNER | DEEPAK@123   | DEEPAK@123       | 8925003062 |
|       2 | SATHISH       | SATHISH@123  | SATHISH@123      | 8925003061 |
|       3 | SARAVAN       | SARAVAN@123  | SARAVAN@123      | 8925003063 |
|       4 | KICTHICK      | KARTHICK@123 | KARTHICK@123     | 8925003064 |
|       5 | NAVIN         | NAVIN@123    | NAVIN@123        | 8925003065 
|
Creation of table 2 - 'user_contacts'
```
CREATE TABLE CUSTOMER(FRIST_NAME VARCHAR(25),LAST_NAME VARCHAR(25),CUSTOMER_ID INT(10) PRIMARY KEY,EMAIL_ID VARCHAR(25),PASSWORD VARCHAR(25));
```
DESC  CUSTOMER;

| Field       | Type        | Null | Key | Default | Extra |
|:--:|:--:|:--:|:--:|:--:|:--:|
| FRIST_NAME  | varchar(25) | YES  |     | NULL    |       |
| LAST_NAME   | varchar(25) | YES  |     | NULL    |       |
| CUSTOMER_ID | int         | NO   | PRI | NULL    |       |
| EMAIL_ID    | varchar(25) | YES  |     | NULL    |       |
| PASSWORD    | varchar(25) | YES  |     | NULL    |       |
