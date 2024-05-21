package myhw.hwJava;

import java.util.Scanner;

public class _01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		// (메소드로 따로 만들지 말고 메인메소드에서 구현)
		Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("덧셈: " + (num1 + num2));
        System.out.println("뺄셈: " + (num1 - num2));
        System.out.println("곱셈: " + (num1 * num2));
        System.out.println("나눗셈: " + (double) num1 / num2);
        System.out.println("나머지: " + (num1 % num2));
        
        System.out.println("--------------------");
        
        // 2.  int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 
        // 21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
        int num = 20;

        System.out.println(++num); // 21
        System.out.println(++num); // 22
        System.out.println(num--); // 22
        System.out.println(--num); // 21
        System.out.println(num);   // 20
        System.out.println(num++); // 20
        System.out.println(num--); // 21
        System.out.println(--num); // 20
        System.out.println("마지막 변수의 값: " + num); // 20
		
        System.out.println("--------------------");
        
        // 3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 
        // 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
        System.out.print("정수를 입력하세요.");
        int num3 = sc.nextInt();

        if (num3 % 2 == 0 && num3 % 7 == 0) {
            System.out.println("2와 7의 공배수");
        } else {
            System.out.println("2와 7의 공배수가 아님");
        }
        System.out.println("--------------------");
		
        // 4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
        System.out.print("문자열을 입력하세요.");
        String str = sc.nextLine();

        if (str.equals("Hello")) {
            System.out.println("Hello와 일치합니다.");
        } else {
            System.out.println("Hello와 일치하지 않습니다.");
        }
        System.out.println("--------------------");
        
		// 5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
        System.out.print("정수를 입력하세요.");
        int num4 = sc.nextInt();

        String result = (num4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

        System.out.println("--------------------");
        
		// 6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 
        // 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
        System.out.print("정수를 입력하세요.");
        int num5 = sc.nextInt();

        String result2 = (num5 > 100) 
        					? "100보다 큼" : (num5 < 100) 
        							? "100보다 작음" 
        									: "100";
        System.out.println(result2);

        System.out.println("--------------------");
        
        // 7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
        System.out.print("첫 번째 실수를 입력하세요: ");
        double num6 = sc.nextDouble();
        System.out.print("두 번째 실수를 입력하세요: ");
        double num7 = sc.nextDouble();

        System.out.println("덧셈: " + (num6 + num7));
        System.out.println("뺄셈: " + (num6 - num7));
        System.out.println("곱셈: " + (num6 * num7));
        if (num7 != 0) {
            System.out.println("나눗셈: " + (num7 / num2));
            System.out.println("나머지: " + (num7 % num2));
        } else {
            System.out.println("입력오류");
        }
        
        // 8. 사용자가 입력한 하나의 문자열과 하나의 정수로 
        // "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
        
        
        
        
		
		
		
		
	}

}
