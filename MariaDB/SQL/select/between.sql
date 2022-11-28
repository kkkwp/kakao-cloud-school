-- BETWEEN

-- popu가 50 ~ 100 사이인 데이터 조회
SELECT *
FROM tCity
WHERE popu BETWEEN 50 AND 100;

-- name이 ㅊ이 포함된 문자로 시작되는 데이터
SELECT *
FROM tCity
--WHERE name LIKE 'ㅊ%';
WHERE name >= '차' AND name < '카';

-- joindate가 2015년 1월 1일부터 2018년 12월 31일 사이인 데이터 조회
SELECT *
FROM tStaff
WHERE joindate BETWEEN '20150101' AND '20181231';