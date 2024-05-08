package homework.advance04;

public class ContractWorker extends Employee{
	// 계약직 : int workDay, 월급 = pay * workDay
	
	private int workDay;
	
	public ContractWorker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractWorker(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}
	public void showEmployeeInfo() {
		System.out.println("사번 : " + super.getEno() + ", 이름 : "+ super.getName() + ", "
				+ "급여 : " + super.getPay()+", 근무형태 : "+getEmployType()+", 근무일수 : "
				+ this.workDay + ", 월급 : " + getMonthPay());
	}
	@Override
	public double getMonthPay() {
		return (double)super.getPay() * workDay;
	}
}
