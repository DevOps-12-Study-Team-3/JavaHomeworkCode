--<단일 행 함수를 사용하세요>
--1) 이름이 두 글자인 학생의 이름을 검색하세요
SELECT ST.SNAME
	FROM STUDENT ST
	WHERE LENGTH(ST.SNAME) = 2;
	

--2) '공'씨 성을 가진 학생의 이름을 검색하세요
SELECT SNAME
	FROM STUDENT
	WHERE SNAME LIKE '공%';

--3) 교수의 지위를 한글자로 검색하세요(ex. 조교수 -> 조)
SELECT PNAME
	 , SUBSTR(ORDERS, 1, 1) 
	FROM PROFESSOR;

--4) 일반 과목을 기초 과목으로 변경해서 모든 과목을 검색하세요
--  (ex. 일반화학 -> 기초화학)
SELECT CNAME
	 , TRANSLATE(CNAME, '일반', '기초') AS "변경된 과목명"
	FROM COURSE;
   
--5) ★★만일 입력 실수로 student테이블의 sname컬럼에 데이터가 입력될 때
--   문자열 마지막에 공백이 추가되었다면 검색할 때 이를 제외하고
--   검색하는 SELECT 문을 작성하세요
SELECT SNAME
	FROM STUDENT
	WHERE LENGTH(TRIM(TRAILING ' ' FROM SNAME)) = LENGTH(SNAME);










