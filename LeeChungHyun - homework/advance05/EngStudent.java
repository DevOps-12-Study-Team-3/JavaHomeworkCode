package chap99_homework.myself05.advance;

public class EngStudent extends CommonStat implements Student {

	public EngStudent (int sno, String name) {
		this.setSno(sno);
		this.setName(name);
	}
	
	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.getSubject()[index] = subject;
		this.getFinalExamScore()[index] = score;
		
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("학번 : " + this.getSno()
							+ " 이름 : " + this.getName());
		
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double examAvg;
		int examSum = 0;
		int subjectNum = 0;;
		for(int i = 0; i < this.getFinalExamScore().length ; i++) {
			if(this.getFinalExamScore()[i] != 0) {
				examSum += this.getFinalExamScore()[i];
				subjectNum ++;
			}
		}
		
		examAvg = (double)examSum / subjectNum;
		return examAvg;
	}

}
