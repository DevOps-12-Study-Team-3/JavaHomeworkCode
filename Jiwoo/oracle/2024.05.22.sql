--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT *
	FROM STUDENT
	WHERE AVR BETWEEN 3.0 AND 4.0;



--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT *
	FROM PROFESSOR
	WHERE HIREDATE BETWEEN TO_DATE('19940101 00:00:00', 'yyyyMMdd HH24:mi:ss')
	 				   AND TO_DATE('19951231 23:59:59', 'yyyyMMdd HH24:mi:ss');


--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT *
	FROM STUDENT
	WHERE MAJOR IN ('화학', '물리', '생물');


--4) 정교수와 조교수를 검색하라(in)
SELECT *
	FROM PROFESSOR
	WHERE ORDERS IN ('정교수', '부교수');


--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT *
	FROM COURSE
	WHERE ST_NUM IN(1, 2);


--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT *
	FROM STUDENT
	WHERE AVR BETWEEN 2.0 AND 3.0
	AND SYEAR IN(1,2);



--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT *
	FROM STUDENT
	WHERE MAJOR IN ('화학', '물리')
	AND SYEAR IN(1,2) 
	ORDER BY AVR DESC; 



--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT *
	FROM PROFESSOR
	WHERE HIREDATE < TO_DATE('19950101 00:00:00', 'yyyyMMdd HH24:mi:ss');
	AND ORDERS = '정교수';	



--1) 송강 교수가 강의하는 과목을 검색한다
SELECT C.CNO
	 , C.CNAME
	 , C.PNO
	 , P.PNAME
	FROM COURSE C
	INNER JOIN PROFESSOR P
	ON C.PNO = P.PNO 
	WHERE PNAME = '송강';


--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT C.CNO
	 , C.CNAME
	 , C.PNO
	 , P.PNAME
	FROM COURSE C
	INNER JOIN PROFESSOR P
	ON C.PNO = P.PNO 
	AND CNAME LIKE '%화학%';


--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT C.CNO
	 , C.CNAME
	 , C.ST_NUM 
	 , C.PNO
	 , P.PNAME
	FROM COURSE C
	LEFT OUTER JOIN PROFESSOR P
	ON C.PNO = P.PNO
	WHERE ST_NUM = 2;
	


--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT C.CNO
	 , C.CNAME 
	 , C.PNO
	 , P.PNAME
	 , P."SECTION" 
	FROM COURSE C
	LEFT OUTER JOIN PROFESSOR P
	ON C.PNO = P.PNO
	WHERE SECTION = '화학';


--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT ST.SNO
	 , ST.SYEAR 
	 , ST.SNAME
	 , SC.SNO
	 , SC.RESULT 
	FROM STUDENT ST
	LEFT OUTER JOIN SCORE SC
	ON ST.SNO = SC.SNO
	AND ST.SYEAR = 1;


--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT CO.CNO
	 , CO.CNAME
	 , SC.CNO
	 , SC.RESULT
	 , ST.SNAME
	 , ST.SNO
	 , ST.SYEAR
	 FROM COURSE CO
	 JOIN SCORE SC
	   ON SC.CNO = CO.CNO 
	 JOIN STUDENT ST
	   ON ST.SNO = SC.SNO
	 AND CO.CNAME = '일반화학'; 

--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT CO.CNO
	 , CO.CNAME
	 , SC.CNO
	 , SC.RESULT
	 , ST.SNAME
	 , ST.SNO
	 , ST.SYEAR
	 , ST.MAJOR 
	 FROM COURSE CO
	 JOIN SCORE SC
	   ON SC.CNO = CO.CNO 
	 JOIN STUDENT ST
	   ON ST.SNO = SC.SNO
	 AND CO.CNAME = '일반화학'
	 AND ST.MAJOR = '화학'
	 AND ST.SYEAR = '1';
	


