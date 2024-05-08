package homework.basic04;

public class Programmer extends Worker{

	@Override
	public void goToOffice() {
		// TODO Auto-generated method stub
		System.out.println("개발자 출근");
	}

	@Override
	public void getOffOffice() {
		// TODO Auto-generated method stub
		System.out.println("개발자 퇴근");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("개발자 코드 작성");
	}

}
