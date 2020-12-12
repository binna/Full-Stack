CREATE VIEW v_prof
AS 
SELECT profno, name, email, hpage
FROM t_professor;

SELECT * FROM v_prof;

SELECT tname FROM tab;	-- VIEW 확인 가능..!!

-- OR REPLACE 는 혹시 이전에 같은 이름의 view 가 있으면 삭제하고 새로 만들라는 의미
CREATE OR REPLACE VIEW v_prof
AS 
SELECT profno, name, email, hpage
FROM t_professor;

SELECT * FROM v_prof;

-- VIEW 생성시 별도의 컬럼 이름을 지정해 줄 수 있다
CREATE OR REPLACE VIEW v_prof(pfno, nm, em, hp)
AS 
SELECT profno, name, email, hpage
FROM t_professor;

SELECT * FROM v_prof;

-- t_professor, t_department 테이블을 join 하여
-- 교수번호와 교수이름과 소속학과 이름을 조회하는 view 를 생성하세요.  
-- (이름: v_prof_dept)
SELECT * FROM t_professor;
SELECT * FROM t_department;

CREATE OR REPLACE VIEW v_prof_dept
AS 
SELECT p.profno "교수번호", p.name "교수명", d.DNAME "소속학과명"
FROM t_professor p, t_department d
WHERE p.deptno = d.deptno;
-- 확인
SELECT * FROM v_prof_dept;

-- t_student, t_department 테이블 : 
-- 학과별로 학생들의 최대키와 최대몸무게, 학과 이름을 출력하세요
SELECT * FROM t_student;
SELECT * FROM t_department;

SELECT 
	d.dname "학과명", 
	s.max_height "최대키", 
	s.max_weight "최대몸무게"
FROM 
	(SELECT deptno1, MAX(height) max_height, MAX(weight) max_weight
	FROM t_student
	GROUP BY deptno1 ) s , 
	t_department d
WHERE 
	s.deptno1 = d.deptno;

-- t_student, t_department 테이블 : 
-- 학과별(deptno1)로 가장 키가 큰 학생들의 이름과 키, 학과이름을 
-- 인라인뷰 를 사용하여 다음과 같이 출력하세요
SELECT * FROM t_student;
SELECT * FROM t_department;

SELECT 
	d.dname "학과명", a.max_height "최대키", s.name "학생이름", s.height "키"
FROM 
	(SELECT deptno1, MAX(height) max_height FROM t_student GROUP BY deptno1) a,
	t_student s, t_department d
WHERE 
	s.deptno1 = a.deptno1 AND s.height = a.max_height
	AND s.deptno1 = d.deptno;

-- t_student 테이블 : 
-- 학생의 키가 동일 학년의 평균 키보다 큰 학생들의 학년과 이름과 키, .
-- 해당 학년의 평균키를 출력하되, inline view 를 사용해서 아래와 같이 출력하세요.
-- 단 학년 칼럼은 오름 차순으로 정렬.
SELECT * FROM t_student;

SELECT 
	s.grade "학년", s.name "이름", s.height "키", a.avg_height "평균키"
FROM 
	(SELECT grade, AVG(height) avg_height FROM t_student GROUP BY grade) a,
	t_student s
WHERE 
	a.grade = s.grade AND s.height > a.avg_height
ORDER BY 1;