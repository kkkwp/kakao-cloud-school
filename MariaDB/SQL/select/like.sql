-- LIKE

-- 천이 포함된 데이터
SELECT *
FROM tCity
WHERE name LIKE '%천%';

-- 천이 포함되지 않은 데이터
SELECT *
FROM tCity
WHERE name NOT LIKE '%천%';

-- 천으로 시작하는 데이터
SELECT *
FROM tCity
WHERE name LIKE '천%';

-- 천으로 끝나는 데이터
SELECT *
FROM tCity
WHERE name LIKE '%천';

-- ENAME이 N으로 끝나는 6자의 이름을 가진 데이터를 조회
SELECT *
FROM EMP
WHERE ENAME LIKE '_____N';

-- sale에 30%가 포함된 데이터
--WHERE sale LIKE ‘%30#%’ ESCAPE ‘#’;