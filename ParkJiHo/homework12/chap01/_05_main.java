package homework_my.homework12.chap01;

import java.util.Scanner;

public class _05_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ==============================================================
		
		// [ 1번문제 ]
		
		// 1. 1부터 10까지의 정수의 합을 출력하세요.
		
		int sum = 0 ;
		
		for ( int i = 1 ; i <= 10 ; i++ )
		{
			sum += i ;
		}
		
		System.out.println( "합계 : " + sum );
		
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// [ 2번 문제 ]
		
		// 2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
		
		int result = 1 ;
		
		for ( int i = 1 ; i <= 10 ; i++  )
		{
            result *= 2;
            
            System.out.println( "2의 " + i + "제곱: " + result );
		}
		
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// [ 3번 문제 ]
		
		// 3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		
		System.out.println( "정수를 입력해주세요" );
		
		int num1 = sc.nextInt() ;
		
		for( int i = num1 ; i > 0 ; i-- )
		{
			
	         // 소수인지 판별
            boolean isPrime = true;
            
            for ( int k = 2 ; k * k <= i ; k++ ) 
            {
                if ( i % k == 0 ) 
                {
                    isPrime = false;
                    
                    break;
                }
            }
            
            // 소수일 경우 출력
            if ( isPrime ) 
            {
                System.out.println( i + "는 소수입니다." );
            }

		}		
		
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// [ 4번 문제 ]
		
		// 4. 사용자가 입력한 정수의 약수를  출력하세요.
		
		System.out.println( "정수를 입력해주세요" );
		
		int num2 = sc.nextInt() ;
		
		System.out.print( num2 + "의 약수 : " );
		
		for ( int i = 1 ; i <= num2 ; i++ )
		{
			if( num2 % i == 0 )
			{
				System.out.print( i + " ");
			}

		}
		
		System.out.println( "입니다." );
		
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// [ 5번 문제 ]
		
		// 5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
		
		int User_Data_list [] = new int [10] ;
		
		for( int i = 1 ; i <= 10 ; i++ )
		{
			System.out.println( i + "번의 정수를 입력해주세요" );
			
			User_Data_list[ i - 1 ] = sc.nextInt() ;
		}
		
		for( int k = User_Data_list.length - 1 ; k >= 0 ; k--  )
		{
			System.out.println( "출력 : " + User_Data_list[ k ] );
		}
	
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// [ 6번 문제 ]
		
		// 6. 사용자가 입력한 문자열을 역순으로 출력하세요.
		
		sc.nextLine() ;	
		
		System.out.println( "문자열을 입력해주세요" );
		
		String User_Data2 = sc.nextLine() ;	
		
		for( int i = User_Data2.length() - 1 ; i >= 0  ; i-- )
		{
			System.out.println( User_Data2.charAt( i ) );			
		
		}
		
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// 7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
		
		System.out.println( "1번 정수를 입력해주세요" );
		
		int User_Data3 = sc.nextInt() ;
		
		System.out.println( "2번 정수를 입력해주세요" );
		
		int User_Data4 = sc.nextInt() ;
		
		int max = 0; // 최대 공약수
		
		int min = 0 ; // 최소 공배수
		
		for(int i = 1 ; ( i <= User_Data3 ) && ( i <= User_Data4 ) ; i++) 
		{
			if( ( User_Data3 % i == 0 ) && ( User_Data4 % i == 0 ) )
			{
				max = i;
			}
		}		
		
		min = ( ( User_Data3 * User_Data4 ) / max ); // 최소 공배수

		System.out.println("최대 공약수 : " + max);		
		System.out.println("최소 공배수 : " + min);
		
		System.out.println( "\n===================================\n" );
		
		// ==============================================================
		
		// [ 8번 문제 ]
		
		/*
			[8-1]. 
				 0 1 2 3 4
				1 *
			    2 **
			    3 ***
			    4 ****
			    5 *****
		 */
		
//		4 3 2 1 0

		
		for ( int i = 0 ; i < 5  ; i++ )
		{
			for ( int j = 0 ; j < 5 ; j++ )
			{
				if ( j > i )
				{
					System.out.print( "_" );
				}
				else
				{
					System.out.print( "*" );
				}
				
			}			
			
			System.out.println( "" );	
		}
		
		System.out.println( "\n========================\n" );
		
		/*
			[8-2].
			
		 		 *****
			      ****
			       ***
			        **
			         *
	 */	
		
		
		for ( int i = 0 ; i < 5  ; i++ )
		{
			for ( int j = 0 ; j < 5 ; j++ )
			{
				if( i == 0 )
				{
					System.out.print( "*" );
				}
				else
				{
					if ( j >= i )
					{
						System.out.print( "*" );
					}
					else
					{
						System.out.print( "_" );
					}
				}
			}			
			
			System.out.println( "" );	
		}	
		
		System.out.println( "\n========================\n" );
		
		// ==============================================================
		
		// [ 9번 문제 ]
		
		// 9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		
		int sum2 = 0 ;
		
		String User_Data = "" ;
				
		while(true)
		{
			System.out.println( "정수를 입력해주세요" );
			
			User_Data = sc.nextLine() ;
			
			if( User_Data.equals("q") )
			{
				System.out.println( "q가 입력되어서 프로그램을 종료합니다." );
				
				break;
			}
			else
			{
				sum2 += Integer.parseInt( User_Data ) ;
			}
		}
		
		System.out.println( "합계 : " + sum2 );
		
		
		System.out.println( "\n========================\n" );
		
	
		// ==============================================================
	
	}

}
