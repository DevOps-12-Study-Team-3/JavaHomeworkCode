package homework.middle._03_homework;

public class PhoneInfo {
	
	String[] names = new String[100] ;
	String[] phoneNums = new String[100] ;

	int index = 0;
	
	public PhoneInfo() //
	{
		System.out.println( " PhoneInfo 클래스를 호출합니다. " );
	}
	
	public void insertPhoneInfo(String name, String phoneNum) 
	{
	    //매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
		
		names[ index ] =  name ;		
		phoneNums[ index ] =  phoneNum ;

	}

	public void printAllPhoneInfo()
	{
	    //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현 
		
		for( int i = 0 ; i < names.length ; i++ )
		{
			System.out.println( names[ i ] );
		}
		
		
		for( int j = 0 ; j < phoneNums.length  ; j++ )
		{
			System.out.println( phoneNums[ j ] );
		}	
		
		
	}

	public void printPhoneInfo(int index) 
	{
	    //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
		
		System.out.println(  " [ 인덱스 번호 ] : " + index + " /  " +  names[ index ] ) ;
		
		System.out.println(  " [ 인덱스 번호 ] : " + index + " /  " +  phoneNums[ index ] ) ;
		
		
		
	}
	
	

}
