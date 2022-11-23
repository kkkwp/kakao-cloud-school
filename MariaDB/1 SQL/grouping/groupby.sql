-- GROUP BY

-- 부서별 평균 급여 조회
-- 그룹화한 항목을 제외하고 출력하면 데이터를 알아보기 어렵기 때문에 그룹화한 항목과 같이 조회
SELECT DEPTNO, ROUND(AVG(SAL), 0) 
FROM EMP
GROUP BY DEPTNO;

-- 그룹화 여러개 가능
SELECT DEPTNO, JOB, ROUND(AVG(SAL), 0) 
FROM EMP
GROUP BY DEPTNO, JOB;