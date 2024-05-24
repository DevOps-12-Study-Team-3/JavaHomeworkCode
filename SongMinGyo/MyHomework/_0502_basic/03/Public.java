package HW_0502_basic_03;

public abstract class Public extends Worker {

	@Override
	public void goWork() {
		// TODO Auto-generated method stub
		System.out.println("일찍 출근한다.");
	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("야근한다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("민원을 처리한다.");
		
	}

}
