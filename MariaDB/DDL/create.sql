-- 테이블 생성

CREATE TABLE contact(
	num integer,
	name char(20),
	address varchar(100),
	tel char(20),
	email char(100),
	birthday date
) ENGINE=MyISAM;