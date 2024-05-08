package homework.advance05;

public class ComStudent extends CommonStat implements Student {

	public ComStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComStudent(int sno, String name, String[] subject, int[] finalExamScore) {
		super(sno, name, subject, finalExamScore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(int index, String subject, int score) {
		this.getSubject()[index] = subject;
		this.getFinalExamScore()[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학생 번호 : " + this.getSno());
		System.out.println("학생 이름 : " + this.getName());
		for(int i = 0; i < this.getSubject().length; ++i) {
			System.out.println("과목 "+ this.getSubject()[i] + "의 점수 : "
		+ this.getFinalExamScore()[i]);
		}
	}

	@Override
	public double getAvg() {
		double result = 0.0;
		for(int i = 0; i < this.getFinalExamScore().length; ++i) {
			result += this.getFinalExamScore()[i];
		}
		return result / this.getFinalExamScore().length;
	}

}
