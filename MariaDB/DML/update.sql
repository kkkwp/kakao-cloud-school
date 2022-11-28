-- 데이터 수정

-- name이 서울인 데이터의 popu는 1000으로, region은 전라로 수정
UPDATE tCity
SET popu = 1000, region = '전라'
WHERE name = '서울';

UPDATE tCity
SET popu = 10, region = '강원'
WHERE name = '원주';