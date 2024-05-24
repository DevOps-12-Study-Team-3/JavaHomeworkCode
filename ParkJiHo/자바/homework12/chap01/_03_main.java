package homework.homework12.chap01;

import java.util.Scanner;

public class _03_main {

	public static void main(String[] args) {
		
		// ===========================================================
		
		// [ 1번 문제 ]
		
		/*
		 	1. 사용자가 입력한 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
  			(메소드로 따로 만들지 말고 메인메소드에서 구현)
		*/
		
		Scanner sc = new Scanner( System.in ) ;
		
		System.out.println( "1번 정수를 입력해주세요" );
		int num1 = sc.nextInt() ;	
		
		System.out.println( "2번 정수를 입력해주세요" );
		int num2 = sc.nextInt() ;
		
		
		System.out.println( "덧셈 : " + ( num1 + num2 ) );		
		System.out.println( "뺼셈 : " + ( num1 - num2 )  );		
		System.out.println( "곱셈 : " + ( num1 * num2 ) );		
		System.out.println( "나눗셈 : " + ( num1 / num2 )  );
		System.out.println( "나머지 : " + ( num1 % num2 ) );
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================

		// [ 2번 문제 ]
		
		/*
			2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 
			21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20

		*/
		
		
		int num3 = 20 ;
		
		System.out.println( "결과 : " + ( ++num3 ) );
		
		System.out.println( "결과 : " + ( ++num3 ) );
		
		System.out.println( "결과 : " + ( num3-- ) );		
		
		System.out.println( "결과 : " + ( num3-- ) );
		
		System.out.println( "결과 : " + ( num3 ) );		
		
		System.out.println( "결과 : " + ( num3-- ) );
		
		System.out.println( "결과 : " + ( num3++ ) );
		
		System.out.println( "결과 : " + ( num3 ) );
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================

		// [ 3번 문제 ]
		
		// 3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		
		
		System.out.println( "정수를 입력해주세요" );
		
		int num4 = sc.nextInt() ;
		
		if ( ( num4 %2 == 0 ) && ( num4 %7 == 0 ) ) 
		{
			System.out.println( "2와 7의 공배수입니다." );
		}
		else
		{
			System.out.println( "2와 7의 공배수가 아닙니다." );
		}
		
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================
		
		// [ 4번 문제 ]
		
		// 4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
		
		sc.nextLine() ;
		
		System.out.println( "문자열을 입력해주세요" );
		
		String num5 = sc.nextLine() ;
		
		if ( num5.equals( "Hello" ) )
		{
			System.out.println( "문자열 : Hello 입니다." );
		}
		else
		{
			System.out.println( "문자열 : Hello 이 아닙니다." );
		}
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================
		
		// [ 5번 문제 ]
		
		// 5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		
        System.out.println("정수를 입력하세요:");
        
        int num6 = sc.nextInt();

        String result = ( ( num6 % 2 == 0) ? "짝수" : "홀수" );
        
        System.out.println("입력한 정수는 " + result + "입니다.");
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================
		
		// [ 6번 문제 ]
		
		// 6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
		
        System.out.println("정수를 입력하세요:");
        
        int num7 = sc.nextInt();
        
        String result2 = (num7 > 100) ? "100보다 큼" :
        	
        							( (num7 < 100) ? "100보다 작음" : "100") ;
        
        System.out.println(result2);
		
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================
			
		// [ 7번 문제 ]
		
		// 7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		
		sc.nextLine();
			
        System.out.println("두 개의 실수를 입력하세요:");
        
        double num8 = sc.nextDouble();
        double num9 = sc.nextDouble();

        // 연산 결과 출력
        System.out.println( "덧셈 결과: " + (num8 + num9) );
        
        System.out.println( "뺄셈 결과: " + (num8 - num9) );
        
        System.out.println( "곱셈 결과: " + (num8 * num9) );
        
        // 나눗셈과 나머지 연산에서 예외 처리
        if ( num9 != 0 ) 
        {
            System.out.println( "나눗셈 결과: " + (num8 / num9) );
            
            System.out.println( "나머지 연산 결과: " + (num8 % num9) );
            
        } 
        else 
        {
            System.out.println("0으로 나눌 수 없습니다.");
        }	
		
		System.out.println( "\n========================================\n" );
		
		
		// ===========================================================
			
		// [ 8번 문제 ]
		
		// 8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
        
        System.out.println( "문자열을 입력해주세요" );
        
        String User_Data1 = sc.nextLine() ;
        
        System.out.println( "정수를 입력해주세요" );
        
        int User_Data2 = sc.nextInt() ;
        
        System.out.println( "입력한 문자열 : " + User_Data1 + "이고 , 입력한 숫자 : " + User_Data2 + "입니다.");
		
		System.out.println( "\n========================================\n" );
		
		// ===========================================================
			
		
		
		
		
		
		
		
		
	}

}
