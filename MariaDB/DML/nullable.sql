-- NULL 허용

CREATE TABLE tNullable(
	name CHAR(10) NOT NULL,
	age INTEGER
);

INSERT INTO tNullable(name, age) VALUES ('adam', 34);
INSERT INTO tNullable(name) VALUES ('Karina');
-- name은 필수
INSERT INTO tNullable(age) VALUES (34);