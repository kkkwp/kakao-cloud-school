-- WHERE

-- name이 서울인 데이터의 모든 컬럼을 조회
SELECT * 
FROM tCity 
WHERE name = '서울';

-- metro가 y인 데이터의 모든 컬럼을 조회
SELECT * 
FROM tCity 
--WHERE metro = 'y';
WHERE metro = 'Y';

-- 대소문자 구별
SELECT * 
FROM tCity 
WHERE BINARY(metro) = 'Y';

-- popu의 값이 100 이상인 데이터의 모든 컬럼을 조회
SELECT *
FROM tCity
WHERE popu >= 100;

-- NULL 관련 함수
-- score가 NULL인 데이터를 조회
SELECT *
FROM tStaff
--WHERE score = NULL;
WHERE score IS NULL;

-- 논리 연산자 AND, OR
-- popu가 100만 이상이고 area가 700 이상인 데이터의 모든 컬럼을 조회
SELECT *
FROM tCity
WHERE popu >= 100 AND area >= 700;