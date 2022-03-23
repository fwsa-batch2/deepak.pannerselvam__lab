#  BMW_SHOWROOM

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
```
INSERT INTO USERS VALUES(0004,'KICTHICK','KARTHICK@123','KARTHICK@123',8925003064);
```
Fetching the data from 'users' table
```
SELECT * FROM USER;
```

| USER_ID | NAME          | PASSWORD     | CONFIRM_PASSWORD | NUMBER     |
|---------|---------------|--------------|------------------|------------|
|       1 | DEEPAK_PANNER | DEEPAK@123   | DEEPAK@123       | 8925003062 |
|       2 | SATHISH       | SATHISH@123  | SATHISH@123      | 8925003061 |
|       3 | SARAVAN       | SARAVAN@123  | SARAVAN@123      | 8925003063 |
|       4 | KICTHICK      | KARTHICK@123 | KARTHICK@123     | 8925003064 |
|       5 | NAVIN         | NAVIN@123    | NAVIN@123        | 8925003065 |



Creation of table 2 - 'CUSTOMER'
```
 CREATE TABLE CUSTOMER(FRIST_NAME VARCHAR(25),LAST_NAME VARCHAR(25),CUSTOMER_ID INT(10) PRIMARY KEY,EMAIL_ID VARCHAR(25),PASSWORD VARCHAR(25));
```
DESC CUSTOMER;


| Field       | Type        | Null | Key | Default | Extra |
|-------------|-------------|------|-----|---------|-------|
| FRIST_NAME  | varchar(25) | YES  |     | NULL    |       |
| LAST_NAME   | varchar(25) | YES  |     | NULL    |       |
| CUSTOMER_ID | int         | NO   | PRI | NULL    |       |
| EMAIL_ID    | varchar(25) | YES  |     | NULL    |       |
| PASSWORD    | varchar(25) | YES  |     | NULL    |       |


INSERTION OF RECORDS INTO 'CUSTOMER' TABLE
```
 INSERT INTO CUSTOMER VALUES('DEEPAK','PANNER',0001,'DEEPAKTHIRUP@GMAIL','DEEPAK@123');
```
```
INSERT INTO CUSTOMER VALUES('SATHISH','KUMER',0002,'HIGHTSATHISH@GMAIL','SATHISH@123');
```
```
 INSERT INTO CUSTOMER VALUES('SARAVAN','KUMER',0003,'SARAVAN@GMAIL','SARAVAN@123');
```
```
SELECT *FROM CUSTOMER;
```
| FRIST_NAME | LAST_NAME | CUSTOMER_ID | EMAIL_ID           | PASSWORD     |
|------------|-----------|-------------|--------------------|--------------|
| DEEPAK     | PANNER    |           1 | DEEPAKTHIRUP@GMAIL | DEEPAK@123   |
| SATHISH    | KUMER     |           2 | HIGHTSATHISH@GMAIL | SATHISH@123  |
| SARAVAN    | KUMER     |           3 | SARAVAN@GMAIL      | SARAVAN@123  |
| KARTHICK   | KUMER     |           4 | KARTHICK@GMAIL     | KARTHICK@123 |
| NAVIN      | KUMER     |           5 | NAVIN@GMAIL        | NAVIN@123    |


Creation of table 03 - 'DEALER'
```
 CREATE TABLE DEALER(DEALER_ID INT(10) PRIMARY KEY,USER_ID INT(10),FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID),FIRST_NAME VARCHAR(25),LAST_NAME VARCHAR(25),PASSWORD VARCHAR(25),NUMBER BIGINT(10),ADDRESS TEXT);
```
DESC DEALER;


| Field      | Type        | Null | Key | Default | Extra |
|------------|-------------|------|-----|---------|-------|
| DEALER_ID  | int         | NO   | PRI | NULL    |       |
| USER_ID    | int         | YES  | MUL | NULL    |       |
| FIRST_NAME | varchar(25) | YES  |     | NULL    |       |
| LAST_NAME  | varchar(25) | YES  |     | NULL    |       |
| PASSWORD   | varchar(25) | YES  |     | NULL    |       |
| NUMBER     | bigint      | YES  |     | NULL    |       |
| ADDRESS    | text        | YES  |     | NULL    |       |

INSERTION OF RECORDS INTO 'DEALER' TABLE
```
INSERT INTO DEALER VALUES(0011,0001,'DEEPAK','PANNER','DEEPAK@123',8925003062,'CHENNAI');
```
```
 INSERT INTO DEALER VALUES(0012,0002,'SATHISH','KUMER','SATHISH@123',8925003061,'CHENNAI');
```
```
INSERT INTO DEALER VALUES(0013,0003,'SARAVAN','KUMER','SARAVAN@123',8925003063,'CHENNAI');
```
```
SELECT *FROM DEALER;
```
| DEALER_ID | USER_ID | FIRST_NAME | LAST_NAME | PASSWORD     | NUMBER     | ADDRESS |
|-----------|---------|------------|-----------|--------------|------------|---------|
|        11 |       1 | DEEPAK     | PANNER    | DEEPAK@123   | 8925003062 | CHENNAI |
|        12 |       2 | SATHISH    | KUMER     | SATHISH@123  | 8925003061 | CHENNAI |
|        13 |       3 | SARAVAN    | KUMER     | SARAVAN@123  | 8925003063 | CHENNAI |
|        14 |       4 | KARTHICK   | KUMER     | KARTHICK@123 | 8925003064 | CHENNAI |
|        15 |       5 | NAVIN      | KUMER     | NAVIN@123    | 8925003065 | CHENNAI |

