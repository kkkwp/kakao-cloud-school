-- 다중 행 Sub Query

-- DEPTNO 별로 그룹화해서 각 그룹의 SAL이 최대인 데이터와 일치하는 SAL을 가진 데이터의 ENAME과 SAL을 조회
-- DEPTNO 별 SAL의 최대값 조회
SELECT MAX(SAL)
FROM EMP
GROUP BY DEPTNO;

-- 에러 - 서브쿼리의 결과는 3개인데 = 로 비교
SELECT ENAME, SAL
FROM EMP
WHERE SAL = (SELECT MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO);

-- 서브쿼리가 2개 이상 리턴하므로 IN 사용
SELECT ENAME, SAL
FROM EMP
WHERE SAL IN (SELECT MAX(SAL)
			FROM EMP
			GROUP BY DEPTNO);

-- DEPNO가 30인 데이터의 모든 SAL보다 많은 SAL을 받는 직원의 ENAME과 SAL을 조회
-- 에러
SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT SAL
            FROM EMP
            WHERE DEPTNO = 30);


SELECT ENAME, SAL
FROM EMP
WHERE SAL > ALL (SELECT SAL
			FROM EMP
			WHERE EMPNO = 30);
		
SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT MAX(SAL)
			FROM EMP
			WHERE EMPNO = 30);