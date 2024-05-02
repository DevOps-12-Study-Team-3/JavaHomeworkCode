package homework.homework04.basic;

public class Tiger extends Cat{

	
	public Tiger()
	{
		System.out.println( "Tiger 클래스 호출");
	}
	
	public Tiger( int num )
	{
		System.out.println( "Tiger 클래스 호출");
	}

	@Override
	public void sleep() {
		System.out.println( "Tiger : 자는중" );
	}

	@Override
	public void run() {
		System.out.println( "Tiger : 달리는중" );
	}

	@Override
	public void jump() {
		
		System.out.println( "Tiger : 점프" );
		
	}
	
	
	
	
	
}
