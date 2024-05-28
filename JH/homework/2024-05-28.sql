--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH SEWQ AS (
SELECT PNO
	 , PNAME
	FROM PROFESSOR
	WHERE ORDERS = '정교수'
)
SELECT SEWQ.*
	 , C.CNO
	 , C.CNAME
	FROM SEWQ
	JOIN COURSE C
	  ON SEWQ.PNO = C.PNO
	WHERE CNAME LIKE '%일반%';

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH 
	QWER AS(
		SELECT *
			FROM EMP
			WHERE SAL >= 3000
		),
	ASDF AS (
		SELECT *
			FROM EMP
			WHERE COMM >= 500
		)
SELECT QWER.*
	 , ASDF.*
	FROM QWER
	JOIN ASDF
	  ON QWER.ENO = ASDF.ENO;
--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH
	QWER AS( 
		SELECT *
			FROM STUDENT
			WHERE AVR >= 3.3
	),
	ASDF AS(
		SELECT ST.SNO
			 , ST.SNAME
			 , AVG(RESULT)
			FROM STUDENT ST
			JOIN SCORE SC
			  ON ST.SNO = SC.SNO
			GROUP BY ST.SNAME, ST.SNO
)
SELECT QWER.*
	 , ASDF.*
	 FROM QWER
	 JOIN ASDF
	   ON QWER.SNO = ASDF.SNO;
--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH
	QWER AS(
		SELECT *
			FROM PROFESSOR
			WHERE SYSDATE - HIREDATE >= 25
	),
	ASDF AS(
		SELECT C.CNO
			 , C.CNAME
			 , ST.SNO
			 , ST.SNAME
			 , P.PNO
			 , SC.RESULT
			FROM COURSE C
			JOIN PROFESSOR p
			  ON C.PNO = P.PNO
			JOIN SCORE SC
			  ON SC.CNO = C.CNO
			JOIN STUDENT ST
			  ON ST.SNO = SC.SNO
			WHERE SC.RESULT >= 90
	)
SELECT QWER.*
	 , ASDF.*
	 FROM QWER
	 JOIN ASDF
	   ON QWER.PNO = ASDF.PNO;
--1) STUDENT 테이블을 참조하여 ST_TEMP 테이블을 만들고 모든 학생의 성적을 4.5만점 기준으로 수정하세요
CREATE TABLE ST_TEMP
	AS SELECT* FROM STUDENT;

SELECT *
	FROM ST_TEMP;

SELECT AVR * (4.5 / 4.0) AS "4.5만점"
	FROM ST_TEMP;

--2) PROFESSOR 테이블을 참조하여 PF_TEMP 테이블을 만들고 모든 교수의 부임일자를 100일 앞으로 수정하세요
CREATE TABLE PF_TEMP
	AS SELECT* FROM PROFESSOR;

SELECT *
	FROM PF_TEMP;

SELECT HIREDATE - 100
	FROM PF_TEMP;

--3) ST_TEMP 테이블에서 화학과 2학년 학생의 정보를 삭제하세요
DELETE FROM ST_TEMP 
WHERE MAJOR = '화학'
  AND SYEAR = '2';

SELECT *
	FROM ST_TEMP
	ORDER BY MAJOR;
--4) PF_TEMP 테이블에서 조교수의 정보를 삭제하세요
DELETE FROM PF_TEMP
WHERE ORDERS = '조교수';

SELECT *
	FROM PF_TEMP;

--5) EMP 테이블을 참조하여 EMP2 테이블을 만들고 
--   DNO = 30인 사원의 보너스를 15프로 상승시킨 값으로 변경하시고 
--   DNO = 20인 사원의 급여를 10프로 상승시킨 값으로 변경하세요.
--   DNO = 10인 사원의 급여를 5프로 상승시킨 값으로 변경하세요.
CREATE TABLE EMP2 
	AS SELECT* FROM EMP;

UPDATE EMP2
	SET 
		COMM = COMM * 1.10
	WHERE DNO = '30';

UPDATE EMP2
	SET 
		COMM = COMM * 1.05
	WHERE DNO = '20';

UPDATE EMP2
	SET 
		COMM = COMM * 1.15
	WHERE DNO = '10';

SELECT *
	FROM EMP2;
--6) 화학과 2학년 학생중 기말고사 성적의 등급이 A, B인 정보를 갖는 테이블 SCORE_STGR을 생성하세요.(SNO, SNAME, MAJOR, SYEAR, CNO, CNAME, RESULT, GRADE)
CREATE TABLE SCORE_STGR()
	AS SELECT* FROM STUDENT
SELECT 
--7) 생물학과 학생중 평점이 2.7이상인 학생이 수강중인 과목의 정보를 갖는 테이블 ST_COURSEPF를 생성하세요. (SNO, SNAME, CNO, CNAME, PNO, PNAME, AVR)
CREATE TABLE ST_COURSEPF()
	AS SELECT* FROM STUDENT













