-- SELF JOIN

-- 사원 이름 과 관리자의 사원 이름을 조회
-- 사원번호를 가지고 관리자의 사원번호를 찾고, 그 관리자의 사원번호를 가지고 관리자의 이름을 찾는다.
SELECT e1.ENAME AS "사원 이름", e2.ENAME AS "관리자 이름" 
FROM EMP e1, EMP e2 -- e1은 자신의 정보, e2는 관리자의 정보
WHERE e1.MGR = e2.EMPNO;

-- FRIEND 테이블이 있고 이 테이블이 ID와 FRIENDID(친구 아이디)로 구성된 경우 
-- 친구의 친구 찾기
SELECT f2.FRENDID
FROM FRIEND f1 = FRIEND f2
WHERE f1.FRIENDID = f2.ID 
	AND f1.ID != f2.FRIEND 
	AND NOT IN(SELECT FRIENDED 
				FROM FRIEND 
				WHERE f1.ID);