package homework.homework04.basic;

public class Lion  extends Cat
{
	
	public Lion()
	{
		System.out.println( "Lion 클래스 호출");
	}
	
	public Lion( int num )
	{
		System.out.println( "Lion 클래스 호출");
	}

	@Override
	public void sleep() {
		System.out.println( "Lion : 자는중" );
	}

	@Override
	public void run() {
		System.out.println( "Lion : 달리는중" );
	}

	@Override
	public void jump() {
		
		System.out.println( "Lion : 점프" );
		
	}
	
	
	
	
	
	
	
	

}
