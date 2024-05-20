package homework.homework12.chap01;

import java.util.Scanner;

public class _02_main {

	public static void main(String[] args) {
		
		
		// ========================================================
		
		// [1번문제]

		/*
		 	1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "1번 문자열을 입력해주세요" );
		
		String str_Data1 = sc.nextLine() ;		
		
		System.out.println( "2번 문자열을 입력해주세요" );
		
		String str_Data2 = sc.nextLine() ;
		
        // 문자열을 정수로 변환하여 더하기
        int num1 = Integer.parseInt(str_Data1);
        int num2 = Integer.parseInt(str_Data2);
        int sum = num1 + num2;
		
        System.out.println("두 정수의 합: " + sum);
		
        System.out.println( "\n==================================\n" );
        
		// ========================================================
        
        // [ 2번문제 ]
		
        /*
			2. 사용자가 두 개의 정수(a, b)를 입력해서 
			a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
        */
        
        double result = 0.0 ;
        
		System.out.println( "1번 정수를 입력해주세요" );
		
		int int_Data1 = sc.nextInt();
		
		int int_Data2 = 0 ; 
		
		while( true )
		{
			System.out.println( "2번 정수를 입력해주세요" );
			
			int_Data2 = sc.nextInt();    	
			
			if ( int_Data2 != 0 )
			{
				break ;
			}
			else
			{
				System.out.println( "0을 입력할 수 없습니다.\n 다시 입력해주세요" );
			}
		}
		
		result = int_Data1 / int_Data2 ;
        
        System.out.println( "결과 : " +  result );
        
        System.out.println( "\n==================================\n" );
        
		// ========================================================
		
        // [ 3번문제 ]
        
        /*
         	3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
        */
		
        System.out.println( "실수를 입력해주세요" );
        
        double User_Data1 = sc.nextDouble() ;
        
        System.out.println( "변환 결과 : " + (int)User_Data1 );
        
        System.out.println( "\n==================================\n" );
        
		// ========================================================
        
        // [ 4번문제 ]
        
        /*
         4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
        */
        
        
        System.out.println( "실수를 입력해주세요" );
        
        double User_Data2 = sc.nextDouble() ;
        
        System.out.println( "변환 결과 : " + String.valueOf( User_Data2 * User_Data2 ) ); 
        
        System.out.println( "\n==================================\n" );
        
        // ========================================================
        
        // [ 5번문제 ]
        
        /*
         5. int형 변수 iNum = 10과 
            long형 변수 lNum = 20의 값을 서로 교환하세요.
         
        */
        
        int inum = 10 ;
        Long lNum = 20L ;
        
        // 값 교환을 위한 임시 변수 사용
        long temp = inum;
        
        inum = lNum.intValue(); // Long을 int로 변환하여 대입
        lNum = temp; // long 타입 값을 Long 객체에 대입
        
        // 결과 출력
        System.out.println("inum: " + inum);
        System.out.println("lNum: " + lNum);    
        
        System.out.println( "\n==================================\n" );
        
        // ========================================================
        
        // [ 6번문제 ]
        
        // 6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
        
		// 개행 문자 소비
		sc.nextLine();
		
        System.out.println("첫 번째 문자를 입력해주세요:");
        
        String input1 = sc.nextLine();
        
        System.out.println("두 번째 문자를 입력해주세요:");
        String input2 = sc.nextLine();
        
        char char1 = input1.charAt(0);
        char char2 = input2.charAt(0);
        
        // 입력받은 문자의 유니코드를 출력
        System.out.println("첫 번째 문자 '" + char1 + "'의 유니코드: " + (int) char1);
        System.out.println("두 번째 문자 '" + char2 + "'의 유니코드: " + (int) char2);    
        
        
        System.out.println( "\n==================================\n" );
        
        // ========================================================
		
		
		

	}

}
