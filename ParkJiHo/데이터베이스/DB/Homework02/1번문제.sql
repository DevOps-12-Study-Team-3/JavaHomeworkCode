--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)


SELECT  ST.SNAME 
		,ST.AVR 
FROM STUDENT ST
WHERE ST.AVR BETWEEN 3.0 AND 4.0 ;


--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)

SELECT P.ORDERS 
	, P.HIREDATE 
FROM PROFESSOR P
WHERE P.HIREDATE BETWEEN '1994-01-01' AND '1995-12-31';


--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)

SELECT   ST.SNAME 
		,ST.MAJOR
FROM STUDENT ST
WHERE ST.MAJOR IN ( '물리' , '생물' );


--4) 정교수와 조교수를 검색하라(in)

SELECT P.ORDERS 
FROM PROFESSOR P
WHERE P.ORDERS IN ( '정교수' , '조교수' );


--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)

SELECT C.CNAME 
	,  C.ST_NUM 
FROM COURSE C
WHERE C.ST_NUM IN ( '1' , '2' );


--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)

SELECT ST.SYEAR 
	,  ST.MAJOR 
	,  ST.AVR 
FROM STUDENT ST
WHERE ST.SYEAR IN ( '1', '2' ) AND ST.AVR BETWEEN ( 2.0 ) AND ( 3.0 ) ;

--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)

SELECT ST.SNAME 
	,  ST.SYEAR 
	,  ST.MAJOR 
	,  ST.AVR 
FROM STUDENT ST
WHERE ST.MAJOR IN ( '화학' , '물리' ) AND  ST.SYEAR IN ( '1' , '2' )
ORDER BY AVR ;

--8) 부임일이 1995년 이전인 정교수를 검색하라( to_date )

-- 모르겠음


SELECT P.ORDERS 
	,  P.HIREDATE 
FROM PROFESSOR P
WHERE TO_DATE(HIREDATE, 'YYYY-MM-DD HH24:MI:SS') < TO_DATE('1995-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS');

 








