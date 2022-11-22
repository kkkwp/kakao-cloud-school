-- SELECT

-- 모든 데이터 조회
-- 테이블이름의 대소문자를 구별함
SELECT *
FROM tCity;

-- 특정 컬럼만 추출
SELECT name, popu
FROM tCity;

-- 별명 설정
SELECT name 이름, popu AS "인구 수"
FROM tCity;

-- 계산식 출력
SELECT name, popu * 10000 AS "인구(명)"
FROM tCity;

-- 간단한 계산은 FROM 생략
SELECT 60 * 60 / 24;