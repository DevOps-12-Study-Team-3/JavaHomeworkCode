package chap99_homework.myself04.advance;

public class Temporary extends Worker {
	
	int hireYear, 월급 = pay / 12;
	
	public Temporary(int eno, String name, int pay, int type) {
		super(eno, name, pay, type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getMonthpay() {
		// TODO Auto-generated method stub
		return (double) this.pay / 12;
	}
	
	@Override
	public void showEmployeeInfo () {
		super.showEmployeeInfo();
		System.out.println("임시직");
	}

}
