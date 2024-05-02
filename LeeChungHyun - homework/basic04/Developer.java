package chap99_homework.myself04.basic;

public class Developer extends Worker {

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("개발사에 일하러 갑니다.");

	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("개발사에서 퇴근합니다.");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("개발사에서 일합니다.");
	}

}
