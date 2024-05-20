package homework.homework04.basic;

public class public_official extends Workingpeople {

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		
		System.out.println( "공무원 : 출근" );
		
	}

	@Override
	public void leavework() {
		// TODO Auto-generated method stub
		
		System.out.println( "공무원 : 퇴근" );
			
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		System.out.println( "공무원 : 일하는중" );
		
	}

}
