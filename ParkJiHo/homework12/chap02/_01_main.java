package homework.homework12.chap02;

import java.util.Scanner;

public class _01_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		// ==========================================
		
		// [ 1번 문제 ]
		
		/*
		 	1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
		*/
		
		
		int num_list[] = { 1 , 2, 3 , 4 , 5 ,6 ,7 ,8, 9, 10 } ;
		
		for( int i = 0 ; i < num_list.length ; i++ )
		{
			System.out.println( i  + "번 요소 : " + num_list[ i ] );
		}
		
		System.out.println( "\n====================================\n" );
		
		// ==========================================
		
		// [ 2번 문제 ]
		
		/*
		 	2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
		*/
		
		int num_list2[] = new int[ 10 ] ;
		
		String User_Data = " " ;
		
		int count = 0 ;
		
		while( true )
		{
			System.out.println( "정수를 입력해주세요." );
			
			User_Data = sc.nextLine() ;
			
			if ( User_Data.equals("q") )  
			{
				break ;
			}
			else
			{
				num_list2[ count ] = Integer.parseInt( User_Data ) ;
				
				++count ;
			}
		}
		
		for( int i = 0 ; i < num_list2.length ; i++ )
		{
			if ( num_list2[i] != 0 )
			{
				System.out.println( "추출된 원소 : " + num_list2[i] );
			}
		}
	
		System.out.println( "\n====================================\n" );
		
		// ==========================================
		
		// [ 3번 문제 ]
		
		/*
		 	3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
		*/
		
		int num_list3[] = new int[ 10 ] ;
		
		int sum = 0 ;
		
		int User_Data2 = 0 ;
		
		for( int i = 0 ; i < num_list3.length ; i++ )
		{
			System.out.println( i + "번 정수를 입력해주세요" ) ;
			
			User_Data2 = sc.nextInt() ;
			
			num_list3[i] = User_Data2 ;
			
			sum += User_Data2 ;
			
		}
		
		System.out.println( "평균 : " + ( sum / num_list3.length ) );
		
		System.out.println( "\n====================================\n" );
		
		// ==========================================
		
		// [ 4번 문제 ]
		
		// 4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
		
		int num_list4[] = new int[100] ;  
		
		int count2 = 0 ;
		
		int sum2 = 0 ;
		
		for( int i = 1 ; i <= 100 ; i++ )
		{
			if ( i %2 == 0 )
			{
				num_list4[ count2 ] = i ; 
				
				sum2 += i ;
				
				++count2 ;
			}
		}
		
		System.out.println( "합계 : " + sum2 );
		
		System.out.println( "\n====================================\n" );
		
		
		sc.nextLine() ;
		
		// ==========================================
		
		// [ 5번 문제 ]
		
		// 5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
		
		
		int num_list5[] = new int[10] ;  
		
		int min_num = 0 ;
		int max_num = 0 ;
		
		for( int i = 0 ; i < num_list5.length ; i++ )
		{
			
			System.out.println( i + "번 정수를 입력해주세요." );
			
			num_list5[i] = sc.nextInt();
			
			if( i == 0 )
			{
				min_num = num_list5[i] ;
				max_num = num_list5[i] ;			
			}		
			else
			{
				if( max_num < num_list5[i] )
				{
					max_num = num_list5[i] ;
				}
				else if( min_num > num_list5[i] )
				{
					min_num = num_list5[i]  ;
				}				
			}

		}
		
		System.out.println( "최소값 : " + min_num );	
		System.out.println( "최대값 : " + max_num );

		System.out.println( "\n====================================\n" );
		
		sc.nextLine() ;
		
		// ==========================================
		
		// [ 6번문제 ]
		
		// 6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 
		// 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.

		String num_list6[] = new String[5] ;  
		
		String User_Data3 = "" ;
		
		String max_String = "" ;
		String min_String = "" ;
		
		int max_len = 0 ;
		int min_len = 0 ;		

		for ( int i = 0 ; i < num_list6.length ; i++ )
		{
			System.out.println( i + "번 문자열을 입력해주세요." ) ;
			
			User_Data3 = sc.nextLine() ;
			
			num_list6[ i ] = User_Data3 ;
			
		}
		
		for ( int i = 0 ; i < num_list6.length ; i++ )
		{
			if( i == 0 )
			{
				max_len = num_list6[i].length() ;
				min_len = num_list6[i].length() ;	
				
				min_String = num_list6[i] ;
				max_String = num_list6[i] ;
			}
			else
			{
				// Max
				if( max_len < num_list6[i].length() ) 
				{
					max_len = num_list6[i].length() ;
					
					max_String = num_list6[i] ;
				}
				
				// Min
				if( min_len > num_list6[i].length() ) 
				{
					min_len = num_list6[i].length() ;
					
					min_String = num_list6[i] ;
				}					
			}		
		}
		
		System.out.println( "가장 긴 문자열 : " + max_String );
		System.out.println( "가장 짧은 문자열 : " + min_String);
		
		System.out.println( "\n====================================\n" );
		
		// ==========================================
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
