-- INITCAP() 함수 : 첫 문자 대문자로 바꾸어 출력
SELECT INITCAP('pretty girl') 
FROM dual;

-- 학생 테이블(t_student)에서 제1전공(deptno1)이 
-- 201번인 학생들의 id를 첫 글자만 대문자로 출력
-- 별칭은 “ID” 로 출력
SELECT id, INITCAP(id) id  
FROM t_student 
WHERE deptno1 = 201;


-- LOWER(), UPPER() 함수

-- t_student 테이블 : 1전공(deptno1)이 
-- 201번인 학생들의 id를 이름과 함께 소문자, 대문자로 출력
SELECT name, id, UPPER(id) 대문자, LOWER(id) 소문자 
FROM t_student
WHERE deptno1 = 201;


-- LENGTH() /LENGTHB() 함수

-- t_student 테이블 : ID가 9글자 이상인 학생들의 이름과 ID와 글자수 출력
SELECT name, id, LENGTH(id) 글자수
FROM t_student
WHERE LENGTH(id) >= 9;	-- 단일행 함수는 WHERE 조건절에서 사용 가능!

-- t_student 테이블 : 1전공이 201번인 학생들의 이름과 이름의 글자수, 
-- 이름의 바이트 수를 출력하세요
SELECT name 이름, LENGTH(name) 길이, LENGTHB(name) 바이트 
FROM t_student;


-- CONCAT 함수 ( || 연산자와 동일 )

-- t_professor 테이블 : 101번 학과 (deptno)의 교수들의 
-- 이름(name)과 직급(position)을 하나의 컬럼으로 출력하세요.  
-- 컬럼명은 "교수님명단"
SELECT concat(name, POSITION) 교수님명단
FROM t_professor
WHERE deptno = 101;


-- SUBSTR 함수 : 문자열에서 특정 길이의 문자를 추출 
SELECT SUBSTR('ABCDE', 2, 3)	-- 두번째 문자열부터 3개의 문자를 추출 
FROM dual;						-- 'BCD' 문자열 인덱스 1부터 시작

SELECT SUBSTR('abcde', 20, 3)	-- null 값 출력, 에러 아님 
FROM dual;

SELECT SUBSTR('ABCDE', -2, 2)
FROM dual;

-- t_student 테이블 : jumin 칼럼을 사용해서 1전공(deptno1)이 
-- 101번인 학생의 이름과 생년월일 출력
SELECT name 이름, SUBSTR(jumin, 1, 6) 생년월일 
FROM t_student
WHERE deptno1 = 101;

-- t_student 테이블 : jumin 칼럼을 사용해서  태어난 달이 8월인 
-- 사람의 이름과 생년월일을 출력하세요
SELECT name 이름, SUBSTR(jumin, 1, 6) 생년월일 
FROM t_student
--WHERE SUBSTR(jumin, 3, 2) = '08';
WHERE jumin LIKE '__08%';

-- t_student 테이블 : 4학년 학생들중 ‘여학생’들의 
-- 이름과 주민번호 출력
SELECT name, jumin
FROM t_student
WHERE grade = 4 AND SUBSTR(jumin, 7, 1) = '2';


-- 2020. 04. 08
-- INSTR() 함수
SELECT INSTR('A*B*C*', '*', 1, 1) FROM dual;	-- 2
SELECT INSTR('A*B*C*', '*', 1, 2) FROM dual;	-- 4
SELECT INSTR('A*B*C*', '*', 3, 2) FROM dual;	-- 6
-- 음수 인덱스의 경우 검색도 음의 방향으로 진행
SELECT INSTR('A*B*C*', '*', -4, 1) FROM dual;	-- 2
-- 없으면 0 리턴  
SELECT INSTR('A*B*C*', '*', -4, 2) FROM dual;	-- 0  
SELECT INSTR('A*B*C*', '*', -2, 2) FROM dual;	-- 2  

-- t_student 테이블 : tel 칼럼을 사용하여 101번 학과(deptno1)의 
-- 학생의 이름과 전화번호, ‘)’ 가 나오는 위치 출력 
--SELECT name, tel, INSTR(tel, ')', 1, 1) AS 위치 
SELECT name, tel, INSTR(tel, ')') AS 위치 
FROM t_student
WHERE deptno1 = 101;

-- t_student 테이블 : 1전공이 101 인 학생의 이름과 전화번호, 
-- 지역번호를 출력하세요. 지역번호는 숫자만!  / substr(), instr() 사용
SELECT name, tel, SUBSTR(tel, 1, INSTR(tel, ')')- 1) 지역변수
FROM t_student
WHERE deptno1 = 101;


-- LTRIM(), RTRIM(), TRIM 함수
SELECT 
	LTRIM('슈퍼슈퍼슈가맨', '슈퍼') LTRIM, 
	LTRIM('슈퍼슈퍼슈가맨', '슈') LTRIM, 
	'      슈퍼슈가맨',
	LTRIM('      슈퍼슈가맨', ' ') LTRIM, 
	LTRIM('      슈퍼슈가맨') LTRIM,	-- 디폴트로 '공백' 제거
	RTRIM('우측 공백 제거      ') RTRIM,
	TRIM('       슈퍼맨              ') TRIM,	-- 좌우 공백 제거
	LTRIM('******10000', '*') 
FROM dual;

-- p_dept2 테이블에서 부서명(dname) 을 출력하되 
-- 오른쪽 끝에 ‘부’ 라는 글자는 제거하고 출력하세요.
SELECT * FROM t_dept2;

SELECT dname, RTRIM(dname, '부') RTRIM예제 
FROM t_dept2;

-- REPLACE 함수
SELECT REPLACE('슈퍼맨 슈퍼걸', '슈퍼', '파워') REPLACE
FROM dual;

SELECT REPLACE('아버지가 방에 들어간다', ' ', '')
FROM dual;

-- t_student 테이블에서 102번 학과(deptno1) 의 학생들의 이름을 출력하되 
-- 성 부분은 ‘#’  으로 표시되게 출력하세요 / replace() , substr()사용 
SELECT name, REPLACE(name, SUBSTR(name, 1, 1), '#') 학생
FROM t_student
WHERE deptno1 = 102;


-- t_student 테이블에서 101번 학과(deptno1)의 학생들의 이름을 
-- 출력하되 가운데 글자만 ‘#’으로 표시되게 출력하세요 / replace() , substr()사용
SELECT name, REPLACE(name, SUBSTR(name, 2, 1), '#') 학생
FROM t_student
WHERE deptno1 = 101;


-- t_student 테이블에서 1전공(deptno1)이 101번인 학생들의 
-- 이름과 주민등록번호를 출력하되 주민등록번호의 뒤 7자리는 ‘*’ 로 표시되게 출력
SELECT name, jumin, REPLACE(jumin, SUBSTR(jumin, 7, 7), '*******') 주민번호
FROM t_student
WHERE deptno1 = 101;


-- t_student 테이블에서 다음과 같이 1전공(deptno1)이 102번인 
-- 학생들의 이름(name)과 전화번호(tel), 전화번호에서 국번 부분만 ‘#’ 처리하여 출력하세요.
-- 단 모든 국번은 3자리로 간주합니다. replace() / substr() / instr() 사용
SELECT name, tel, REPLACE(tel, SUBSTR(tel, instr(tel, ')', 1) + 1, 3), '###') 전화번호
FROM t_student
WHERE deptno1 = 102;





































