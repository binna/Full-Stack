
/* Drop Tables */

DROP TABLE takeAclass CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE professor CASCADE CONSTRAINTS;
DROP TABLE student CASCADE CONSTRAINTS;
DROP TABLE department CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE department
(
	deptno number NOT NULL,
	phonenum varchar2(10) NOT NULL,
	office varchar2(10) NOT NULL,
	name varchar2(10) NOT NULL,
	PRIMARY KEY (deptno)
);


CREATE TABLE lecture
(
	lectno number NOT NULL,
	name varchar2(10) NOT NULL,
	creditnum number NOT NULL,
	num number NOT NULL,
	class varchar2(10) NOT NULL,
	years number NOT NULL,
	profno number NOT NULL,
	PRIMARY KEY (lectno)
);


CREATE TABLE professor
(
	profno number NOT NULL,
	jumin varchar2(13) NOT NULL,
	address varchar2(20) NOT NULL,
	name varchar2(10) NOT NULL,
	position varchar2(10) NOT NULL,
	phonenum varchar2(15) NOT NULL,
	years number NOT NULL,
	deptno number NOT NULL,
	PRIMARY KEY (profno)
);


CREATE TABLE student
(
	studno number NOT NULL,
	jumin varchar2(13) NOT NULL,
	name varchar2(10) NOT NULL,
	grade number NOT NULL,
	pnonenum varchar2(15) NOT NULL,
	address varchar2(20) NOT NULL,
	deptno number NOT NULL,
	PRIMARY KEY (studno)
);


CREATE TABLE takeAclass
(
	studno number NOT NULL,
	lectno number NOT NULL
);



/* Create Foreign Keys */

ALTER TABLE professor
	ADD FOREIGN KEY (deptno)
	REFERENCES department (deptno)
;


ALTER TABLE student
	ADD FOREIGN KEY (deptno)
	REFERENCES department (deptno)
;


ALTER TABLE takeAclass
	ADD FOREIGN KEY (lectno)
	REFERENCES lecture (lectno)
;


ALTER TABLE lecture
	ADD FOREIGN KEY (profno)
	REFERENCES professor (profno)
;


ALTER TABLE takeAclass
	ADD FOREIGN KEY (studno)
	REFERENCES student (studno)
;



