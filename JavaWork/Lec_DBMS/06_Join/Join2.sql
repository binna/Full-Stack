-- 비등가 조인(Non-Equi Join)

SELECT * FROM t_customer;
SELECT * FROM t_gift;

-- t_customer 테이블, t_gift 테이블을 join하여  
-- 고객의 마일리지 포인트별로 받을수 있는 상품을 조회하여 
-- 고객의 이름(c_name)과 포인트(c_point), 상품명(g_name)을 출력하세요
-- BETWEEN ~ AND ~ 사용

-- Oracle 방식
SELECT c.c_name 고객명, c.c_point POINT, g.g_name 상품명
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end;

-- ANSI 방식
SELECT c.c_name 고객명, c.c_point POINT, g.g_name 상품명
FROM t_customer c JOIN t_gift g
	ON c.c_point BETWEEN g.g_start AND g.g_end;

-- 앞 예제에서 조회한 상품의 
-- 이름(g_name)과  필요수량이 몇개인지 조회
-- (그룹함수 동원되어야 한다)

-- Oracle 방식
SELECT g.g_name 상품명, COUNT(*) 필요수량
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end
GROUP BY g.g_name;

-- ANSI 방식
SELECT g.g_name 상품명, COUNT(*) 필요수량
FROM t_customer c JOIN t_gift g
	ON c.c_point BETWEEN g.g_start AND g.g_end
GROUP BY g.g_name;

-- t_student 테이블과 t_exam01 시험성적 테이블, 
-- t_credit 학점 테이블을 조회하여  학생들의 이름과 점수와 학점을 출력하세요
SELECT * FROM t_student;
SELECT * FROM t_exam01;
SELECT * FROM t_credit;

-- Oracle 방식
SELECT s.name 학생이름, e.total 점수, c.grade 학점
FROM t_student s, t_exam01 e, t_credit c
WHERE s.studno = e.studno AND e.total BETWEEN c.min_point AND c.max_point;

-- ANSI 방식
SELECT s.name 학생이름, e.total 점수, c.grade 학점
FROM t_student s 
	JOIN t_exam01 e ON s.studno = e.studno
	JOIN t_credit c ON e.total BETWEEN c.min_point AND c.max_point;

-- t_customer 와 t_gift 테이블 join : 자기 포인트(c_point)보다 
-- 낮은 포인트의 상품 중 한가지를 선택할수 있다고 할때 '산악용자전거'를 
-- 선택할 수 있는 고객명(c_name)과 포인트(c_point), 상품명(g_name)을 출력하세요
SELECT * FROM t_gift;

-- Oracle 방식
SELECT c.c_name 고객명, c.c_point 뽀인트, g.g_name 상품명
FROM t_customer c, t_gift g
WHERE c.c_point >= g.g_start AND g.g_name = '산악용자전거';

-- ANSI 방식
-- 일반 조건문은 WHERE, AND 둘 다 사용 가능함
SELECT c.c_name 고객명, c.c_point 뽀인트, g.g_name 상품명
FROM t_customer c JOIN t_gift g
	ON c.c_point >= g.g_start 
	WHERE g.g_name = '산악용자전거';

SELECT c.c_name 고객명, c.c_point 뽀인트, g.g_name 상품명
FROM t_customer c JOIN t_gift g
	ON c.c_point >= g.g_start 
	AND g.g_name = '산악용자전거';

-- t_emp2, t_post 테이블 사용하여
-- 사원들의 이름(name)과 나이, 현재직급(post), ‘예상직급’을 출력하세요. 
-- ‘예상직급’은 나이로 계산하며 해당 나이가 받아야 하는 직급을 의미합니다. 
-- 나이는 오늘(SYSDATE)을 기준으로 하되 소수점 이하는 절삭하여 계산하세요
-- t_emp2 의 직급(post) 은 null 허용함에 주의)
-- 나이계산은 어떻게? (현재연도 - 생년월일연도) + 1, 
-- SYSDATE, TO_CHAR() 사용
SELECT * FROM t_emp2;
SELECT * FROM t_post;

