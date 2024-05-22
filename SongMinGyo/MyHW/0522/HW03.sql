--1) 학생중에 동명이인을 검색한다
SELECT ST.SNAME
	 , ST.SNO
	FROM STUDENT ST
	JOIN STUDENT ST2
	  ON ST.SNAME = ST2.SNAME 
	WHERE ST.SNO != ST2.SNO
	ORDER BY ST.SNAME;

--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.PNAME
	 , C.CNAME
	 , P.SECTION
	FROM PROFESSOR P
	JOIN COURSE C 
	  ON P.PNO = C.PNO 
	ORDER BY P.SECTION; 

--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT C.CNAME
	 , P.PNAME
	 , C.ST_NUM
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	ORDER BY C.ST_NUM;
