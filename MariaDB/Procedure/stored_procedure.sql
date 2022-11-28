-- STORED PROCEDURE 

-- DEPT 테이블에 데이터를 삽입하는 프로시저를 만들고 호출
-- 프로시저 생성 - 블록을 잡고 스크립트로 실행해야 합니다.
DELIMITER //
CREATE OR REPLACE PROCEDURE myproc(
	vdeptno int(2),
	vdname varchar(14),
	vloc varchar(13))
	BEGIN 
		INSERT INTO DEPT(DEPTNO, DNAME, LOC)
		VALUES (vdeptno, vdname, vloc);
	END //
DELIMITER ;

-- 프로시저 호출
CALL myproc(77, '회계', '서울');
SELECT * FROM DEPT;

-- 프로시저 삭제
DROP PROCEDURE myproc;