--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH 
	COUR_PRO AS (
			SELECT CNO
				 , CNAME
				 , PNO
				 FROM COURSE
				 WHERE CNAME LIKE '%일반%'
				 )
SELECT COUR_PRO.CNO
	 , COUR_PRO.CNAME
	 , COUR_PRO.PNO
	 , P.PNAME
	 FROM COUR_PRO
	 JOIN PROFESSOR P
	   ON COUR_PRO.PNO = P.PNO;

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH 
SA AS (
    SELECT E.ENO, E.ENAME, E.SAL
    FROM EMP E
    WHERE E.SAL >= 3000
),
SB AS (
    SELECT E.ENO, E.ENAME, E.COMM
    FROM EMP E
    WHERE E.COMM >= 500
)
SELECT 
    SA.ENO,
    SA.ENAME,
    SA.SAL,
    SB.COMM
FROM 
    SA
JOIN 
    SB ON SA.ENO = SB.ENO;
	  
	  

--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH
	AVR3 AS (
		SELECT S.SNO, S.SNAME, AVG(AVR) AS AR3
		FROM STUDENT S
		GROUP BY S.SNO, S.SNAME
		HAVING AVG(AVR) >= 3.3		
),
	RES_STU AS (
			SELECT SC.SNO, AVG(SC.RESULT) AS AV3
			FROM SCORE SC
			GROUP BY SC.SNO  
)
SELECT AVR3.SNO
	 , AVR3.SNAME
	 , RES_STU.AV3
	 FROM AVR3
	 JOIN RES_STU
	   ON AVR3.SNO = RES_STU.SNO
   
   
   

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH 
	OLDBOY AS (
		SELECT P.PNO, P.HIREDATE
		FROM PROFESSOR P
		WHERE MONTHS_BETWEEN(TRUNC(SYSDATE, 'DD'), (TRUNC(P.HIREDATE, 'DD')))/12 >= 25
	),
	COU AS (
		SELECT C.CNO, C.CNAME, S.SNO, S.SNAME, P.PNO, SC.RESULT
		FROM COURSE C
		JOIN SCORE SC
		  ON C.CNO = SC.CNO
		JOIN STUDENT S
		  ON S.SNO = SC.SNO
		JOIN PROFESSOR P
		  ON P.PNO = C.PNO
	)
	SELECT OLDBOY.PNO, COU.CNO, COU.CNAME, COU.SNO, COU.SNAME, COU.PNO, COU.RESULT
	FROM OLDBOY
	JOIN COU
	ON OLDBOY.PNO = COU.PNO
	WHERE COU.RESULT >= 90
	   
	   
--1) STUDENT 테이블을 참조하여 ST_TEMP 테이블을 만들고 모든 학생의 성적을 4.5만점 기준으로 수정하세요
CREATE TABLE ST_TEMP
	AS SELECT * FROM STUDENT;
COMMIT;

UPDATE ST_TEMP
	SET AVR = AVR/4.0*4.5;
COMMIT;


--2) PROFESSOR 테이블을 참조하여 PF_TEMP 테이블을 만들고 모든 교수의 부임일자를 100일 앞으로 수정하세요
CREATE TABLE PF_TEMP
	AS SELECT * FROM PROFESSOR;
COMMIT;

UPDATE PF_TEMP 
	SET HIREDATE = HIREDATE + 100;
COMMIT;


--3) ST_TEMP 테이블에서 화학과 2학년 학생의 정보를 삭제하세요
DELETE FROM ST_TEMP
	WHERE MAJOR IN ('화학')
      AND SYEAR IN (2);
COMMIT;


--4) PF_TEMP 테이블에서 조교수의 정보를 삭제하세요
DELETE FROM PF_TEMP
	WHERE ORDERS IN ('조교수');
      
COMMIT;


--5) EMP 테이블을 참조하여 EMP2 테이블을 만들고 DNO = 30인 사원의 보너스를 15프로 상승시킨 값으로 변경하시고 
--   DNO = 20인 사원의 급여를 10프로 상승시킨 값으로 변경하세요.
CREATE TABLE EMP2
	AS SELECT * FROM EMP;
COMMIT;

UPDATE EMP2
	SET COMM = COMM*1.15
	WHERE DNO = 30;
COMMIT;

UPDATE EMP2
	SET SAL = SAL*1.1
	WHERE DNO = 20;
COMMIT;




--6) 화학과 2학년 학생중 기말고사 성적의 등급이 A, B인 정보를 갖는 테이블 SCORE_STGR을 생성하세요.(SNO, SNAME, MAJOR, SYEAR, CNO, CNAME RESULT, GRADE)

CREATE TABLE SCORE_STGR AS
SELECT
    S.SNO,
    S.SNAME,
    S.MAJOR,
    S.SYEAR,
    SC.CNO,
    C.CNAME,
    SC.RESULT,
    SG.GRADE
	FROM 
    	STUDENT S
	JOIN 
    	SCORE SC 
    ON S.SNO = SC.SNO
	JOIN 
    	COURSE C 
    ON SC.CNO = C.CNO
	JOIN 
    	SCGRADE SG 
    ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
WHERE 
    S.MAJOR = '화학' AND S.SYEAR = 2 AND SG.GRADE IN ('A', 'B');
   


-- 7) 생물학과 학생중 평점이 2.7이상인 학생이 수강중인 과목의 정보를 갖는 테이블 ST_COURSEPF를 생성하세요. 
-- (SNO, SNAME, CNO, CNAME, PNO, PNAME, AVR)
   
CREATE TABLE ST_COURSEPF AS
SELECT
    S.SNO,
    S.SNAME,
    C.CNO,
    C.CNAME,
    P.PNO,
    P.PNAME,
    S.AVR
FROM 
    STUDENT S
JOIN 
    SCORE SC ON S.SNO = SC.SNO
JOIN 
    COURSE C ON SC.CNO = C.CNO
JOIN 
    PROFESSOR P ON C.PNO = P.PNO
WHERE 
    S.AVR >= 2.7
    AND S.MAJOR = '생물';
    
   