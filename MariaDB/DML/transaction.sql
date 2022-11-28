-- TRANSACTION

-- DEPT 테이블의 모든 내용을 가지고 DEPT01 테이블 생성 
CREATE TABLE DEPT01
AS
SELECT *
FROM DEPT;

-- DEPT01 테이블의 모든 데이터 삭제
-- DEPT01 문장을 성공적으로 수행하므로 TRANSACTION이 생성됨
DELETE FROM DEPT01;
SELECT * FROM DEPT01;

-- TRANSCATION 시작점으로 이동
-- 지우는 작업이 취소된 결과를 확인
ROLLBACK;
SELECT * FROM DEPT01;

-- DEPTNO가 20인 데이터 삭제
DELETE FROM DEPT01
WHERE DEPTNO = 20;
SELECT * FROM DEPT01;

-- 현재까지의 내역을 원본에 반영 - 트랜잭션 종료
COMMIT;

-- 트랜잭션이 이미 종료되어서 ROLLBACK을 해도 데이터가 복구되지 않음
ROLLBACK;
SELECT * FROM DEPT01;

-- DEPT01 테이블에서 DEPTNO가 10인 데이터 삭제
DELETE FROM DEPT01
WHERE DEPTNO = 10;

-- DEPT02 테이블 생성 - DDL 문장을 수행하면 트랜잭션은 종료
-- ROLLBACK할 지점이 없어짐
CREATE TABLE DEPT02(
	DEPTNO INT
);

-- CREATE 구문이 성공적으로 수행되면 트랙잭션은 종료된다.
-- ROLLBACK을 해도 돌아가지 않음
ROLLBACK;
SELECT * FROM DEPT02;