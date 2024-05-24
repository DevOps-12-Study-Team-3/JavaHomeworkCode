package homework_my.homework14.middle;

public class Student {
	
		/*
		[1번문제]
		
		1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고 
		List<Student> studentList에 
		(1, 홍길동, 100), 
		(2, 임꺽정, 75), 
		(3, 장길산, 86), 
		(4, 정도전, 97), 
		(5, 이순신, 95)를 저장하고 
		
		Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
	
		 */
	
	int sno ;
	
	String sName;
	
	int score ; 
	
	String grade;
	
	
	Student( int no , String Name , int score )
	{
		this.sno = no;
		this.sName = Name;	
		this.score = score;	
		
		this.grade = grade_return( score ) ;
		
		
	}
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sName=" + sName + ", score=" + score + ", grade=" + grade + "]";
	}
	
	
	public void Studen_info( int no , String Name , int score )
	{
		System.out.println( "학생 번호 : " + this.getSno() );
		System.out.println( "학생 이름 : " + this.getsName() );
		System.out.println( "학생 점수 : " + this.getScore() );
	}
	
	public String grade_return( int score )
	{
	   if (score >= 95) 
	   {
	        return "A+";
	    } 	
	   else if (score >= 90) 
	   {
	        return "A";
	    } 
	   else if (score >= 80) 
	   {
	        return "B";
	    } 
	   else if (score >= 70) 
	   {
	        return "C";
	    } 
	   else 
	    {
	        return "F";
	    }

	}
	
}
