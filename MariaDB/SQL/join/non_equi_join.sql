-- NON EQUI JOIN

-- 각 사원의 ENAME(EMP)과 GRADE(SALGRADE)를 조회

-- SAL은 LOSAL이나 HISAL과 일치하지 않을 수 있음
-- SAL이 LOSAL과 HISAL 사이의 값일 경우의 GRADE를 조회
SELECT ENAME, GRADE
FROM EMP, SALGRADE
WHERE SAL BETWEEN LOSAL AND HISAL;