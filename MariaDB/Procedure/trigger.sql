-- TRIGGER

-- 삽입 트리거
-- 하나의 테이블에 데이터를 삽입하면 다른 테이블에 데이터가 자동으로 잡입되도록 하는 트리거
-- (블로그 같은 곳에서 회원가입을 하면 가입한 회원의 데이터를 관리할 수 있는 테이블을 별도로 생성하는 경우)

-- 데이터를 삽입할 테이블
CREATE TABLE EMP01(
	ENPNO INT PRIMARY KEY,
	ENAME VARCHAR(10),
	JOB VARCHAR(30)
);

-- 트리거로 데이터를 삽입할 테이블
CREATE TABLE SAL01(
	SALNO INT PRIMARY KEY AUTO_INCREMENT,
	SAL FLOAT(7,2),
	EMPNO INT REFERENCES EMP01(EMPNO) ON DELETE CASCADE);

-- 삽입 트리거
DELIMITER //
CREATE OR REPLACE TRIGGER TRG_01
AFTER INSERT
ON EMP01
FOR EACH ROW
BEGIN
	INSERT INTO SAL01(SAL, EMPNO) VALUES(100, NEW.EMPNO);
END //
DELIMITER ;

-- 데이터를 삽입하고 확인
INSERT INTO EMP01 VALUES(1, 'adam', 'singer');
SELECT * FROM EMP01;

-- 트리거로 인해 데이터가 삽입됨
SELECT * FROM SAL01;