Creation of table 04 - 'VEHICLE'
```
CREATE TABLE VEHICLE(VEH_NAME VARCHAR (25),VEH_MODEL VARCHAR(25),VEH_COST INT(50),VEH_ID INT(10) PRIMARY KEY,DEALER_ID INT(10),FOREIGN KEY(DEALER_ID) REFERENCES DEALER(DEALER_ID));
```
DESC VEHICLE;

| Field     | Type        | Null | Key | Default | Extra |
|-----------|-------------|------|-----|---------|-------|
| VEH_NAME  | varchar(25) | YES  |     | NULL    |       |
| VEH_MODEL | varchar(25) | YES  |     | NULL    |       |
| VEH_COST  | int         | YES  |     | NULL    |       |
| VEH_ID    | int         | NO   | PRI | NULL    |       |
| DEALER_ID | int         | YES  | MUL | NULL    |       |

INSERTION OF RECORDS INTO 'VEHICLE' TABLE
```
INSERT INTO VEHICLE VALUES('BMW','SERIES01',2000000,0021,11);
```
```
 INSERT INTO VEHICLE VALUES('BMW','SERIES02',3000000,0022,12);
```
```
INSERT INTO VEHICLE VALUES('BMW','SERIES03',4000000,0023,13);
```
```
SELECT *FROM VEHICLE;
```

| VEH_NAME | VEH_MODEL | VEH_COST | VEH_ID | DEALER_ID |
|----------|-----------|----------|--------|-----------|
| BMW      | SERIES01  |  2000000 |     21 |        11 |
| BMW      | SERIES02  |  3000000 |     22 |        12 |
| BMW      | SERIES03  |  4000000 |     23 |        13 |
| BMW      | SERIES04  |  5000000 |     24 |        14 |
| BMW      | SERIES05  |  6000000 |     25 |        15 |


Creation of table 05 - 'IMAGE'
```
CREATE TABLE IMAGE(IMG_ID INT(10),VEH_ID INT(10),FOREIGN KEY(VEH_ID) REFERENCES VEHICLE(VEH_ID),IMG_NAME VARCHAR(25),DEF_IMG INT);
```
DESC IMAGE;

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| IMG_ID   | int         | YES  |     | NULL    |       |
| VEH_ID   | int         | YES  | MUL | NULL    |       |
| IMG_NAME | varchar(25) | YES  |     | NULL    |       |
| DEF_IMG  | int         | YES  |     | NULL    |       |


INSERTION OF RECORDS INTO 'IMAGE' TABLE
```
INSERT INTO IMAGE VALUES(01,21,'BMW_RED',31);
```
```
INSERT INTO IMAGE VALUES(02,22,'BMW_YELLOW',32);
```
```
INSERT INTO IMAGE VALUES(03,23,'BMW_BLUE',33);
```
```
SELECT *FROM IMAGE;
```

| IMG_ID | VEH_ID | IMG_NAME   | DEF_IMG |
|--------|--------|------------|---------|
|      1 |     21 | BMW_RED    |      31 |
|      2 |     22 | BMW_YELLOW |      32 |
|      3 |     23 | BMW_BLUE   |      33 |
|      4 |     24 | BMW_BLACK  |      34 |
|      5 |     25 | BMW_WHITE  |      35 |


Creation of table 06 - 'SHOWROOM'
```
CREATE TABLE SHOWROOM(SHOW_ID INT(10) PRIMARY KEY,DEALER_ID INT(10),FOREIGN KEY(DEALER_ID) REFERENCES DEALER(DEALER_ID),CONACT BIGINT(10),ADDRESS TEXT,PINCODE INT(10));
```
DESC SHOWRROM;


| Field     | Type   | Null | Key | Default | Extra |
|-----------|--------|------|-----|---------|-------|
| SHOW_ID   | int    | NO   | PRI | NULL    |       |
| DEALER_ID | int    | YES  | MUL | NULL    |       |
| CONACT    | bigint | YES  |     | NULL    |       |
| ADDRESS   | text   | YES  |     | NULL    |       |
| PINCODE   | int    | YES  |     | NULL    |       |

INSERTION OF RECORDS INTO 'SHOWROOM' TABLE
```
INSERT INTO SHOWROOM VALUES(01,11,8925003062,'CHENNAI',600115);
```
```
INSERT INTO SHOWROOM VALUES(02,12,8925003061,'CHENNAI',600115);
```
```
INSERT INTO SHOWROOM VALUES(03,13,8925003063,'CHENNAI',600115);
```
Creation of table 07- 'TAX'
```
CREATE TABLE TAX(TAX_ID INT(10) PRIMARY KEY,TAX INT(10),STATUS VARCHAR(15));
```
DESC TAX;


