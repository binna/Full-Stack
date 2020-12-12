SELECT * FROM t_professor;

-- null값과의 연산 결과는 null이다!!
SELECT name, pay, bonus
FROM t_professor;

-- 그룹함수에서는 동작, null은 연산에서 제외되어 동작
SELECT SUM(pay), SUM(bonus) FROM t_professor;


-- nvl() 함수
SELECT name, pay, bonus,
	pay + bonus 총지급액,
	pay + nvl(bonus, 0) 총지급액
FROM t_professor;

-- Professor 테이블 : 101번 학과 교수들의 이름(name), 급여(pay), 
-- 보너스(bonus), 연봉(pay) 출력하기. 연봉은 pay * 12 + bonus 로 계산,  
-- bonus 가 없는 교수는 0 으로 계산
SELECT name 이름, pay 급여, bonus 보너스, 
	nvl(bonus, 0) bonus,
	pay * 12 + nvl(bonus, 0) 연봉
FROM t_professor WHERE deptno = 101;

SELECT name 이름, pay 급여,
	nvl2(bonus, bonus, 0) bonus,
	nvl2(bonus, pay * 12 + bonus, pay * 12) 연봉
FROM t_professor WHERE deptno = 101;


























