package homework_my.homework12.chap01;

import java.util.Scanner;

public class _04_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		// =============================================
		
		// [ 1번 문제 ]
		
		/*
		 	1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		*/
		
		System.out.println( "1번 정수를 입력해주세요." );
		
		int num1 = sc.nextInt() ;
		
		System.out.println( "2번 정수를 입력해주세요." );
		
		int num2 = sc.nextInt() ;
		
		if ( num1 < num2 )
		{
			System.out.println( "큰 값 : " + num2 );
		}
		else
		{
			System.out.println( "큰 값 : " + num1 );
		}
		
		System.out.println( "\n======================================\n" );
		
		// =============================================
		
		// [ 2번 문제 ]
		
		// 2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
		
		System.out.println( "정수를 입력해주세요." );
		
		int num3 = sc.nextInt() ;

		if ( num3 >= 0 )
		{
			System.out.println( "양수입니다." );
		}
		else
		{
			System.out.println( "음수입니다." );
		}
		
		System.out.println( "\n======================================\n" );	
		

		// =============================================
		
		// [ 3번 문제 ]
		
		/*
			3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
			"Python"인 경우 "공부중인 언어입니다."를 출력하고,
			 그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.
			 (switch~case~default 사용)		 
		*/
		
		System.out.println( "문자열을 입력해주세요." );
		
        String User_Data = sc.nextLine();

        // switch 문으로 입력된 언어에 따라 다른 동작 수행
        switch ( User_Data ) 
        {
            case "Java":
            	
                System.out.println("좋아하는 언어입니다.");
                
                break;
                
            case "Python":
            	
                System.out.println("공부중인 언어입니다.");
                
                break;
                
            default:
                System.out.println("다른 언어를 공부해보세요.");
                
        }
		
		System.out.println( "\n======================================\n" );	
		

		// =============================================
		
		// [ 4번 문제 ]
		
		/*
			4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 
			3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.
			(switch~case~default 사용)
 
		 */
		
		System.out.println( "문자열을 입력해주세요." );
		
        int User_Data2 = sc.nextInt() ;

        switch ( User_Data2 % 3 ) 
        {
            case 0 :
                System.out.println("3의 배수입니다.");
                break;
                
            default:
                System.out.println("3의 배수가 아닙니다.");
        }	
		
		System.out.println( "\n======================================\n" );	
		
		// =============================================
		
		// [ 5번 문제 ]
		
		// 5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
		
 
        System.out.println("숫자를 입력하세요:");
        
        int number4 = sc.nextInt();
        
        if ( number4 %2 == 0 )
        {
        	System.out.println( "짝수 입니다." );
        	
        }
        else
        {
        	System.out.println( "홀수 입니다." );
        }
		
		System.out.println( "\n======================================\n" );	
		
		// =============================================
		
		// [ 6번 문제 ]
		
		// 6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		
		int num_list[] = new int[5] ;
		
		int max_num = 0 ;
		
		int User_Data1 = 0 ;
		
		for ( int i = 0 ; i <= 5 ; i++ ) 
		{
        	System.out.println( i + "번 정수를 입력해주세요." );
			
        	User_Data1 = sc.nextInt() ;
        	
			num_list[i] = User_Data1 ;
			
			if ( max_num < User_Data1 )
			{
				max_num = User_Data1 ;
			}
			
		}
		
		System.out.println( "가장 큰 값 : " + max_num );		
		
		System.out.println( "\n======================================\n" );	
		
		// =============================================

		// [ 7번 문제 ]
		
		/*
			7. 사용자가 입력한 문자열이 
			"Yes"인 경우 "예"를 출력하고, 
			"No"인 경우 "아니오"를 출력하고, 
			그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		*/
		
		System.out.println( "Yes / NO 선택해주세요." );
		
		String User_Data3 = sc.nextLine() ;
		
		switch ( User_Data3 ) 
		{
			case "Yes" :
				
				System.out.println( "예" );
				
				break;
				
			case "No" :
				
				System.out.println( "아니요" );
				
				break;	
				
			default:
				
				System.out.println( "잘못 입력하셨습니다." );
				
				break;
		}
		
		System.out.println( "\n======================================\n" );	
		
		// =============================================
			
		// [ 8번 문제 ]
		
		/*
			8. 사용자가 입력한 두 정수를 비교하여 
			같으면 "두 수가 같습니다." 
			첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 
			두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
		 */
		
		System.out.println( "1번 정수를 입력해주세요" );
		
		int num4 = sc.nextInt() ;	
		
		System.out.println( "2번 정수를 입력해주세요" );
		
		int num5 = sc.nextInt() ;
		
		if ( num4 == num5 )
		{
			System.out.println( "두 수가 같습니다." );
		}
		else if ( num4 > num5 )
		{
			System.out.println( "첫번째 수가 더큽니다." );
		}		
		else if ( num4 < num5 )
		{
			System.out.println( "두번째 수가 더큽니다." );
		}			
		
		System.out.println( "\n======================================\n" );	
		
		// =============================================
			
		// [ 9번 문제 ]
			
		/*
			9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다."
			 모두 홀수인 경우 "모두 홀수입니다." 
			 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.

		 */
		
		int odd_number = 0 ; 	// 홀수
		int even_number = 0 ; 	// 짝수
		
		System.out.println( "1번 정수를 입력해주세요" );
		
		int num6 = sc.nextInt() ;	
		
		System.out.println( "2번 정수를 입력해주세요" );
		
		int num7 = sc.nextInt() ;
		
		System.out.println( "3번 정수를 입력해주세요" );
		
		int num8 = sc.nextInt() ;
		
		if ( ( ( num6 %2 == 0 ) && ( num7 %2 == 0 ) ) && ( num8 %2 == 0 ) )
		{
			System.out.println( "모두 짝수 입니다." );
			
			++even_number ;
		}
		if ( ( ( num6 %2 != 0 ) && ( num7 %2 != 0 ) ) && ( num8 %2 != 0 ) )
		{
			System.out.println( "모두 홀수 입니다." );
			
			++odd_number ;
		}		
		else
		{
			System.out.println( "짝수 : " + even_number + "개 홀수 : " + odd_number +"개 입니다." );
		}
		
		System.out.println( "\n======================================\n" );	
		
		// =============================================
			
		
	}

}
