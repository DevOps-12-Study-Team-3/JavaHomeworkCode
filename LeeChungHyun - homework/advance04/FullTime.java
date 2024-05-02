package chap99_homework.myself04.advance;

public class FullTime extends Worker {
	
	int bonus;
	
	public FullTime(int eno, String name, int pay, int type) {
		super(eno, name, pay, type);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double getMonthpay() {
		// TODO Auto-generated method stub
		return (double)super.pay / 12 + (double) bonus / 12;
	}
	
	@Override
	public void showEmployeeInfo () {
		super.showEmployeeInfo();
		System.out.println("정규직");
	}

}
