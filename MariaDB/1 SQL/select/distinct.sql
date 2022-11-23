-- DISTINCT

-- tCity 테이블에서 region을 조회
SELECT region
FROM tCity;

-- tCity 테이블에서 region을 제외하고 조회
SELECT DISTINCT region
FROM tCity;

-- tCity 테이블에서 region과 name 모두가 중복된 경우만 제외
SELECT DISTINCT region, name
FROM tCity;