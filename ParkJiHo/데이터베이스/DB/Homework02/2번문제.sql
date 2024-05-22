--1) 송강 교수가 강의하는 과목을 검색한다

SELECT P.PNAME 
	,	P."SECTION" 
FROM PROFESSOR P
WHERE P.PNAME = '송강';


--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다

SELECT P.PNAME 
	,	P."SECTION" 
FROM PROFESSOR P
WHERE P.SECTION = '화학';


--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다

SELECT P.ORDERS 
	, C.ST_NUM 
FROM PROFESSOR P
JOIN COURSE C
	ON P.PNO = C.PNO 
WHERE ST_NUM = '2' ;


--4) 화학과 교수가 강의하는 과목을 검색한다
-- [ ★ ]
SELECT DISTINCT c.CNO 
			  , c.CNAME 
FROM PROFESSOR P
JOIN COURSE C
ON p.PNO  = c.PNO 
WHERE P."SECTION" = '화학';


--5) 화학과 1학년 학생의 기말고사 성적을 검색한다

SELECT ST.MAJOR 
	, ST.SYEAR 
	, ST.AVR 
	, ST.SNAME 
FROM STUDENT ST
JOIN SCORE SC
	ON ST.SNO = SC.SNO
WHERE ST.MAJOR = '화학' AND ST.SYEAR = '1' ;


--6) 일반화학 과목의 기말고사 점수를 검색한다

SELECT C.CNAME 
	,  S."RESULT" 
FROM COURSE C
JOIN SCORE S
	ON C.CNO = S.CNO 
WHERE C.CNAME = '일반화학';


--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다

SELECT S.SNO
	, ST.MAJOR 
	, ST.SNAME
	, ST.SYEAR 
	, S."RESULT"
	, C.CNAME 
FROM STUDENT ST
JOIN SCORE S
	ON ST.SNO = S.SNO
JOIN COURSE C
	ON S.CNO = C.CNO
WHERE C.CNAME = '일반화학' AND ST.SYEAR = '1' ;


--8) 화학과 1학년 학생이 수강하는 과목을 검색한다.

SELECT ST.MAJOR 
	, ST.SYEAR 
FROM STUDENT ST
WHERE ST.SYEAR = '1' AND ST.MAJOR = '화학' ;

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다.

SELECT SG.GRADE
   , C.CNAME
   , ST.SNAME 
FROM COURSE C
JOIN SCORE S
 ON S.CNO = C.CNO
JOIN STUDENT ST 
  ON ST.SNO = S.SNO 
JOIN SCGRADE SG 
  ON ST.SNO = S.SNO  
WHERE C.CNAME = '유기화학' AND SG.GRADE = 'F' ;