-- Oracle 방식
SELECT 
	e.name 이름, 
	(TO_CHAR(SYSDATE, 'YYYY') - TO_CHAR(e.birthday, 'YYYY') + 1) "현재나이",
	NVL(e.post, ' ') "현재직급", p.post "예상직급"
FROM t_emp2 e, t_post p
WHERE (TO_CHAR(SYSDATE, 'YYYY') - TO_CHAR(e.birthday, 'YYYY') + 1)
BETWEEN p.S_AGE AND p.E_AGE;

-- ANSI 방식
SELECT e.name "이름", 
	(TO_CHAR(SYSDATE, 'YYYY') - TO_CHAR(e.birthday, 'YYYY') + 1) "현재나이",
	NVL(e.post, ' ') "현재직급", p.post "예상직급"
FROM t_emp2 e INNER JOIN t_post p
	ON (TO_CHAR(SYSDATE, 'YYYY') - TO_CHAR(e.birthday, 'YYYY') + 1)
	BETWEEN p.S_AGE AND p.E_AGE ;


-- OUTER Join (아우터 조인) : Oracle 방식은 없어..!!!
-- (ANSI 구문 only) 

-- t_student 테이블과 t_professor 테이블 Join 하여 
-- 학생이름과 지도교수 이름을 출력하세요. 
-- 단! 지도교수가 결정되지 않은 학생의 명단도 함께 출력하세요
-- 기존의 INNER Join 방식으로 먼저 만들어 보고
-- OUTER Join 을 해보고 비교해보자
SELECT s.name 학생이름, p.name 교수이름
FROM t_student s LEFT OUTER JOIN t_professor p
	ON s.profno = p.profno;

SELECT s.name 학생이름, p.name 교수이름
FROM t_student s RIGHT OUTER JOIN t_professor p
	ON s.profno = p.profno;

-- t_student, t_professor 테이블 join :  
-- 학생이름과 지도교수 이름을 출력, 
-- 단! 지도 학생이 결정되지 않은 교수 명단도 출력
SELECT s.name 학생이름, p.name 교수이름
FROM t_student s FULL OUTER JOIN t_professor p
	ON s.profno = p.profno;

-- t_student, t_professor 테이블 join :  
-- 학생이름과 지도교수 이름을 출력, 
-- 단! 지도 학생이 결정되지 않은 교수 명단, 
-- 지도교수가 결정되지 않은 학생명단 모두 출력

-- ** ORACLE 에는 FULL OUTER 가 있는데 MySql 에는 없다..  
-- UNION 과 조합해야 함

SELECT s.name "학생이름", p.name "교수이름"
FROM t_student s FULL OUTER JOIN t_professor p
	ON s.profno = p.PROFNO;


-- SELF Join
-- 만약 원하는 데이터가 하나의 테이블에 다 들어 있을때 사용...!!

-- t_dept2 테이블에서 부서명 과 그 부서의 상위부서명을 출력하세요

-- Oracle 방식
SELECT d1.dname 부서명, d2.dname 상위부서명
FROM t_dept2 d1, t_dept2 d2
WHERE d1.pdept = d2.dcode;

-- ANSI 방식
SELECT d1.dname 부서명, d2.dname 상위부서명
FROM t_dept2 d1 JOIN t_dept2 d2
ON d1.pdept = d2.dcode;

-- t_professor 테이블 : 교수번호, 교수이름, 입사일, 
-- 그리고 자신보다 입사일 빠른 사람의 인원수를 출력하세요, 
-- 단 자신보다 입사일이 빠른 사람수를 오름차순으로 출력하세요
-- hint: left outer 사용 / 그룹함수 사용
-- left outer 사용해야하는 이유는 조인형 교수님 때문임..!!
SELECT * FROM t_professor;

SELECT
	a.profno "교수번호", a.name "교수명", a.HIREDATE "입사일",
	count(b.hiredate) "빠른분들"
FROM
	t_professor a LEFT OUTER JOIN t_professor b
	ON b.HIREDATE < a.HIREDATE 
GROUP BY 
	a.profno, a.name, a.HIREDATE
ORDER BY 4;













































