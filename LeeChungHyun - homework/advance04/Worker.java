package chap99_homework.myself04.advance;

public abstract class Worker {
	int eno;
	String name;
	int pay;
	int type;
	
	public Worker(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthpay();
	
	public void showEmployeeInfo() {
		System.out.print("사원번호 : " + eno + ", 이름 = " + name + ", 급여 = " + 
							pay + ", 근무형태 = ");
	}

}
