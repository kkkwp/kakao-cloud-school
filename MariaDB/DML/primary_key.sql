-- 기본키 지정

CREATE TABLE MEMBER(
	ID VARCHAR(50),
	PRIMARY KEY(ID)
);

CREATE TABLE tEmployee(
	name VARCHAR(20) PRIMARY KEY,
	salary INTEGER NOT NULL,
	addr CHAR(100) NOT NULL
);

INSERT INTO tEmployee(name, salary, addr) VALUES ('아이린', 5000, '대구');
INSERT INTO tEmployee(name, salary, addr) VALUES ('수지', 10000, '광주');
INSERT INTO tEmployee(name, salary, addr) VALUES ('조이', 2000, '경기');