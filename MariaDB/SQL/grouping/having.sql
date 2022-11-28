-- HAVING

-- depart 별로 그룹화해서 평균 salary가 340이 넘는 부서의 depart와 평균 salary를 조회
SELECT depart, AVG(salary)
FROM tStaff
WHERE AVG(salary) > 340
GROUP BY depart;

SELECT depart, AVG(salary)
FROM tStaff
GROUP BY depart
HAVING AVG(salary) > 340;

-- depart가 인사과와 영업부인 데이터를 depart 별로 그룹화해서 depart와 평균 salary를 조회
-- 인사과, 영업부, 총무부를 모두 그룹화한 후 인사과와 영업부를 추출
-- 아래에 비해 비효율적
SELECT depart, AVG(salary)
FROM tStaff
GROUP BY depart;
HAVING depart IN('인사과', '영업부')

-- 인사과와 영업부 데이터를 추출한 후 그룹화
SELECT depart, AVG(salary)
FROM tStaff
WHERE depart IN('인사과', '영업부') 
GROUP BY depart;