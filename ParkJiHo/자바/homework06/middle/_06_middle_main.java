package homework.homework06.middle;

import java.util.Scanner;

public class _06_middle_main {

	public static void main(String[] args) 
	{
		
		// ##############################################################################
		
		// [ 1번문제 ]
//		
//		System.out.println( "[1번문제] :문자열을 입력해주세요" );
//		
//		Scanner sc = new Scanner( System.in ) ;		
//		
//		String User_Data = sc.nextLine();
//		
//		if ( User_Data.length() % 2 == 0  ) // 짝수
//		{
//			System.out.print( "출력 : " );
//			
//			for( int i = 1 ; i <= 4 ; i++ )
//			{
//				if ( ( i == 1 ) || ( i == 4 ) )
//				{
//					
//				}
//				else
//				{
//					System.out.print( User_Data.charAt( i - 1 ) );
//				}
//			}	
//			
//		}
//		else // 홀수
//		{
//			
//			for( int i = 1 ; i <= 3 ; i++ )
//			{
//				if ( i == 2 )
//				{
//					System.out.println( " 가운데 출력 : " + User_Data.charAt( i - 1 ) );
//				}
//			}			
//		}

		// ##############################################################################
		
		// [ 2번문제 ]
		
		char Array[] = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'} ;
		 
		int Loop_cnt = 0 ;
		
		String result1 = " " ;
		String result2 = " " ;
		String result3 = " " ;
		String result4 = " " ;

		// #################################
		
		// [ 결과 : Bit ]
		
		
		Loop_cnt = 0 ;
		
		while( Loop_cnt  <= 3 )
		{
			
			++Loop_cnt ;
			
			if ( result1.equals("bit") )
			{
				System.out.println( "[ bit ] : 완성" );
				
				break ;
			}
			else
			{					
				
				System.out.println( " 새로운 for문을 시작합니다. " );
				
				for( char c : Array  )
				{
					
					if ( ( c == 'b' ) || ( c == 'i' ) || ( c == 't' ) )
					{
						
						// ##############################
						
						// [ 중복검사 ]
						
						int duplication_cnt = 0 ; 
						
						for ( int i = 0 ; i < result1.length() ; i++ )
						{
							if ( result1.charAt(i) == c )
							{
								
								++duplication_cnt ;
								
								System.out.println( "중복된 문자가 있습니다." );
								
								break ;
								
							}
						}
						
						// ##############################
						
						// 중복된 문자가 없을 경우에만 추가
						
						if ( duplication_cnt == 0 )
						{
							
							result1 += c ;
							
							System.out.println( "[ bit ] : " + result1 ) ;							
						}

						// ##############################
					}	
				}			
			}
		}
		
		System.out.println( "[결과] : " + result1 );

		// #################################
		
		// [ 결과 : com ]
		
		Loop_cnt = 0 ;
		
		while( Loop_cnt  <= 3 )
		{
			
			++Loop_cnt ;
			
			if ( result1.equals("com") )
			{
				System.out.println( "[ com ] : 완성" );
				
				break ;
			}
			else
			{					
				
				System.out.println( " 새로운 for문을 시작합니다. " );
				
				for( char c : Array  )
				{
					
					if ( ( c == 'c' ) || ( c == 'o' ) || ( c == 'm' ) )
					{
						
						// ##############################
						
						// [ 중복검사 ]
						
						int duplication_cnt = 0 ; 
						
						for ( int i = 0 ; i < result2.length() ; i++ )
						{
							if ( result2.charAt(i) == c )
							{
								
								++duplication_cnt ;
								
								System.out.println( "중복된 문자가 있습니다." );
								
								break ;
								
							}
						}
						
						// ##############################
						
						// 중복된 문자가 없을 경우에만 추가
						
						if ( duplication_cnt == 0 )
						{
							
							result2 += c ;
							
							System.out.println( "[ com ] : " + result2 ) ;							
						}

						// ##############################
					}	
				}			
			}
		}
		
		System.out.println( "[결과] : " + result2 );

		// #################################
		
		// [ 결과 : sql ]
		
		Loop_cnt = 0 ;
		
		while( Loop_cnt <= 3 )
		{
			
			++Loop_cnt ;
			
			if ( result1.equals("sql") )
			{
				System.out.println( "[ sql ] : 완성" );
				
				break ;
			}
			else
			{					
				
				System.out.println( " 새로운 for문을 시작합니다. " );
				
				for( char c : Array  )
				{
					
					if ( ( c == 's' ) || ( c == 'q' ) || ( c == 'l' ) )
					{
						
						// ##############################
						
						// [ 중복검사 ]
						
						int duplication_cnt = 0 ; 
						
						for ( int i = 0 ; i < result3.length() ; i++ )
						{
							if ( result3.charAt(i) == c )
							{
								
								++duplication_cnt ;
								
								System.out.println( "중복된 문자가 있습니다." );
								
								break ;
								
							}
						}
						
						// ##############################
						
						// 중복된 문자가 없을 경우에만 추가
						
						if ( duplication_cnt == 0 )
						{
							
							result3 += c ;
							
							System.out.println( "[ sql ] : " + result3 ) ;							
						}

						// ##############################
					}	
				}			
			}
		}
		
		System.out.println( "[결과] : " + result3 );

		// #################################
		
		// [ 결과 : sql ]
		
		Loop_cnt = 0 ;
		
		while( Loop_cnt <= 3 )
		{
			
			++Loop_cnt ;
			
			if ( result1.equals("int") )
			{
				System.out.println( "[ int ] : 완성" );
				
				break ;
			}
			else
			{					
				
				System.out.println( " 새로운 for문을 시작합니다. " );
				
				for( char c : Array  )
				{
					
					if ( ( c == 'i' ) || ( c == 'n' ) || ( c == 't' ) )
					{
						
						// ##############################
						
						// [ 중복검사 ]
						
						int duplication_cnt = 0 ; 
						
						for ( int i = 0 ; i < result4.length() ; i++ )
						{
							if ( result4.charAt(i) == c )
							{
								
								++duplication_cnt ;
								
								System.out.println( "중복된 문자가 있습니다." );
								
								break ;
								
							}
						}
						
						// ##############################
						
						// 중복된 문자가 없을 경우에만 추가
						
						if ( duplication_cnt == 0 )
						{
							
							result4 += c ;
							
							System.out.println( "[ int ] : " + result4 ) ;							
						}

						// ##############################
					}	
				}			
			}
		}
		
		System.out.println( "[결과] : " + result4 );

		// #######################################
		
		System.out.println( "[결과] : " + result1 );
		System.out.println( "[결과] : " + result2 );
		System.out.println( "[결과] : " + result3 );		
		System.out.println( "[결과] : " + result4);
		
		// ##############################################################################
		
		// [ 3번문제 ]

		int num = 10000 ;
		
		
		
		// ##############################################################################
		
		
	}

}
