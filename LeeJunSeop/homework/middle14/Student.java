package homework.middle14;

public class Student {
//	int sno, String sName, int score, String grade를 갖는 Student 클래스
	private int sno;
	private String sName;
	private int score;
	private String grade;
	
	public Student() {
		this.sno = 0;
		this.sName = "없음";
		this.score = 0;
		this.grade="N/A";
	}
	
	public Student(int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
		this.grade="N/A";
	}
	
	public Student(int sno, String sName, int score, String grade) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
		this.grade = grade;
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
		return "학생 번호 : "+this.sno + ", 학생 이름 : " + this.sName + ", 점수 : " + this.score +
				", 등급 : " + this.grade;
	}
}
