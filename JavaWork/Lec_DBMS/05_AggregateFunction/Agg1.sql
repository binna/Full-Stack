SELECT * FROM t_professor;

-- 그룹함수에서는 NULL값은 계산에서 제외
SELECT COUNT(*), COUNT(hpage) FROM t_professor;
SELECT COUNT(bonus), SUM(bonus), AVG(bonus) FROM t_professor;
SELECT MAX(hiredate), MIN(hiredate) FROM t_emp;

-- null 허용 컬럼의 그룹함수 적용시
-- nvl, nvl2 사용해야 함
SELECT AVG(bonus), AVG(NVL(bonus, 0))
FROM t_professor;

-- ★★ 불가능하다! SELECT절에 group 함수와 group 함수가 아닌 것과는 절대로 같이 출력 불가 ★★
-- SELECT deptno, AVG(bonus)
-- FROM t_professor;

-- t_professor 테이블에서 ‘학과별’로 교수들의 평균 보너스를 출력하세요
SELECT deptno, ROUND(AVG(NVL(bonus, 0)), 1) 보너스평균
FROM t_professor
GROUP BY deptno;

-- t_professor 테이블 : 학과별(deptno) 그리고 직급별(position)로 
-- 교수들의 평균 급여를 계산하여 출력하세요
SELECT deptno, POSITION, avg(pay) 평균급여
FROM t_professor
GROUP BY deptno, position	-- 1. 학과별 그룹핑, 2. 직급별 그룹핑
ORDER BY deptno ASC, POSITION ASC;

-- 부서별 평균 급여를 출력하되, 평균 급여가 450보다 많은 학과만 출력
SELECT deptno, avg(pay) 평균급여
FROM t_professor
--WHERE avg(pay) > 450	-- 그룹함수는 WHERE 절에서 사용 불가
GROUP BY deptno;

-- HAVING : 그룹함수 결과에 대한 조건절
SELECT deptno, avg(pay) 평균급여
FROM t_professor
GROUP BY deptno
HAVING avg(pay) > 300;


-- <SELECT 쿼리문 순서>
-- SELECT
-- FROM
-- WHERE
-- GROUP BY
-- HAVING
-- ORDER BY


-- t_emp 테이블: 매니저별(MGR)로 관리하는 직원들의 ‘매니저’, ‘직원수’와 
-- ‘급여총액’과 ‘급여평균’과 ‘교통비 (COMM) 평균’ 지급액 을 출력하세요.  
-- 단 사장님은 (job = president)제외 
SELECT 
	mgr 매니저,
	COUNT(*) 직원수, 
	SUM(sal) 급여총액, 
	TRUNC(AVG(sal)) 급여평균,
	AVG(NVL(comm, 0)) 교통비평균
FROM t_emp
WHERE job <> 'president'
GROUP BY mgr;

-- t_professor 테이블 :  직위가 정교수 혹은 조교수 인 분들 중에서 ‘과별(deptno)’로  
-- 과번호, 소속교수 총수, 근속일 평균, 급여평균, 보너스 평균을 출력해보세요
SELECT 
	deptno,
	count(*) 총인원,
	ROUND(AVG(SYSDATE - hiredate), 1) 근속평균,
	AVG(pay) 급여평균, 
	AVG(NVL(bonus, 0)) 보너스평균
FROM t_professor
WHERE POSITION LIKE '%교수'
GROUP BY deptno;

-- t_student 테이블 : 학과별(deptno1)로, 학과번호, 
-- 최대몸무게 - 최소몸무게 차이 값을 출력해보세요
SELECT deptno1 학과, max(weight) - min(weight) 최대최소몸무게차
FROM t_student
GROUP BY deptno1;

-- 그 차이가 30 이상인것만 출력하려면?
SELECT deptno1 학과, max(weight) - min(weight) 최대최소몸무게차
FROM t_student
GROUP BY deptno1
HAVING max(weight) - min(weight) >= 30;
















