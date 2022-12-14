-- EQUI JOIN

SELECT *
FROM EMP, DEPT 
WHERE EMP.DEPTNO = DEPT.DEPTNO;

-- ENAME이 MILLER인 사원의 DNAME과 ENAME을 조회
-- ENAME을 가지고 조회하는 조건이 있으므로 ENAME을 포함하고 있는 EMP 테이블을 선행 테이블로 사용하는 것이 효율적
SELECT DNAME, ENAME
FROM DEPT, EMP
WHERE DEPT.DEPTNO = EMP.DEPTNO AND ENAME = 'MILLER'; -- JOIN 조건을 먼저

SELECT DNAME, ENAME
FROM DEPT, EMP
WHERE ENAME = 'MILLER' AND DEPT.DEPTNO = EMP.DEPTNO;