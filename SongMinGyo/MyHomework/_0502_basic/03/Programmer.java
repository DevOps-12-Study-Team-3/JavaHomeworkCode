package HW_0502_basic_03;

public abstract class Programmer extends Worker {

	@Override
	public void goWork() {
		// TODO Auto-generated method stub
		System.out.println("늦게 출근한다.");
	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("퇴근 못한다");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("개미처럼 일한다.");
		
	}

}
