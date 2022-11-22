-- ORDER BY

-- 데이터를 popu 순으로 정렬
SELECT *
FROM tCity
ORDER BY popu;

SELECT *
FROM tCity
ORDER BY 3;

SELECT *
FROM tCity
ORDER BY 3 DESC;

-- 데이터를 region 별로 정렬하고 동일한 값이 있으면 name의 내림차순으로 정렬
-- region, name, area, popu 컬럼을 조회
SELECT region, name, area, popu
FROM tCity
ORDER BY region, name DESC;