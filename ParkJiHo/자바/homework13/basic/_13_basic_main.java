package homework_my.homework13.basic;

import java.lang.reflect.Array;

public class _13_basic_main {

	public static void main(String[] args) {
		
		/*
		 1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
 				PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
 				
		 */
		
		int numbers[] = { 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8, 9, 10 } ;
		
        // 함수형 인터페이스를 매개변수로 받는 메소드 호출
        printNumbers( numbers, (numArr) -> {
        	
            System.out.print("짝수: ");
            
            for ( int num : numArr ) 
            {
                if ( num % 2 == 0 ) 
                {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            
        });								

		
	}

    // 함수 정의
    public static void printNumbers(int[] numbers, PrintNumber printFunction) {
        printFunction.printEnvenNum(numbers);
    }

	
}
