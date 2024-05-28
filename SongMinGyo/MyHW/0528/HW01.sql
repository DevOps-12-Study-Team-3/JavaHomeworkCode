--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH REGULAR_P AS (
		SELECT PNO
			 , PNAME
			FROM PROFESSOR
			WHERE ORDERS = '정교수'),
	 REGULAR_C AS (
	 	SELECT CNO
	 		 , CNAME
	 		 , PNO
	 		FROM COURSE C
	 		WHERE CNAME LIKE '%일반%')
SELECT CC.CNO
	 , CC.CNAME
	 , PP.PNO
	 , PP.PNAME
	FROM REGULAR_C CC
	JOIN REGULAR_P PP
	  ON CC.PNO = PP.PNO;
	

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH OVER3000SAL AS (
		SELECT E.ENO
			 , E.ENAME
			 , E.SAL
			FROM EMP E 
			WHERE SAL >= 3000),
	 OVER500COMM AS (
	 	SELECT EE.ENO
	 		 , EE.ENAME
	 		 , EE.COMM 
	 		FROM EMP EE
	 		WHERE COMM >= 500)
SELECT O3S.ENO
	 , O3S.ENAME
	 , O3S.SAL
	 , O5C.COMM
	FROM OVER3000SAL O3S
	JOIN OVER500COMM O5C
	  ON O3S.ENO = O5C.ENO;

--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH AVR_THREE AS (
		SELECT SNO
			 , SNAME
			 , AVR
			FROM STUDENT
			WHERE AVR >= 3.3),
	 AVR_FINAL AS (
	 	SELECT ST.SNO
	 		 , ROUND(AVG(SC.RESULT), 2) AS FINAL_SC
	 		FROM STUDENT ST
	 		JOIN SCORE SC 
	 		  ON SC.SNO = ST.SNO
	 		GROUP BY ST.SNO)
SELECT AT.SNO
	 , AT.SNAME
	 , AT.AVR
	 , AF.FINAL_SC
	FROM AVR_THREE AT
	JOIN AVR_FINAL AF 
	  ON AT.SNO = AF.SNO;

-- 4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 
-- 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을 갖는 가상테이블 하나를 생성하여 
-- 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 
-- 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH OVER25 AS (
		SELECT PNO
		 	 , PNAME
		 	 , HIREDATE
		 	FROM PROFESSOR
		 	WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE) >= 300),
	 FINAL_SC AS (
	 	SELECT C.CNO
	 		 , C.CNAME
	 		 , ST.SNO
	 		 , ST.SNAME
	 		 , C.PNO
	 		 , SC.RESULT 
	 		FROM STUDENT ST
	 		JOIN SCORE SC
	 		  ON SC.SNO = ST.SNO
	 		JOIN COURSE C
	 		  ON C.CNO = SC.CNO)
SELECT FS.CNO
	 , FS.CNAME
	 , FS.SNO
	 , FS.SNAME
	 , O.PNO
	 , O.PNAME
	 , FS.RESULT
	FROM OVER25 O
	JOIN FINAL_SC FS
	  ON O.PNO = FS.PNO
	WHERE FS.RESULT >= 90;
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 