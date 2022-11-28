-- 데이터 삽입

-- 컬럼 이름 과 함께 삽입
INSERT INTO tCity(name, area, popu, metro, region) 
VALUES('목포', 100, 22, 'n', '전라');

INSERT INTO DEPT(DEPTNO, DNAME) 
VAlUES(60, '영업');

INSERT INTO DEPT(DEPTNO, DNAME, LOC) 
VAlUES(80, '비서', NULL);

-- 컬럼 이름을 생략하고 삽입
INSERT INTO tCity 
VALUES('마산', 200, 45, 'n', '경상');

-- Maria DB에서는 문자열 ''이 NULL이 아니고 공백
INSERT INTO DEPT(DEPTNO, DNAME, LOC) 
VAlUES(90, '기획', '');

-- 여러 개의 데이터를 한꺼번에 삽입
INSERT INTO DEPT(DEPTNO, DNAME, LOC) 
VALUES(100, '홍보', NULL), (110, '마케팅', NULL);