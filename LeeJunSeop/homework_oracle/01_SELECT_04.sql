--1) 성적순으로 학생의 이름을 검색하라
SELECT SNAME
	 , AVR
	FROM STUDENT
	ORDER BY AVR DESC;

--2) 학과별 성적순으로 학생의 정보를 검색하라
SELECT *
	 FROM STUDENT s 
	 ORDER BY MAJOR, AVR DESC;

--3) 학년별 성적순으로 학생의 정보를 검색하라
SELECT *
	 FROM STUDENT s 
	 ORDER BY SYEAR, AVR DESC;

--4) 학과별 학년별로 학생의 정보를 성적순으로 검색하라
SELECT *
	 FROM STUDENT s 
	 ORDER BY MAJOR, SYEAR, AVR DESC;

--5) 학점순으로 과목 이름을 검색하라
SELECT CNAME
	 , ST_NUM
	 FROM COURSE c
	 ORDER BY ST_NUM DESC;

--6) 각 학과별로 교수의 정보를 검색하라
SELECT *
	 FROM PROFESSOR p 
	 ORDER BY SECTION;

--7) 지위별로 교수의 정보를 검색하라
SELECT *
	FROM PROFESSOR p 
	ORDER BY ORDERS;

--8) 각 학과별로 교수의 정보를 부임일자 순으로 검색하라
SELECT *
	FROM PROFESSOR p 
	ORDER BY SECTION, HIREDATE;


