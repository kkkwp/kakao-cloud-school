-- 외래키 - 참조 무결성

-- tEmployee 테이블 과 tProject 라는 테이블을 생성
-- tEmployee 테이블은 직원에 대한 정보를 가진 테이블이고 
-- tProject 직원이 수행한 프로젝트에 대한 정보를 가진 테이블

-- 1. FOREIGN KEY를 설정하지 않은 경우
CREATE TABLE tEmployee(
	name VARCHAR(20) PRIMARY KEY,
	salary INTEGER NOT NULL,
	addr CHAR(100) NOT NULL
);
INSERT INTO tEmployee(name, salary, addr) VALUES('아이린', 5000, '대구');
INSERT INTO tEmployee(name, salary, addr) VALUES('수지', 10000, '광주');
INSERT INTO tEmployee(name, salary, addr) VALUES('조이', 2000, '경기');

CREATE TABLE tProject(
	projectid INTEGER AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	project VARCHAR(50),
	cost INTEGER
);
INSERT INTO tProject(name, project, cost) VALUES('아이린', 'KB', 5000);
INSERT INTO tProject(name, project, cost) VALUES('수지', 'KB', 5000);
INSERT INTO tProject(name, project, cost) VALUES(NULL, 'KB', 5000);

-- 아이유는 tEmployee 테이블에 존재하지 않지만 외래키가 설정되지 않았으므로 삽입 가능
-- 이런 구조로 테이블을 만들게 되면 tProject 테이블에 데이터를 삽입할 때마다 name을 확인해서 삽입해야 한다.
INSERT INTO tProject(name, project, cost) VALUES('아이유', 'KB', 5000);

-- tProject를 삭제
DROP TABLE tProject;


-- 2. FOREIGN KEY를 설정해서 테이블을 생성하고 데이터를 삽입
CREATE TABLE tProject(
	projectid INTEGER AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20) REFERENCES tEmployee(name),
	project VARCHAR(50),
	cost INTEGER
);
INSERT INTO tProject(name, project, cost) VALUES ('아이린', 'KB', 5000);
INSERT INTO tProject(name, project, cost) VALUES ('수지', 'KB', 5000);
-- 외래키는 NULL 가능
INSERT INTO tProject(name, project, cost) VALUES (NULL, 'KB', 5000);
-- 에러 발생 : 아이유는 tEmployee 테이블에 존재하지 않는 데이터이기 때문
INSERT INTO tProject(name, project, cost) VALUES ('아이유', 'KB', 5000);

-- 조이는 참조되지 않고 있기 때문에 삭제가 가능하지만
-- 수지는 참조되고 있어서 삭제가 불가능
DELETE FROM tEmployee WHERE name = '조이';
DELETE FROM tEmployee WHERE name = '수지';


-- 외래키를 설정할 때 SET NULL 지정
DROP TABLE tProject;

CREATE TABLE tProject(
	projectid INTEGER AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20) REFERENCES tEmployee(name) ON DELETE SET NULL,
	project VARCHAR(50),
	cost INTEGER
);

INSERT INTO tProject(name, project, cost) VALUES('아이린', 'KB', 5000);
INSERT INTO tProject(name, project, cost) VALUES('수지', 'KB', 5000);
INSERT INTO tProject(name, project, cost) VALUES(NULL, 'KB', 5000);

DELETE FROM tEmployee WHERE name = '조이';
-- 삭제 가능
DELETE FROM tEmployee WHERE name = '수지'; 

-- 수지가 있던 데이터는 NULL로 수정
SELECT * FROM tProject;