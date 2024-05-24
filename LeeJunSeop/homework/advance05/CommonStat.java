package homework.advance05;

public class CommonStat {
	//클래스 CommonStat - int sno; 학번
//  - String name;
//- String[] subject;
//- int[] finalExamScore;
	private int sno;
	private String name;
	private String[] subject;
	private int[] finalExamScore;
	
	public CommonStat() {
		
	}
	public CommonStat(int sno, String name, String[] subject, int[] finalExamScore) {
		super();
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.finalExamScore = finalExamScore;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public int[] getFinalExamScore() {
		return finalExamScore;
	}
	public void setFinalExamScore(int[] finalExamScore) {
		this.finalExamScore = finalExamScore;
	}
	
	
}
