-- CROSS JOIN

-- EMP 테이블은 14 * 8
SELECT *
FROM EMP;

-- DEPT 테이블은 4 * 3
SELECT *
FROM DEPT;

-- Cross Join의 결과는 11 *  56
SELECT *
FROM EMP, DEPT;