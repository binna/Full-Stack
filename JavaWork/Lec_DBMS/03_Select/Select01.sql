-- dual 은 ROW 1개 짜리 dummy TABLE;
SELECT 'abcde' FROM dual;
SELECT '안녕하세요' FROM dual;
SELECT 100 FROM dual;
SELECT 100 + 10 FROM dual;

-- * : '모든 컬럼'
SELECT * FROM t_emp;

-- 원하는 컬럼만 조회
SELECT EMPNO , ENAME 
FROM T_EMP;

SELECT * FROM T_PROFESSOR;
SELECT name FROM T_PROFESSOR;
SELECT bonus FROM T_PROFESSOR;
SELECT '안녕하세요' FROM T_PROFESSOR;

SELECT name, '교수님 사랑해요' FROM T_PROFESSOR;

-- 컬럼 별명(alias) 사용한 출력
SELECT studno 학번, name 이름
FROM T_STUDENT;

SELECT studno "학번", name AS 이름
FROM T_STUDENT;

SELECT studno "학생 학번", name AS 이름
FROM T_STUDENT;

-- t_emp 테이블에서  empno를 사원번호, ename을 사원명, job을 직업으로 별명을 설정하여 출력
SELECT * FROM T_EMP;
SELECT empno 사원번호, ename 사원명, job 직업
FROM T_EMP;

-- t_dept 테이블을 사용하여 deptno를 ‘부서#’, dname을 ‘부서명’, loc를 ‘위치’ 로 별명을 설정하여 출력
SELECT * FROM T_DEPT;
SELECT deptno 부서#, dname 부서명, loc 위치
FROM T_DEPT;

-- DISTINCT : 중복값 제거하고 출력
SELECT * FROM t_emp;
SELECT deptno FROM T_EMP;
SELECT DISTINCT deptno FROM t_emp;

-- 학생테이블(t_student) 에서 제1전공 (deptno1) 을 중복값을 제거하여 출력해보기
SELECT * FROM T_STUDENT;
SELECT DISTINCT deptno1 FROM T_STUDENT;

--직원(t_emp) 들의 직책(job) 을 중복값 제거하여 출력해보기
SELECT DISTINCT job FROM t_emp;

-- || : 필드, 문자열 연결 연산
SELECT name, POSITION 
FROM T_PROFESSOR;

SELECT name || '-' || position 
FROM t_professor;

-- 학생테이블(t_student)를 사용하여 모든 학생들이 ‘서진수의 키는 180cm, 몸무게는 55kg 입니다’ 와 
-- 같은 형식으로 출력되도록 문자를 추가하고, 칼럼 이름은 ‘학생의 키와 몸무게’ 라는 별명으로 출력하세요
SELECT * FROM T_STUDENT;
SELECT name, height, weight
FROM T_STUDENT;
SELECT name || '의 키는 ' || height || ', 몸무게는 ' || weight || 'kg 입니다.' "학생의 키와 몸무게"
FROM T_STUDENT;