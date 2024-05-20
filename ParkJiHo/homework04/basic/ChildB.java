package homework.homework04.basic;

public class ChildB extends Parent
{

	@Override
	public void name( String s ) {
		// TODO Auto-generated method stub
		
		System.out.println( "ChildB의 이름 : " + s );
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
		System.out.println( "ChildB의 혈액형 : A " );
	}

	@Override
	public void Skin() {
		// TODO Auto-generated method stub
		System.out.println( "ChildB의 피부색 : 검정색" );
	}


}
