--1) 다중 컬럼 IN절을 이용해서 기말고사 성적이 80점 이상인 과목번호, 학생번호, 기말고사 성적을 모두 조회하세요.
SELECT SCC.CNO
 	 , STT.SNO
 	 , SCC.RESULT
 	FROM STUDENT STT
 	JOIN SCORE SCC
 	  ON STT.SNO = SCC.SNO 
 	 WHERE (STT.SNO, SCC.CNO) IN (
									SELECT ST.SNO
										 , SC.CNO
										FROM STUDENT ST
										JOIN SCORE SC
										  ON ST.SNO = SC.SNO
										WHERE SC.RESULT >= 80);

--2) 다중 컬럼 IN절을 이용해서 화학과나 물리학과면서 학년이 1, 2, 3학년인 학생의 정보를 모두 조회하세요.
SELECT *
	FROM STUDENT
	WHERE (MAJOR, SYEAR) IN (('화학', '1'), ('화학', '2'), ('화학', '3'), ('물리', '1'), ('물리', '2'), ('물리', '3'));

--3) 다중 컬럼 IN절을 사용해서 부서가 10, 20, 30이면서 보너스가 1000이상인 사원의 사원번호, 사원이름, 부서번호, 부서이름, 업무, 급여, 보너스를 
--   조회하세요.(서브쿼리 사용)
SELECT E.ENO
	 , E.ENAME
	 , E.DNO
	 , D.DNAME
	 , E.JOB
	 , E.SAL
	 , E.COMM
	FROM EMP E
	JOIN DEPT D
	  ON E.DNO = D.DNO 
	WHERE (E.DNO, E.COMM) IN (
								SELECT E.DNO
									 , E.COMM
									FROM EMP E
									JOIN DEPT D
									  ON E.DNO = D.DNO 
									WHERE COMM >= 1000
									  AND E.DNO IN ('10', '20', '30'));

-- 4) 다중 컬럼 IN절을 사용하여 기말고사 성적의 최고점이 100점인 과목의 과목번호, 과목이름, 
-- 학생번호, 학생이름, 기말고사 성적을 조회하세요.(서브쿼리 사용)
SELECT CC.CNO
	 , CC.CNAME
	 , STT.SNO
	 , STT.SNAME
	 , SCC.RESULT 
	FROM COURSE CC
	JOIN SCORE SCC
	  ON SCC.CNO = CC.CNO 
	JOIN STUDENT STT
	  ON STT.SNO = SCC.SNO
	GROUP BY CC.CNO, CC.CNAME, STT.SNO, STT.SNAME, SCC.RESULT 
	HAVING (CC.CNO, CC.CNAME) IN (
									SELECT C.CNO
										 , C.CNAME
										FROM COURSE C
										JOIN SCORE SC
										  ON SC.CNO = C.CNO 
										JOIN STUDENT ST
										  ON ST.SNO = SC.SNO
										GROUP BY C.CNO, C.CNAME
										HAVING MAX(RESULT) = 100);
																		 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 