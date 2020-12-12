-- JOIN

-- 20 레코드
-- FORM 절에 테이블에도 별칭(alias)를 줄 수 있다!
SELECT s.studno, s.name, s.deptno1
FROM t_student s;

-- 12 레코드
SELECT d.deptno, d.dname
FROM t_department d;

-- 240 레코드
SELECT *
FROM t_student s, t_department d;

-- 240 레코드에 5개의 컬럼만 뽑아냄..!!
SELECT s.studno, s.name, s.deptno1,
	d.deptno, d.dname
FROM t_student s, t_department d;	-- Oracle 방식

SELECT s.studno, s.name, s.deptno1,
	d.deptno, d.dname
FROM t_student s
	CROSS JOIN t_department d;	-- ANSI 방식


-- 카티션곱 (Cartesian Product)
-- 두개의 테이블을 JOIN 하게 되면, 
-- 각 테이블의 레코드들의 모든 조합이 출력된다.
-- WHERE 나 ON 등으로 JOIN 조건이 주어지지 않으면 
-- 모든 카티션곱이 출력된다. 


-- Equi Join (등가 Join)
-- Oracle 방식
SELECT s.name "학생이름", s.deptno1 "학과번호", d.dname "학과이름"
FROM t_student s, t_department d
WHERE s.deptno1 = d.deptno;	-- 조건(Equi Join)

-- ANSI 방식
SELECT s.name "학생이름", s.deptno1 "학과번호", d.dname "학과이름"
FROM t_student s JOIN t_department d ON s.deptno1 = d.deptno;	-- 조건(Equi Join)

SELECT * FROM t_student;

-- 제2전공은?
SELECT s.name "학생이름", s.deptno2 "제2학과", d.dname "제2학과이름"
FROM t_student s, t_department d
WHERE s.deptno2 = d.deptno;

-- t_student 테이블, t_professor 테이블 을 join하여 
-- ‘학생이름’, ‘지도교수 번호’, ‘지도교수이름’ 을 출력하세요
SELECT * FROM t_student;
SELECT * FROM t_professor;

-- Oracle 방식
SELECT s.name "학생이름", p.profno "지도교수 번호", p.name "지도교수 이름"
FROM t_student s, t_professor p
WHERE s.profno = p.profno;	-- join 조건

-- ANSI 방식
-- JOIN하고 ON은 쌍으로 들어가야 함..!!
SELECT s.name "학생이름", p.profno "지도교수 번호", p.name "지도교수 이름"
FROM t_student s JOIN t_professor p 
	ON s.profno = p.profno;	-- join 조건

-- t_student, t_department, t_professor 테이블을 join하여 
-- 학생의 이름, 학과이름, 지도교수 이름 을 출력하세요
SELECT * FROM t_student;
SELECT * FROM t_department;
SELECT * FROM t_professor;

-- Oracle 방식
SELECT s.name "학생이름", d.dname "학과이름", p.name "교수이름"
FROM t_student s, t_department d, t_professor p
WHERE s.deptno1 = d.deptno AND s.profno = p.profno;

-- ANSI 방식
SELECT s.name "학생이름", d.dname "학과이름", p.name "교수이름"
FROM t_student s 
	JOIN t_department d ON s.deptno1 = d.deptno
	JOIN t_professor p ON s.profno = p.profno;

-- t_emp2 직원 테이블과 t_post 직급 테이블을 조회하여 
-- 사원의 이름과 직급, 현재연봉, 해당직급의 연봉의 하한금액(s_pay)과 
-- 상한금액(e_pay)을 출력하세요
SELECT * FROM t_emp2;
SELECT * FROM t_post;

-- Oracle 방식
SELECT 
	e.name 사원이름, e.post 현재직급, e.pay 현재연봉, 
	p.s_pay 하한금액, p.e_pay 상한금액
FROM t_emp2 e, t_post p
WHERE e.post = p.post;

-- ANSI 방식
SELECT 
	e.name 사원이름, e.post 현재직급, e.pay 현재연봉, 
	p.s_pay 하한금액, p.e_pay 상한금액
FROM t_emp2 e JOIN t_post p ON e.post = p.post;

-- t_student - t_professor 테이블 join 하여 제1전공(deptno1)이 
-- 101번인 학생들의 학생이름과 지도교수 이름을 출력하세요

-- Oracle 방식
SELECT s.name 학생이름, p.name 교수이름
FROM t_student s, t_professor p
WHERE s.profno = p.profno AND s.deptno1 = 101;

-- ANSI 방식
SELECT s.name 학생이름, p.name 교수이름
FROM t_student s JOIN t_professor p ON s.profno = p.profno 
WHERE s.deptno1 = 101;

-- JOIN 조건은 반드시 ON으로 해야하나 
-- 일반적인 조건은 WHERE을 써도 되고 ON 다음에 AND를 써도 된다
SELECT s.name 학생이름, p.name 교수이름
FROM t_student s JOIN t_professor p ON s.profno = p.profno 
AND s.deptno1 = 101;