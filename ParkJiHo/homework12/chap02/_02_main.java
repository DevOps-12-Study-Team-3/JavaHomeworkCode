package homework.homework12.chap02;

public class _02_main {

	public static void main(String[] args) {
		
		// =================================================
		
		// [ 1번 문제 ]
		
		/*
		 	1. 학생의 이름, 학번, 학과를 속성으로 가지고 
		 	   학생의 정보를 저장하는 메소드와 
		 	   학생의 정보를 출력하는 메소드를 
		 	   갖는 학생 클래스를 생성하세요.
		 */
		
		Student student = new Student();
		
		student.Student_info_save( "홍길동" , "1" , "과학" ) ;
		
		student.Student_info_print();
		
		System.out.println( "\n===========================\n" );
		
		// =================================================
		
		// [ 2번 문제 ]
		
		/*
		 		2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 
		 		정보를 저장하는 메소드와 
		 		정보를 출력하는 메소드를 갖는 
		 		도서 클래스를 생성하세요.
		 */
		
		Book book = new Book() ;
		
		book.Book_info_save( "반지의 제왕" ,"J. R. R. 톨킨" , "앨런 & 언윈" , 15000);
		
		book.Book_info_print() ;
		
		System.out.println( "\n===========================\n" );
		
		// =================================================
		
		// [ 3번 문제 ]
		
		/*
		  	3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
		 */
		
		System.out.println( "결과 : " + string_Add( "하이" , "빅스비" ) );  
		
		System.out.println( "\n===========================\n" );
		
		// =================================================
		
		// [ 4번 문제 ]
		
		/*
		 	4. 정수 한 개와 실수 한 개를 전달받아 
		 	소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
		 */
		
		System.out.println( String.format("%.2f", result( 1 , 10.53318189461 ) ) );
		
		System.out.println( "\n===========================\n" );
		
		// =================================================
		
		// [ 5번문제 ]  
		
		/*
			5. 반지름을 속성으로 갖는 원클래스를 만들고 
			사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 
			원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println( "\n===========================\n" );
		
		// =================================================
		
	}

	
	// [ 3번문제 ]
	public static String string_Add( String str1 , String str2 )
	{
		return str1 + str2 ;
	}
	
	// [ 4번문제 ]
	public static double result( int num1 , double num2 )
	{
		return ( double ) num1 * num2 ;
	}
	
	//[5번문제]
	
	
	
	
}
