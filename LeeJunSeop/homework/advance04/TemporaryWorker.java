package homework.advance04;

public class TemporaryWorker extends Employee{
	// 임시직 : int hireYear, 월급 = pay / 12;
	
	private int hireYear;
	
	public TemporaryWorker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TemporaryWorker(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
		// TODO Auto-generated constructor stub
	}
	public void showEmployeeInfo() {
		System.out.println("사번 : " + super.getEno() + ", 이름 : "+ super.getName() + ", "
				+ "급여 : " + super.getPay()+", 근무형태 : "+getEmployType()+", 고용년수 : "
				+ hireYear + ", 월급 : " + getMonthPay());
	}
	@Override
	public double getMonthPay() {
		return (double)super.getPay() / 12;
	}
}
