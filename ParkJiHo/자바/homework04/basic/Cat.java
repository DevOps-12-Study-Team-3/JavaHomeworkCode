package homework.homework04.basic;

public class Cat extends Mammal
{
	
	public Cat()
	{
		System.out.println( "Cat 클래스 호출");
	}
	
	public Cat( int num )
	{
		System.out.println( "Cat 클래스 호출");
	}

	@Override
	public void sleep() {
		System.out.println( "고양이가 자는중입니다." );
	}

	@Override
	public void run() {
		System.out.println( "고양이가 달리는중입니다." );
	}

	@Override
	public void jump() {
		System.out.println( "고양이가 점프합니다." );
	}
	
}
