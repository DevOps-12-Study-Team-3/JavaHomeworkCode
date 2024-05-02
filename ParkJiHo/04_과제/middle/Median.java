package homework.middle._04_;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		
		System.out.print("a의 값：");	
		
		int a = stdIn.nextInt();
		
		System.out.print("b의 값：");	
		
		int b = stdIn.nextInt();
		
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
	
	static int  med3(int a, int b, int c)
	{
		//여기를 완성하세요.
		
		int num_list[] = new int [ 3 ] ;
		
		int num_list_sort[] = new int [ 3 ] ;
		
		int max_mum = 0 ;
		
		int min_num = 0 ;
		
		int mideel_num = 0 ;
		
		int Test_num = 0 ;
		
		num_list[ 0 ] = a ; 
		num_list[ 1 ] = b ; 
		num_list[ 2 ] = c ; 
		
		// #################################
		
		System.out.println( "\n=================\n" );
		
		for ( int k = 0 ; k < num_list.length ; k++ )
		{
			System.out.println( " 출력 : " + num_list[ k ] );	
		}
		
		System.out.println( "\n=================\n" );
		
		// #################################
		
		// 가장 큰 값 빼기
		
		Test_num = 0 ;
		
		for ( int i = 0 ; i  < num_list.length ; i++ )
		{
			
			if ( i == 0 )
			{
				Test_num = num_list[ i ] ; 
			}
			else
			{
				if ( Test_num == num_list[ i ] )
				{
//					System.out.println( "값이 중복됩니다." ) ;
				}
				else if ( Test_num > num_list[ i ] )
				{
//					System.out.println( "값이 작습니다." );	
				}
				else if ( Test_num < num_list[ i ] )
				{
//					System.out.println( "값이 더큽니다." );	
					
					Test_num = num_list[ i ];
				}
			}
			
		}
		
		max_mum = Test_num ;
		
		System.out.println( "가장 큰 값 : " + max_mum );
		
		System.out.println( "\n=================\n" );
		
		
		// #################################
		
		// 가장 큰 값 빼기
		
		Test_num = 0 ;
		
		for ( int i = 0 ; i < num_list.length ; i++ )
		{
			
			if ( i == 0 )
			{
				Test_num = num_list[ i ] ; 
			}
			else
			{
				if ( Test_num == num_list[ i ] )
				{
//					System.out.println( "값이 중복됩니다." ) ;
				}
				else if ( Test_num < num_list[ i ] )
				{
//					System.out.println( "값이 더큽니다." ) ; 					
				}
				else if ( Test_num > num_list[ i ] )
				{
					System.out.println( "값이 작습니다." ) ;	
					
					Test_num = num_list[ i ];	
				}
			}
		}
		
		min_num = Test_num ;
		
		System.out.println( "가장 작은 값 : " + min_num ) ;
		
		System.out.println( "\n=================\n" ) ;
		
		
		// #################################
		
		// 중앙값 뽑기
		
		for ( int i= 0 ; i < num_list.length ; i++ )
		{
			if ( ( num_list[i] != min_num ) && ( num_list[i] != max_mum )  )
			{
				
				mideel_num = num_list[i] ;
			}
		}
		
//		System.out.println(  "중앙 값 : " +  mideel_num );
		
		// #################################
		
		return mideel_num ;
	}

	
	
	
	
}

