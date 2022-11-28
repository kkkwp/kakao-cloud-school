-- SAVEPOINT

-- DEPT01 테이블을 삭제
DROP TABLE DEPT01;

-- DEPT 테이블을 그대로 복제해서 DEPT01 테이블을 생성
CREATE TABLE DEPT01 
AS
SELECT *
FROM DEPT;

-- DEPTNO가 40인 데이터 삭제
DELETE FROM DEPT01 WHERE DEPTNO = 40;
-- SAVEPOINT 생성
SAVEPOINT s1;

-- DEPTNO가 30인 데이터 삭제
DELETE FROM DEPT01 WHERE DEPTNO = 30;
-- SAVEPOINT 생성
SAVEPOINT s2;

-- DEPTNO 가 20 인 데이터 삭제
DELETE FROM DEPT01 WHERE DEPTNO = 20;


-- ROLLBACK 방법이 3가지

-- 1. 테이블을 생성한 시점으로 롤백 - 데이터가 4개
-- 만든 SAVEPOINT는 모두 제거
ROLLBACK; 

-- 2. 40을 지운 지점까지 롤백 - 데이터가 3개
-- 롤백을 또 하면 데이터가 4개가 되지만 s2라는 SAVEPOINT는 제거됨
ROLLBACK TO s1;
SELECT * FROM DEPT01;

-- 3. 30을 지운 지점까지 롤백 - 데이터가 2개
-- 롤백을 또 하면 데이터가 4개가 되지만 ROLLBACK TO s1;도 가능
-- 이 구문은 에러
ROLLBACK TO s2;

ROLLBACK;
SELECT * FROM DEPT01;