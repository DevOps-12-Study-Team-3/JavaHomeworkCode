package chap99_homework.myself04.advance;

public class Contract extends Worker {
	
	int workDay;
	
	public Contract(int eno, String name, int pay, int type) {
		super(eno, name, pay, type);
		// TODO Auto-generated constructor stub
	}
			
	@Override
	public double getMonthpay() {
		// TODO Auto-generated method stub
		return (double) this.pay * workDay;
	}

	@Override
	public void showEmployeeInfo () {
		super.showEmployeeInfo();
		System.out.println("계약직");
	}
}
