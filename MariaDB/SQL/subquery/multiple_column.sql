-- 다중 열 Sub Query

-- name이 안중근인 데이터와 depart와 gender가 일치하는 데이터를 조회
SELECT *
FROM tStaff
WHERE (depart, gender) = (SELECT depart, gender 
						FROM tStaff 
						WHERE name = '안중근'); 