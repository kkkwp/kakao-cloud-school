-- COUNT

-- tStaff의 데이터 개수
-- 모든 컬럼의 값이 NULL이 아닌 경우의 데이터 개수
SELECT COUNT(*) 
FROM tStaff;

-- score 칼럼에서 NULL을 제외한 개수
SELECT COUNT(score) 
FROM tStaff;

-- score의 평균
-- 18개의 데이터 평균
SELECT ROUND(AVG(score), 0)
FROM tStaff;

-- COUNT(*)을 사용했기 때문에 20개의 데이터의 평균
-- 데이터가 NULL 인 경우는 0으로 간주
SELECT ROUND(SUM(score)/COUNT(*), 0)
FROM tStaff;