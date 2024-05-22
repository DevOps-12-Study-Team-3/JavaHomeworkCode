package homework.homework07.advance;

import java.util.Scanner;

public class _07_advance_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in ) ;
		
		System.out.println( "문자열을 입력하세요." );
		
		StringBuilder sb = new StringBuilder() ;
		
		String User_Data = sc.nextLine() ;
		
		String result = " " ;
		
		sb.append( User_Data );
		
		char Data ;
		
		int duplicateCount ;
 		
		for ( int i = 0 ; i < sb.length() ; i++ )
		{
			if( i == 0 ) 
			{
				result += sb.charAt( i ) ;
			}
			else
			{
				duplicateCount = 0 ;
				
				for ( int j = 0 ; j < result.length() ; j++ )
				{
					
					if ( result.charAt( j ) == sb.charAt( i ) ) 
					{
						++duplicateCount ;
						
						System.out.println( "중복된 데이터 입니다." );
						
					}

				}
				
				if( duplicateCount ==  0 )
				{
					result += sb.charAt( i ) ;
				}
				
			}
		}
		
		
		System.out.println( "결과 : " + result );
	}

}
