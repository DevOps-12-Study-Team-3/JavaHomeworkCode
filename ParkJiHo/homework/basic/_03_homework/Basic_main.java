package homework.basic._03_homework;

public class Basic_main {

	public static void main(String[] args) {
		
		// ############################################
		
		// [ 1번 문제 ]  
		
		SmartPhone smartPhone = new SmartPhone() ;
		
		smartPhone.Function1();
		smartPhone.Function2();
		smartPhone.Function3();
		
		System.out.println( "\n=======================\n" );
		
		// ############################################
		
		// [ 2번 문제 ]
		
		Rect rect = new Rect ( 5 , 5 ) ;
		
		System.out.println( "사격형의 둘레 : " + rect.round() );
		
		System.out.println( " 사각형의 넓이 : " +  rect.wide() );
		
		
		System.out.println( "\n=======================\n" );
		
		// ############################################
		
		// [ 3번 문제 ]
		
		User user = new User() ;
		
		user.setUsername( "박지호" ) ;
		
		System.out.println( " 사용자의 이름 :  " + user.getUsername() );
		
		user.setId( 1000000000L ) ;
		
		System.out.println( " 사용자의 아이디 :  " + user.getId() );
		
		user.setPassword( "123456789" ) ;
		
		System.out.println( " 사용자의 패스워드 :  " + user.getPassword() );
	
		System.out.println( "\n=======================\n" );
		
		// ############################################
			
		
		
		
	}

}
