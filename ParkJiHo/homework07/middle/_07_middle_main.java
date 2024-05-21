package homework.homework07.middle;

import java.util.Scanner;

public class _07_middle_main {

	public static void main(String[] args) {
		
		// #####################################
		
		// [ 1번문제 ]
		
		StringBuffer sb = new StringBuffer(30);
		
		String first_Data = "hello" ;
		
		sb.append( first_Data ) ;
		
		int sapce_Data = 30 - first_Data.length();
		
		System.out.println( "비어있는 공간 갯수 : " + sapce_Data );
		
		for( int i = 1 ; i < sapce_Data  ; i++ )
		{

			//	567 / 8 9 10 / 11 12 13 /
			//	123 / 4 5 6 / 7 8 9			
			
			if ( ( i == 1 ) || ( ( i % 4 ) - 1 == 0 ) )
			{
				sb.append("b") ;
			}				
			if ( ( i == 2 ) || ( ( i % 4 ) - 2 == 0 ) )
			{
				sb.append("i") ;
			}
			if ( ( i == 3 ) || ( ( i % 4 ) - 3 == 0 ) )
			{

				sb.append("t") ;
			}
			
		}
		
		System.out.println( "1번 문제 결과 : " + sb.toString() );
		
		// #####################################
		
		// [ 2번 문제 ]
 		
		StringBuffer sb2 = new StringBuffer(30);
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println( "추출할 데이터의 인덱스 번호를 입력하세요. " );
		
		int User_Data = sc.nextInt() ;
		
		sb2.append( "유용한 클래스는 많다. 다양한 라이브러리를 활용한다." ) ;
		
		System.out.println( "거꾸로 : "  + sb2.reverse() );
		
		System.out.println( "사용자가 입력한 인덱스의 값 : " + sb2.charAt( User_Data ) );
		
		// #####################################
		
	}

}