| Field  | Type        | Null | Key | Default | Extra |
|--------|-------------|------|-----|---------|-------|
| TAX_ID | int         | NO   | PRI | NULL    |       |
| TAX    | int         | YES  |     | NULL    |       |
| STATUS | varchar(15) | YES  |     | NULL    |       |

INSERTION OF RECORDS INTO 'TAX' TABLE
```
 INSERT INTO TAX VALUES(1001,18.00,'HEIGHT');
```
```
INSERT INTO TAX VALUES(1002,16.00,'HEIGHT');
```
```
INSERT INTO TAX VALUES(1003,8.00,'LOW');
```
```
SELECT *FROM TAX;
```

| TAX_ID | TAX  | STATUS |
|--------|------|--------|
|   1001 |   18 | HIGHT  |
|   1002 |   16 | HEIGHT |
|   1003 |    8 | LOW    |
|   1004 |    6 | LOW    |
|   1005 |   17 | HIGHT  |

Creation of table 08- 'SALES'
```
CREATE TABLE SALES(SALES_ID INT(10) PRIMARY KEY,VEH_ID INT(10),FOREIGN KEY(VEH_ID) REFERENCES VEHICLE(VEH_ID),CUSTOMER_ID INT(10),FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),SHOW_ID INT(10),FOREIGN KEY(SHOW_ID) REFERENCES SHOWROOM (SHOW_ID),TAX_ID INT(10),FOREIGN KEY(TAX_ID) REFERENCES TAX(TAX_ID),ORD_DATE DATE,DEL_DATE DATE);
```
DESC SALES;


| Field       | Type | Null | Key | Default | Extra |
|-------------|------|------|-----|---------|-------|
| SALES_ID    | int  | NO   | PRI | NULL    |       |
| VEH_ID      | int  | YES  | MUL | NULL    |       |
| CUSTOMER_ID | int  | YES  | MUL | NULL    |       |
| SHOW_ID     | int  | YES  | MUL | NULL    |       |
| TAX_ID      | int  | YES  | MUL | NULL    |       |
| ORD_DATE    | date | YES  |     | NULL    |       |
| DEL_DATE    | date | YES  |     | NULL    |       |

INSERTION OF RECORDS INTO 'SALES' TABLE
```
INSERT INTO SALES VALUES(1,21,1,1,1001,'2021-03-12','2021-04-12');
```
```
INSERT INTO SALES VALUES(2,22,2,2,1002,'2021-03-15','2021-04-15');
```
```
INSERT INTO SALES VALUES(3,23,3,3,1003,'2021-03-22','2021-04-22');
```
```
INSERT INTO SALES VALUES(3424,4,4,1004,'2021-03-27','2021-04-27');
```
```
SELECT *FROM SALES;
```

| SALES_ID | VEH_ID | CUSTOMER_ID | SHOW_ID | TAX_ID | ORD_DATE   | DEL_DATE   |
|----------|--------|-------------|---------|--------|------------|------------|
|        1 |     21 |           1 |       1 |   1001 | 2021-03-12 | 2021-04-12 |
|        2 |     22 |           2 |       2 |   1002 | 2021-03-15 | 2021-04-15 |
|        3 |     23 |           3 |       3 |   1003 | 2021-03-22 | 2021-04-22 |
|        4 |     24 |           4 |       4 |   1004 | 2021-03-27 | 2021-04-27 |
|        5 |     25 |           5 |       5 |   1005 | 2021-03-30 | 2021-04-30 |


Creation of table 09- 'REVIEW'
```
 CREATE TABLE REVIEW(CUSTOMER_ID INT PRIMARY KEY,FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),RATING FLOAT CHECK(RATING<=5 AND RATING >=0),FEEDBACK VARCHAR(100));
 ```
 DESC REVIEW;
 
| Field       | Type         | Null | Key | Default | Extra |
|-------------|--------------|------|-----|---------|-------|
| CUSTOMER_ID | int          | NO   | PRI | NULL    |       |
| RATING      | float        | YES  |     | NULL    |       |
| FEEDBACK    | varchar(100) | YES  |     | NULL    |       |

INSERTION OF RECORDS INTO 'REVIEW' TABLE
```
INSERT INTO REVIEW VALUES(1,4.03,'REAL I FLAT GOOD WEB SITE FOR CAR');
```
```
 INSERT INTO REVIEW VALUES(2,4.00,'GOOD');
```
```
INSERT INTO REVIEW VALUES(3,3.00,'I LIKE A PAGE');
```
```
SELECT *FROM REVIEW;
```


| CUSTOMER_ID | RATING | FEEDBACK                          |
|-------------|--------|-----------------------------------|
|           1 |   4.03 | REAL I FLAT GOOD WEB SITE FOR CAR |
|           2 |      4 | GOOD                              |
|           3 |      3 | I LIKE A PAGE                     |
|           4 |      5 | I LOVE THIS                       |

![IMG_20220318_184711](https://user-images.githubusercontent.com/72603598/159658930-757cf649-0f2f-4634-8dde-5f31732d70ab.jpg)
