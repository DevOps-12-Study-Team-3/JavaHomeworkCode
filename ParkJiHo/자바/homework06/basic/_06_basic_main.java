package homework.homework06.basic;

import java.util.Scanner;

public class _06_basic_main {

	public static void main(String[] args) 
	{
		
		// #####################################
		
		// [ 1번문제 ]
		
		System.out.println( "[1번문제] :문자열을 입력해주세요" );
		
		Scanner sc = new Scanner( System.in ) ;
		  
		String User_Data = sc.nextLine();
		
		int count = 0 ;
				 
		// [ 문자열 검사 ]
		
		for( int i = 0 ; i < User_Data.length() ; i++  )
		{
			char Data = User_Data.charAt(i) ;
			
			if ( Data == '가' )
			{
//				System.out.println( "문자열 [가]를 포함하고 있습니다." );
				
				count++;
			}
			else if ( Data == '바' )
			{
//				System.out.println( "문자열 [바]를 포함하고 있습니다." );
				count++;	
			}
			else
			{

			}
		}
		
		// [ 갯수 체크 ]
		
		if ( count == 0 )
		{
			System.out.println( "문자열 [ 가 ] / [ 바 ]가 존재하지 않습니다." );
		}
		else
		{
			System.out.println( "문자열 [ 가 ] / [ 바 ]가 " + count  +  "개 존재합니다." );
		
		}
		
		// #####################################
		
		// [ 2번문제 ]
		
		System.out.println( "[2번문제] : 문자열을 입력해주세요" );
		
		String User_Data2 = sc.nextLine();
		
		String result = " " ;
		
		// [ 문자열 비교 ]
		
		for( int i = 0 ; i < User_Data2.length() ; i++  )
		{
			char Data = User_Data2.charAt(i) ;
			
			if ( ( Data == 'A' ) || ( Data == 'a' ) )
			{
				System.out.println( "문자열 [A]가 포함되어있습니다." );
				
			}
			else if ( ( Data == 'E' ) || ( Data == 'e' ) )
			{
				System.out.println( "문자열 [E]가 포함되어있습니다." );
				
			}
			else if ( ( Data == 'I' ) || ( Data == 'i' ) )
			{
				System.out.println( "문자열 [I]가 포함되어있습니다." );
				
			}			
			else if ( ( Data == 'O' ) || ( Data == 'o' ) )
			{
				System.out.println( "문자열 [O]가 포함되어있습니다." );
				
			}			
			else if ( ( Data == 'U' ) || ( Data == 'u' ) )
			{
				System.out.println( "문자열 [U]가 포함되어있습니다." );
				
			}				
			else
			{
				result += Data ;
			}
		}
		
		System.out.println( " 결과  : " + result );
		
		// #####################################
		
		// [ 3번문제 ]
		
		double Data3 = 16.459 ;
		
		
		
		System.out.println( "[ 3번문제 ] : " + ( Math.round( Data3 *100 ) / 100.0 )  );
		
		// #####################################
			

	}

}
