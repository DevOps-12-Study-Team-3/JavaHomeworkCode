package chap00_practice;

import java.util.Scanner;

import chap21_multithread._07_NonSyncSharedObj;

public class _01_Operator {
	public static void main(String[] args) {

//	1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//	  (메소드로 따로 만들지 말고 메인메소드에서 구현)
		Scanner sc = new Scanner(System.in);
//		System.out.println("1번 정수 입력.");
//		int num1 = sc.nextInt();
//		System.out.println("2번 정수 입력.");
//		int num2 = sc.nextInt();
//		
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println(num1 / num2);
//		System.out.println(num1 % num2);
		
//	2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//		int num = 20;
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(num--);
//		System.out.println(num--);
//		System.out.println(num--);
//		System.out.println(++num);
//		System.out.println(--num);
		
//	3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
//		System.out.println("정수 입력.");
//		int scInt = sc.nextInt();
//		
//		if(scInt % 2 == 0 && scInt % 7 == 0) {
//			System.out.println("2와 7의 공배수");
//		} else {
//			System.out.println("2와 7의 공배수가 아님");
//		}
		
//	4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//		System.out.println("문자열 입력 : ");
//		String scStr = sc.nextLine();
//		if(scStr.equals("Hello")) {
//			System.out.println("입력받은 문자열은 Hello");
//		} else {
//			System.out.println("Hello 아님");
//		}

//	5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//		System.out.println("정수 입력.");
//		int scInt = sc.nextInt();
//		String str = scInt % 2 == 0 ? "짝수" : "홀수";
//		System.out.println(str);

//	6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
//		System.out.println("정수 입력.");
//		int scInt = sc.nextInt();
//		String str = scInt <= 100 ? scInt < 100 ? "100보다 작음" : "100" : scInt > 100 ? "100보다 큼" : "100보다 작거나 같음";
//		System.out.println(str);
		
//		result = num1 / num2 > 8 ? num1 - 11 == 100 ? num1 * 2 : num1 / 2 : num2 - 11 < 0 ? num2 * 2 : num2 / 2;
		
//	7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		System.out.println("1번 실수 입력.");
//		double dNum1 = sc.nextDouble();
//		System.out.println("2번 실수 입력.");
//		double dNum2 = sc.nextDouble();
//		
//		System.out.println(dNum1 + dNum2);
//		System.out.println(dNum1 - dNum2);
//		System.out.println(dNum1 * dNum2);
//		System.out.println(dNum1 / dNum2);
//		System.out.println(dNum1 % dNum2);
		
//	8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
		System.out.println("문자열 입력.");
		String scStr = sc.nextLine();
		System.out.println("정수 입력.");
		int scInt = sc.nextInt();
		
		System.out.println("입력한 문자열 " + scStr + "이고, 입력한 숫자는 " + scInt + "입니다." );
	
	}
}
