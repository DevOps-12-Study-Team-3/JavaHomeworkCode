package homework._05_homework._05_middle;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _05_middle_main {

	public static void main(String[] args) {
		
		
		// #####################################
		
		// [ 1번문제 ]
		
		Reverse reverse = new Reverse();
		
		System.out.println( "결과 : " + reverse.reverseString( "안녕하세요" ) );
		
		
		System.out.println( "================" );
		
		// #####################################
		
		// [ 2번문제 ]
		
		Scanner sc = new Scanner( System.in )  ;
		
		System.out.println( "문자열을 입력해주세요." );
		
		String User_Data = sc.nextLine() ;
		
		char deduplication_Data[] = new char [ User_Data.length() ];
		
		int deduplication_count = 0 ;
		
		for ( int i = 0 ; i < User_Data.length()  ; i++ )
		{
			//############################
			
			deduplication_count = 0 ;
			
			for ( int k = 0 ; k < deduplication_Data.length  ; k++ )
			{
				
				if( deduplication_Data[ k ] == User_Data.charAt( i ) )
				{
//					System.out.println( "중복된 데이터가 있습니다." );
					
					++deduplication_count ;
					
					break ;
				}
				
			}
			
			//###########################
			
			// [ 중복이 없는 경우 ] - 값 추가
			
			if ( deduplication_count == 0 )
			{
				deduplication_Data[ i ] = User_Data.charAt( i ) ;
			}
			
			//###########################
						
		}
		
		System.out.print( "중복제거된 데이터 : "   );
		
		for( int i = 0  ; i < deduplication_Data.length  ;  i++  )
		{
			System.out.print( deduplication_Data[ i ]   );
		}
		
		System.out.println( "\n===============\n" );
		
		// #####################################
		
		// [ 3번문제 ]
			

		System.out.println( "문자열을 입력해주세요." );
		
		String User_Data_2 = sc.nextLine() ;		
		
		for ( int i = 0 ; i < User_Data_2.length() ; i++ )
		{
			if ( i == 0 )
			{
				System.out.print( User_Data_2.charAt( i ) );
			}
			else
			{
		
				if ( ( i == 3 ) || ( i % 3 == 0 ) )
				{
					
					System.out.print( "3" );
				}
				else if ( ( i == 5 ) || ( i % 5 == 0 ) )
				{
					System.out.print( "5" );
				}			
				
				else
				{
					User_Data_2.charAt( i ) ;
					
					System.out.print( User_Data_2.charAt( i ) );
				}					
			}
			
			
			
		}
			

		// #####################################
		
	}

}
