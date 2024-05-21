package homework.homework12.chap02;

public class Radius {
	
	/*
		5. 반지름을 속성으로 갖는 원클래스를 만들고 
		사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 
		원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
	 */
	
	public int Radius ;
	
	public Radius()
	{

	}	
	
	public Radius( int Radius )
	{
		this.Radius = Radius ;
	}
	
	public double Area( int Radius ) // 넓이
	{
		return ( 3.14 * Radius * Radius ) ;
	}	
	
	public double Circumference( int Radius ) // 둘레
	{
		return ( 3.14 * 2 * Radius ) ;
	}
	

}
