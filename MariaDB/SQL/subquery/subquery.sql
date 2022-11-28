-- SUB QUERY

-- ENAME이 MILLER인 사원 과 동일한 DEPTNO를 가진 사원의 ENAME을 조회
-- 하나씩 해결
SELECT DEPTNO
FROM EMP
WHERE ENAME = 'MILLER';

SELECT ENAME
FROM EMP
WHERE DEPTNO = 10;

-- Sub Query 이용
SELECT DEPTNO
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
				FROM EMP
				WHERE ENAME = 'MILLER');

-- popu가 최대인 도시의 name을 조회
-- 이렇게 하면 최대 데이터가 2개 이상 존재하는 경우 1개만 조회 됨
SELECT name, MAX(popu)
FROM tCity;

SELECT name
FROM tCity
WHERE popu = (SELECT MAX(popu) FROM tCity);

-- 평균 급여보다 많은 급여를 받는 사원의 이름과 급여를 조회
SELECT name
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP);