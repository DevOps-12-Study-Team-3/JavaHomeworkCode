package homework.advance04;

public class FullTimeWorker extends Employee{
	// 정규직 : int bonus, 월급 = pay / 12 + bonus/12
	private int bonus;
	
	
	
	public FullTimeWorker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FullTimeWorker(int eno, String name, int pay, int type, int bonus) {
		super(eno, name, pay, type);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
	public void showEmployeeInfo() {
		System.out.println("사번 : " + super.getEno() + ", 이름 : "+ super.getName() + ", "
				+ "급여 : " + super.getPay()+", 근무형태 : "+getEmployType()+", 보너스 : "
				+ this.bonus + ", 월급 : " + getMonthPay());
	}
	@Override
	public double getMonthPay() {
		return (double)super.getPay() / 12 + (double)bonus / 12;
	}
	
}
