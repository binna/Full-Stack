
/* Drop Tables */

DROP TABLE phonebook CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE phonebook
(
	pb_uid number NOT NULL,
	pb_name varchar2(40) NOT NULL,
	pb_phonenum varchar2(40),
	pb_memo clob,
	pb_regdate date DEFAULT SYSDATE,
	PRIMARY KEY (pb_uid)
);




-- 시퀀스 객체도 생성하자
DROP SEQUENCE phonebook_seq;
CREATE SEQUENCE phonebook_seq;

SELECT * FROM phonebook;
SELECT COUNT(*) FROM phonebook;




SELECT COUNT(*) cnt FROM test_member;	-- 테이블의 모든 레코드 개수 
SELECT MAX(mb_no) "MAX" FROM test_member;	-- mb_no 의 최대값
SELECT MIN(mb_no) "MIN" FROM test_member;	-- mb_no 의 최소값




SELECT COUNT(*) cnt FROM phonebook;
SELECT * FROM phonebook ORDER BY pb_uid DESC;
SELECT * FROM phonebook WHERE pb_uid = 3;
SELECT MAX(pb_uid) uid_max FROM phonebook;


