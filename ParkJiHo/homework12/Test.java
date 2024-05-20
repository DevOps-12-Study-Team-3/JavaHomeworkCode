package homework_my.homework12;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// ==============================================================
		
		// [ 9번 문제 ]
		
		// 9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		
		Scanner sc = new Scanner( System.in ) ;
		
		int sum = 0 ;
		
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
				sum += Integer.parseInt( User_Data ) ;
			}
		}
		
		System.out.println( "합계 : " + sum );
		
		
		System.out.println( "\n========================\n" );
		
	
		// ==============================================================
		

	}

}
