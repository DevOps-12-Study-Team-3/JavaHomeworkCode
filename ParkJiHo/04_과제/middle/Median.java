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
		
		int mideel_num = 0 ;
		
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
		
		for ( int i = 0 ; i  < num_list.length ; i++ )
		{
			
			if ( i == 0 )
			{
				
				mideel_num = num_list[i] ;

			}
			
			else
			{
				if ( mideel_num > num_list[i] )
				{
					
					mideel_num = mideel_num ;
					
				}
				else if (  mideel_num < num_list[i] )
				{
					mideel_num = num_list[i] ;
				}			
					
				else if (  mideel_num == num_list[i] )
				{
					System.out.println( "서로 값이 같습니다." );
				}			
			}

		}
		
		System.out.println( "\n=================\n" );
		
		
		// ################################
		
		for(   ; ; )
		{
			
		}
		
		
		
		
		// ################################
		
		return mideel_num ;
	}

	
	
	
	
}

