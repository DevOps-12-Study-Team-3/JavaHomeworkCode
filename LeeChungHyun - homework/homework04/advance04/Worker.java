package chap99_homework.myself04.advance;

public abstract class Worker {
	private int eno;
	private String name;
	private int pay;
	private int type;
	
	public Worker(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public abstract double getMonthpay();
	
	public void showEmployeeInfo() {
		System.out.print("사원번호 : " + eno + ", 이름 = " + name + ", 급여 = " + 
							pay + ", 근무형태 = ");
	}

}
