package homework.basic._03_homework;

public class Rect {
	
	
	public int width ;
	
	public int height ;
	
	public Rect()
	{
		System.out.println( "Rect 클래스를 호출합니다."  );

	}	
	
	public Rect( int num1 , int num2 )
	{
		System.out.println( "Rect 클래스를 호출합니다."  );
		
		this.width = num1 ;
		this.height = num2 ;
	
	}
	
	public double round(   )
	{
		
		return ( double ) ( (width + height) * 2 ) ;
	}
	
	
	public double wide(   )
	{
		
		return ( int ) ( width * height )  ;
	}

}
