--1) '__학과인 __학생의 현재 평점은 __입니다' 형태로 학생의 정보를 출력하라

SELECT MAJOR || '학과인 ' || SNAME || '학생의' || AVR || '입니다'
FROM STUDENT s 


--2) '__과목은 __학점 과목입니다.' 형태로 과목의 정보를 출력하라

SELECT MAJOR || '과목은' || AVR || '학점 과목입니다'
FROM STUDENT s 

--3) '__교수는 __학과 소속입니다.' 형태로 교수의 정보를 출력하라

SELECT ORDERS  || '교수는' || "SECTION"  || '학과 소속입니다.'
FROM PROFESSOR p ;

--4) 학교에는 어떤 학과가 있는지 검색한다(학생 테이블 기반으로 검색한다)

SELECT DISTINCT MAJOR 
FROM STUDENT s ;

--5) 학교에는 어떤 학과가 있는지 검색한다(교수 테이블 기반으로 검색한다)

SELECT DISTINCT SECTION  
FROM PROFESSOR p ;

--6) 교수의 지위는 어떤 것들이 있는지 검색한다

SELECT DISTINCT ORDERS  
FROM PROFESSOR p ;






