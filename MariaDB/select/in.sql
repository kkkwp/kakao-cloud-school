-- IN

-- region이 경상이나 전라인 데이터 조회
SELECT *
FROM tCity
WHERE region = '경상' OR region = '전라';

SELECT *
FROM tCity
WHERE region IN ('경상', '전라');