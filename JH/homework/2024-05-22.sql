--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT AVR
	FROM STUDENT
	WHERE AVR BETWEEN 3.0 AND 4.0;

--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT *
	FROM PROFESSOR
	WHERE HIREDATE BETWEEN TO_DATE('19940101 00:00:00', 'yyyyMMdd HH24:mi:ss') AND TO_DATE('19951231 23:59:59', 'yyyyMMdd HH24:mi:ss')

--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT *
	FROM STUDENT
	WHERE MAJOR IN('물리', '생물');

--4) 정교수와 조교수를 검색하라(in)
SELECT *
	FROM PROFESSOR
	WHERE ORDERS IN('정교수', '부교수');

--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT *
	FROM COURSE
	WHERE ST_NUM IN(1, 2);

--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT *
	FROM STUDENT
	WHERE AVR BETWEEN 2.0 AND 3.0;

--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT *
	FROM STUDENT
	WHERE (MAJOR = '화학'
	OR MAJOR = '물리')
	AND SYEAR IN(1, 2);

--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT *
	FROM PROFESSOR
	WHERE HIREDATE < TO_DATE('19950101 00:00:00', 'yyyyMMdd HH24:mi:ss')
	
--1) 송강 교수가 강의하는 과목을 검색한다
SELECT SECTION
	FROM PROFESSOR
	WHERE PNAME = '송강';

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT PNAME 
	FROM PROFESSOR
	WHERE "SECTION" = '화학';

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT *
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO
	WHERE ST_NUM = 2;

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT *
	FROM COURSE 
	WHERE CNAME LIKE '%화학%';

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT AVR
	FROM STUDENT
	WHERE MAJOR = '화학';

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT SC.RESULT
	 , SC.CNO 
	 , C.CNO
	FROM SCORE SC
	JOIN COURSE C
	  ON SC.CNO = C.CNO;
--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT SC.RESULT
	 , SC.CNO 
	 , C.CNO
	 , ST.MAJOR
	 , ST.SYEAR 
	FROM SCORE SC
	JOIN COURSE C
	  ON SC.CNO = C.CNO
	JOIN STUDENT ST
	  ON SC.SNO = ST.SNO 
	  WHERE ST.MAJOR = '화학'
	 	AND ST.SYEAR = '1';

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT ST.SYEAR 
	 , ST.MAJOR
	 , ST.SNO 
	 , SC.SNO
	 , SC.CNO
	 , C.CNO
	 , C.CNAME
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO 
	JOIN COURSE C
	  ON SC.CNO = C.CNO
	WHERE ST.MAJOR = '화학'
	  AND ST.SYEAR = '1';
	
--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT SC.RESULT
	 , SC.SNO
	 , SC.CNO
	 , GR.HISCORE
	 , GR.LOSCORE
	 , GR.GRADE
	 , ST.SNO
	 , ST.SNAME
	 , C.CNAME
	FROM SCORE SC
	JOIN SCGRADE GR
	  ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE 
	JOIN STUDENT ST
	  ON ST.SNO = SC.SNO
	JOIN COURSE C
	  ON SC.CNO = C.CNO
	WHERE GR.GRADE = 'F'
	  AND C.CNAME = '유기화학';
	 
--1) 학생중에 동명이인을 검색한다
SELECT S.SNAME
	 , ST.SNAME 
	FROM STUDENT S
	JOIN STUDENT ST
	  ON S.SNAME = ST.SNAME; -- ???

--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.PNAME
	 , P.SECTION
	 , C.CNAME
	FROM PROFESSOR P
	JOIN COURSE C
	  ON C.PNO = P.PNO
	ORDER BY "SECTION"; 

--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT C.CNAME
	 , P.PNAME 
	 , C.ST_NUM 
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	ORDER BY ST_NUM DESC;

--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT C.CNAME
	 , P.PNAME
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO;

--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT ST.SNAME
	 , SC.RESULT
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO;

--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT C.CNAME
	 , ST.SNAME
	 , SC.RESULT
	FROM COURSE C
	JOIN SCORE SC
	  ON C.CNO = SC.CNO 
	JOIN STUDENT ST
	  ON ST.SNO = SC.SNO;

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT ST.MAJOR
	 , P.PNAME
	FROM STUDENT ST
	JOIN SCORE S
	  ON S.SNO = ST.SNO 
	JOIN COURSE C
	  ON S.CNO = C.CNO
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO;

--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT P.PNAME
 	 , C.CNAME
 	FROM PROFESSOR P
 	JOIN COURSE C
 	  ON C.PNO = P.PNO;

--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
 SELECT P.PNAME
 	  , C.CNAME
 	 FROM PROFESSOR P
 	 RIGHT JOIN COURSE C
 	   ON P.PNO = C.PNO