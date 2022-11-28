-- 테이블 수정

-- contact 테이블에 age라는 컬럼을 정수로 추가
ALTER TABLE contact ADD age integer;
DESC contact;

-- contact 테이블에서 age 컬럼 삭제
ALTER TABLE contact DROP age;
DESC contact;

-- contact 테이블에서 tel이라는 컬럼을 phone이라는 컬럼으로 변경
ALTER TABLE contact CHANGE tel phone varchar(11);
DESC contact;