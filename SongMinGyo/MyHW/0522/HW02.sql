--1) 송강 교수가 강의하는 과목을 검색한다
SELECT *
	FROM COURSE C 
	JOIN PROFESSOR P 
	  ON C.PNO = P.PNO 
	WHERE P.PNAME = '송강';

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT *
	FROM PROFESSOR P
	JOIN COURSE C
	  ON P.PNO = C.PNO 
	WHERE C.CNAME LIKE '%화학%';

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT C.CNAME
	 , C.ST_NUM
	 , P.PNAME
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	WHERE C.ST_NUM = 2;

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT *
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	WHERE SECTION = '화학';

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT S.*
	 , SC.RESULT
	FROM STUDENT S
	JOIN SCORE SC 
	  ON S.SNO = SC.SNO 
	WHERE S.MAJOR = '화학'
	  AND S.SYEAR = 1;

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT SC.RESULT
	FROM SCORE SC
	JOIN COURSE C
	  ON C.CNO = SC.CNO 
	WHERE CNAME = '일반화학';

--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT S.SNAME
	 , S.SYEAR
	 , S.MAJOR
	 , C.CNAME
	 , SC.RESULT
	FROM STUDENT S
	JOIN SCORE SC 
	  ON S.SNO = SC.SNO 
	JOIN COURSE C 
	  ON C.CNO = SC.CNO 
	WHERE S.MAJOR = '화학'
	  AND S.SYEAR = 1
	  AND C.CNAME = '일반화학';

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT DISTINCT C.CNAME
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	JOIN COURSE C 
	  ON C.CNO = SC.CNO 
	WHERE ST.MAJOR = '화학'
	  AND ST.SYEAR = 1;
	 

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT ST.SNAME
	 , C.CNAME
	 , GR.GRADE
	FROM STUDENT ST
	JOIN SCORE SC 
	  ON ST.SNO = SC.SNO 
	JOIN COURSE C
	  ON SC.CNO = C.CNO
	JOIN SCGRADE GR 
	  ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE 
	WHERE GR.GRADE = 'F'
	  AND C.CNAME = '유기화학'; 
	 
	 
	 
	 
	 
	 
	 
	 
