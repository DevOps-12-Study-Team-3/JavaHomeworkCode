--1) 모든 학생의 정보를 검색해라

SELECT  *
FROM STUDENT s 

--2) 모든 과목의 정보를 검색해라

SELECT  MAJOR
FROM STUDENT s 


--3) 기말고사 시험점수를 검색해라

SELECT  AVR 
FROM STUDENT s 

--4) 학생들의 학과와 학년을 검색해라

SELECT  MAJOR 
	, SYEAR 
FROM STUDENT s 

--5) 각 과목의 이름과 학점을 검색해라

SELECT  MAJOR 
	, AVR 
FROM STUDENT s 

--6) 모든 교수의 직위를 검색해라

SELECT  DISTINCT ORDERS
FROM PROFESSOR p  ;


