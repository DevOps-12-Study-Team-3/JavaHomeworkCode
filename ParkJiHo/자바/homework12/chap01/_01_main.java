package homework.homework12.chap01;

import java.util.Scanner;

public class _01_main {

	public static void main(String[] args) {
		
		// ################################################
		
		/*
		 1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		 
		 */
		
		Scanner sc = new Scanner( System.in ) ;
		
		System.out.println( "이름을 입력하세요" );
		
		String name = sc.nextLine() ;
		
		System.out.println( "나이를 입력하세요" );
		
		int age = sc.nextInt() ;
		
		// 개행 문자 소비
		sc.nextLine();
		
		System.out.println( "성별을 입력하세요" );
		
		String Gender = sc.nextLine() ;
		
		System.out.println("이름 : " + name + "\n나이 " + age + "\n성별 : " + Gender );
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
		
		/*
			2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		 */
		
		System.out.println( "( 1 ) 숫자를 입력하세요." );
		
		int num1 = sc.nextInt() ;
		// 개행 문자 소비
		sc.nextLine();
		
		System.out.println( "( 2 ) 연산자를 입력하세요." );
		
		String operator = sc.nextLine() ;	
	
		System.out.println( "( 3 ) 숫자를 입력하세요." );
		
		int num2 = sc.nextInt() ;		
		
		if ( operator.equals("+") ) 
		{
			System.out.println( "결과 : " + ( num1 + num2 ) );
		}
		else if ( operator.equals("-") ) 
		{
			System.out.println( "결과 : " + ( num1 - num2 ) );
		}
		else if ( operator.equals("*") ) 
		{
			System.out.println( "결과 : " + ( num1 * num2 ) );
		}
		else if ( operator.equals("/") ) 
		{
			System.out.println( "결과 : " + ( num1 / num2 ) );
		}
		else if ( operator.equals("%") ) 
		{
			System.out.println( "결과 : " + ( num1 % num2 ) );
		}
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
		
		/*
			3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.
				(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
			    단, 원주율 3.14는 상수로 선언하세요. 
		 */

		double Area ; // 넓이
		
		int Radius = 20 ; // 반지름
		
		int Circumference ; 
		
		final double PI = 3.14 ;
		
		System.out.println( "원의 넓이 : " + ( 2 * PI * Radius )  );
		
		System.out.println( "원의 둘레 : " + ( 4 * PI * Radius )  );
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
		
		// 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요 
		
		int avg = 0 ;
		
		int sum = 0 ;
		
		int num_list[] = new int [ 5 ] ;
		
		int User_Data = 0 ;
		
		for ( int i = 0 ; i < 5 ; i++ )
		{
			System.out.println( "(" + i + "번) 정수를 입력해주세요." );
			
			User_Data = sc.nextInt() ;
			
			num_list[i] = User_Data ;
			
			sum += User_Data;
		}

		System.out.println( "합계 : " + sum );
		System.out.println( "평균 : " + (sum / num_list.length) ) ;
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
		
		// 5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		
		int Number_list[] = new int[3] ;
		
		int Max_number = 0 ;
		
		int Min_number = 0 ;
				
		int Mid_number = 0 ;

		for ( int i = 0 ; i < Number_list.length ; i++ )
		{
			System.out.println( i + "번 )정수를 입력해주세요." );
			
			Number_list[ i ] = sc.nextInt() ;		
		}
		
		for ( int i = 0 ; i < Number_list.length ; i++ )
		{
			if ( i == 0 ) 
			{
				Max_number = Number_list[i] ;
				Min_number = Number_list[i] ;
			}
			else
			{
				// [ 최대 값 ]
				if ( Max_number < Number_list[i] )
				{
					Max_number = Number_list[i] ;
				}
				// [ 최소 값 ]
				else if ( Min_number > Number_list[i] )
				{
					Min_number = Number_list[i] ;
				}				
				
			}		
		}
			
		for ( int i = 0 ; i < Number_list.length ; i++ )
		{
			// [ 중간 값 ]
			if ( ( Number_list[i] != Max_number ) && ( Number_list[i] != Min_number ) )
			{
				Mid_number = Number_list[i] ;
			}
		}
		
		System.out.println( "최대 값 : "  + Max_number );		
		System.out.println( "중간 값 : "  + Mid_number );		
		System.out.println( "최소 값 : "  + Min_number );
		
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
		
		// [ 6번문제 ]
		
		/*
			6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
					  2 * 2 = 4
					  .....
					  2 * 9 = 18 	
		 */
	
		
		System.out.println( "구구단 몇단을 출력할까요?" );
		
		int num = sc.nextInt() ;
		
		for( int i = 1 ; i <= 9 ; i++ )
		{
			System.out.println( num + " X "  + i + " = " + ( num * i )  );
		}
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
		
		// [ 7번문제 ]
		
		/*
		 7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		*/
		
		System.out.println( "팩토리얼 정수를 입력해주세요." );
		
		int factorial = 1 ;
		
		int User_Data2 =  sc.nextInt() ;
		
		for ( int i = User_Data2 ; i > 0 ; i-- )
		{
			factorial *= i ;
			
			if ( i == User_Data2 )
			{
				System.out.print( i );
			}
			else
			{
				System.out.print( " X " + i );
			}
		}
		
		System.out.println( "\n결과 : " + factorial );
		
		System.out.println( "\n=========================================\n" );
		
		// ################################################
			
		// [ 8번문제 ]
		
		/*
			 8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
	   			사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		 */
		
       int primeNumberCount = 0;

        System.out.println("2부터 30까지의 정수를 10번 입력하세요:");

        for (int i = 0; i < 10; i++) 
        {
            System.out.print((i + 1) + "번 정수를 입력하세요: ");
            
            int num3 = sc.nextInt();

            if (num3 >= 2 && num3 <= 30) 
            {
                boolean isPrime = true;

                // 소수 판별 알고리즘
                for (int k = 2; k * k <= num; k++) 
                {
                    if (num3 % k == 0) 
                    {
                        isPrime = false;
                        break;
                    }
                }

                if ( isPrime ) 
                {
                    System.out.println(num3 + "은(는) 소수입니다.");
                    primeNumberCount++;
                } 
                else 
                {
                    System.out.println(num3 + "은(는) 소수가 아닙니다.");
                }
                
            } 
            else 
            {
                System.out.println("2부터 30까지의 정수를 입력하세요.");
                i--; // 잘못된 입력이 들어왔으므로 인덱스를 되돌립니다.
            }
        }

        System.out.println("입력된 정수 중 소수의 개수: " + primeNumberCount);

		System.out.println( "\n=========================================\n" );
		
		
		
		
		
		
		
		
		
		
		
		

		
		// ################################################
			
		

	}

}
