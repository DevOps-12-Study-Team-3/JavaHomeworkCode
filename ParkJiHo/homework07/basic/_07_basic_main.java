package homework.homework07.basic;

import java.util.Scanner;

public class _07_basic_main {

	public static void main(String[] args) 
	{
		
		// ################################################
		
		// [ 1번문제 ]
		
		Scanner sc = new Scanner( System.in ) ;
			
		StringBuffer sb = new StringBuffer();
		
		
		for ( int i = 0 ; i < 3 ; i++ )
		{
			System.out.println( "[ "+ i + " ] 사용자 값 입력 : " );
			
			String result = sc.nextLine(); 
			
			sb.append( result )	;
		}
		
		System.out.println( sb.toString()  ); 
		
		
		// ################################################
		
		// [ 2번문제 ]

		StringBuffer sb_2 = new StringBuffer( );
		
		sb_2.append("hello");
		
		int space_Data = 30 - 5 ;
		
		for( int i = 0 ; i < space_Data ; i++ )
		{
			sb_2.append('a') ;
		}
		
		System.out.println( "결과 : " + sb_2.toString() );
		
		// ################################################
			
		
		
		
		
		
		

	}

}