--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT CO.CNO
	 , CO.CNAME
	 , SC.CNO
	 , ST.SNAME
	 , ST.SNO
	 , ST.SYEAR
	 , ST.MAJOR 
	 FROM COURSE CO
	 JOIN SCORE SC
	   ON SC.CNO = CO.CNO 
	 JOIN STUDENT ST
	   ON ST.SNO = SC.SNO
	 AND ST.MAJOR = '화학'
	 AND ST.SYEAR = '1';	


--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT CO.CNO
	 , CO.CNAME
	 , SC.CNO
	 , SC.RESULT
	 , ST.SNAME
	 , ST.SNO
	 , ST.SYEAR
	 , ST.MAJOR 
	 , GR.GRADE 
	 FROM COURSE CO
	 JOIN SCORE SC
	   ON SC.CNO = CO.CNO 
	 JOIN STUDENT ST
	   ON ST.SNO = SC.SNO
	 JOIN SCGRADE GR
	   ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE 
	 AND GR.GRADE = 'F'
	 AND CO.CNAME  = '유기화학'


--1) 학생중에 동명이인을 검색한다
SELECT ST.SNO
	 , ST.SNAME
	 FROM STUDENT ST
	 JOIN STUDENT SST
	   ON ST.SNAME = SST.SNAME 
	 AND ST.SNO != SST.SNO
	ORDER BY ST.SNAME DESC; 
	 


--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.PNAME
	 , P.PNO
	 , P.SECTION
	 , C.CNAME
	 FROM PROFESSOR P
	 LEFT JOIN COURSE C
	 	ON P.PNO = C.PNO 
	 ORDER BY P."SECTION" ; 	


--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT C.CNAME
	 , C.ST_NUM
	 , P.PNO
	 , P.PNAME
	 FROM COURSE C
	 LEFT JOIN PROFESSOR P
	   ON P.PNO = C.PNO
	 ORDER BY ST_NUM DESC; 
	 
	


--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT C.CNAME
	 , C.ST_NUM
	 , P.PNO
	 , P.PNAME
	 FROM COURSE C
	 LEFT JOIN PROFESSOR P
	   ON P.PNO = C.PNO	


--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT ST.SNAME
	 , ST.SNO
	 , ST.MAJOR
	 , SC.RESULT
	 FROM STUDENT ST
	 LEFT JOIN SCORE SC
	   ON ST.SNO = SC.SNO
	  AND ST.MAJOR = '화학'; 


--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT ST.SNAME
	 , ST.SNO
	 , SC.RESULT
	 , SC.CNO 
	 , CO.CNO
	 , CO.CNAME
	 FROM STUDENT ST
	 JOIN SCORE SC
	   ON ST.SNO = SC.SNO
	 JOIN COURSE CO
	   ON CO.CNO = SC.CNO 
	  AND CO.CNAME = '유기화학';  

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT ST.SNO
	 , ST.SNAME
	 , ST.MAJOR
	 , SC.SNO
	 , SC.CNO
	 , CO.CNO
	 , CO.CNAME
	 , CO.PNO
	 , P.PNO
	 , P.PNAME
	 FROM STUDENT ST
	 JOIN SCORE SC
	   ON ST.SNO = SC.SNO 
	 JOIN COURSE CO
	   ON SC.CNO = CO.CNO 
	 JOIN PROFESSOR P
	   ON CO.PNO = P.PNO 
	 AND ST.MAJOR = '화학' 
	

--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT P.PNAME 
	 , P.PNO 
	 , CO.PNO
	 , CO.CNAME
	FROM PROFESSOR P
	LEFT OUTER JOIN COURSE CO
		ON P.PNO = CO.PNO 
	


--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
SELECT P.PNAME 
	 , P.PNO 
	 , CO.PNO
	 , CO.CNAME
	FROM PROFESSOR P
	FULL OUTER JOIN COURSE CO
		ON P.PNO = CO.PNO 
