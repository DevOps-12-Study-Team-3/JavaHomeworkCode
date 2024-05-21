package chap99_homework.myself04.basic;

public class Official extends Worker {

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("구청에 일하러 갑니다.");
	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("구청에서 퇴근합니다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("구청에서 일합니다.");
	}

}
