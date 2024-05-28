--1) 각 학과별 학생 수를 검색하세요
SELECT MAJOR
	 , COUNT(*)
	FROM STUDENT
	GROUP BY MAJOR;

--2) 화학과와 생물학과 학생 4.5 환산 평점의 평균을 각각 검색하세요
SELECT MAJOR
	 , AVG(AVR * 1.25) AS "환산 평점"
	FROM STUDENT
	GROUP BY MAJOR
	HAVING MAJOR IN ('화학', '생물'); 

--3) 부임일이 10년 이상 된 직급별(정교수, 조교수, 부교수) 교수의 수를 검색하세요
SELECT ORDERS
	 , COUNT(*)
	 , TRUNC(HIREDATE, 'YYYY') 
	FROM PROFESSOR
	GROUP BY TRUNC(HIREDATE, 'YYYY'), ORDERS  
	HAVING TRUNC(SYSDATE , 'YYYY') - TRUNC(HIREDATE, 'YYYY') >= 10;

--4) 과목명에 화학이 포함된 과목의 학점수 총합을 검색하세요
SELECT CNAME
	, SUM(ST_NUM)
	FROM COURSE
	GROUP BY CNAME
	HAVING CNAME LIKE '%화학%';

--5) 학과별 기말고사 평균을 성적순(성적 내림차순)으로 검색하세요
SELECT ST.MAJOR
	 , AVG(SC.RESULT)
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	GROUP BY ST.MAJOR
	ORDER BY AVG(SC.RESULT);

--6) 30번 부서의 업무별 연봉의 평균을 검색하세요(소수점 두자리까지 표시)
SELECT AVG(SAL)
	 , JOB
	 , DNO
	FROM EMP 
	GROUP BY JOB, DNO
	HAVING DNO IN '30';

--7) 물리학과 학생 중에 학년별로 성적이 가장 우수한 학생의 평점을 검색하세요(학과, 학년, 평점)
SELECT MAJOR
	 , SYEAR
	 , MAX(AVR)
	FROM STUDENT
	GROUP BY MAJOR, SYEAR
	HAVING MAJOR IN ('물리')
	ORDER BY SYEAR;

--1) 화학과를 제외하고 학과별로 학생들의 평점 평균을 검색하세요
SELECT AVG(AVR)
	 , MAJOR
	FROM STUDENT
	GROUP BY MAJOR
	HAVING MAJOR != '화학'; 
	

--2) 화학과를 제외한 각 학과별 평균 평점 중에 평점이 2.0 이상인 정보를 검색하세요
SELECT AVG(AVR)
	 , MAJOR
	FROM STUDENT
	GROUP BY MAJOR
	HAVING AVG(AVR) >= 2.0; 

--3) 기말고사 평균이 60점 이상인 학생의 정보를 검색하세요
SELECT AVG(S.RESULT)
	 , ST.SNAME
	FROM STUDENT ST
	JOIN SCORE S
	  ON ST.SNO = S.SNO 
	GROUP BY ST.SNAME
	HAVING AVG(S.RESULT) >= 60;

--4) 강의 학점이 3학점 이상인 교수의 정보를 검색하세요
SELECT P.*
	 , C.ST_NUM 
	FROM PROFESSOR P  
	JOIN COURSE C
	  ON P.PNO = C.PNO 
	WHERE C.ST_NUM >= 3;

--5) 기말고사 평균 성적이 핵 화학과목보다 우수한 과목의 과목명과 담당 교수명을 검색하세요
SELECT AVG(SC.RESULT) -- 못풀었
	 , C.CNAME
	 , P.PNAME
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO
	JOIN SCORE SC
	  ON C.CNO = SC.CNO
	GROUP BY C.CNAME, P.PNAME 
	HAVING AVG(SC.RESULT) > C.CNAME = '핵화학'; 
	

--6) 근무 중인 직원이 4명 이상인 부서를 검색하세요(부서번호, 부서명, 인원수)
SELECT E.DNO
	 , D.DNAME
	 , COUNT(*)
	FROM DEPT D
	JOIN EMP E
	  ON D.DNO = E.DNO 
	GROUP BY E.DNO, D.DNAME
	HAVING COUNT(*) >= 4;

--7) 업무별 평균 연봉이 3000 이상인 업무를 검색하세요
SELECT AVG(E.SAL)
	 , D.DNAME
	FROM EMP E
	JOIN DEPT D
	  ON E.DNO = D.DNO
	GROUP BY D.DNAME
	HAVING AVG(E.SAL) > 3000;

--8) 각 학과의 학년별 인원중 인원이 5명 이상인 학년을 검색하세요
SELECT SYEAR
	 , MAJOR
	 , COUNT(*)
	FROM STUDENT 
	GROUP BY SYEAR, MAJOR 
	HAVING COUNT(*) >= 5
	ORDER BY MAJOR;

--1) 각 학과별 학년별 학생 수를 ROLLUP함수로 검색하세요
SELECT MAJOR
	 , SYEAR
	 , COUNT(*)
	FROM STUDENT
	GROUP BY ROLLUP(MAJOR, SYEAR);

--2) 화학과와 생물학과 학생 4.5 환산 평점의 평균을 각각 검색하는 데 화학과 생물이 열로 만들어지도록 하세요.(PIVOT 사용)
SELECT AVG(AVR) -- 못풀
	 , MAJOR
	FROM STUDENT
	GROUP BY CUBE(MAJOR = '화학', MAJOR = '생물');

--3) 학과별 학생이름을 ,로 구분하여 성적순으로(내림차순) 조회하세요.(LISTAGG 사용)
SELECT LISTAGG(SNAME, ', ') 
	 , AVR
	FROM STUDENT
	GROUP BY AVR
	ORDER BY AVR;
	

--4) 부서별 업무별 연봉의 평균을 검색하세요(부서와 업무 컬럼의 그룹화 여부도 같이 검색, GROUPING 사용)
SELECT E.JOB
	 , D.DNAME
	 , AVG(D.SAL)
	GROUPING(JOB)
	FROM EMP E
	JOIN DEPT D
	;
	
	
	
--1) 각 과목의 과목번호, 과목명, 담당 교수의 교수번호, 교수명을 검색하라(NATURAL JOIN 사용)


--2) 화학과 학생의 기말고사 성적을 모두 검색하라(JOIN USING 사용)


--3) 화학 관련 과목을 강의하는 교수의 명단을 검색한다(NATURAL JOIN 사용)


--4) 화학과 1학년 학생의 기말고사 성적을 검색한다(NATURAL JOIN 사용)


--5) 일반화학 과목의 기말고사 점수를 검색한다(JOIN USING 사용)


--6) 화학과 1학년 학생이 수강하는 과목을 검색한다(NATURAL JOIN 사용)


--1) 다중 컬럼 IN절을 이용해서 기말고사 성적이 80점 이상인 과목번호, 학생번호, 기말고사 성적을 모두 조회하세요.


--2) 다중 컬럼 IN절을 이용해서 화학과나 물리학과면서 학년이 1, 2, 3학년인 학생의 정보를 모두 조회하세요.


--3) 다중 컬럼 IN절을 사용해서 부서가 10, 20, 30이면서 보너스가 1000이상인 사원의 사원번호, 사원이름, 부서번호, 부서이름, 업무, 급여, 보너스를 
--   조회하세요.(서브쿼리 사용)


--4) 다중 컬럼 IN절을 사용하여 기말고사 성적의 최고점이 100점인 과목의 과목번호, 과목이름, 학생번호, 학생이름, 기말고사 성적을 조회하세요.(서브쿼리 사용)