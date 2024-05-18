package chap00_practice;

import java.util.Scanner;

public class _01_TypeCasting {
	public static void main(String[] args) {
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		Scanner sc = new Scanner(System.in);
//		System.out.println("1번 정수 입력.");
//		String num1 = sc.nextLine();
//		System.out.println("2번 정수 입력.");
//		String num2 = sc.nextLine();
//		
//		int convertNum1 = Integer.valueOf(num1);
//		int convertNum2 = Integer.valueOf(num2);
//		
//		System.out.println(num1 + num2);
//		System.out.println(convertNum1 + convertNum2);
//		System.out.println(num1.getClass().getName());
		
//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
//		System.out.println("1번 정수 입력.");
//		String a = sc.nextLine();
//		System.out.println("2번 정수 입력.");
//		String b = sc.nextLine();
//		if(b == "0") {
//			System.exit(0);
//		}
//
//		double doublea = Double.valueOf(a);
//		double doubleb = Double.valueOf(b);
//		System.out.println(doublea / doubleb);
		

//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//		System.out.println("실수 입력.");
//		double dNum = sc.nextDouble();
//		
//		System.out.println((int)dNum);
//
//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//		System.out.println("실수 입력.");
//		double dNum = sc.nextDouble();
//		String ddNum = String.valueOf(dNum * dNum);
//			
//		System.out.println(ddNum);
//		System.out.println(ddNum.getClass().getName());

//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
//		int iNum = 10;
//		long lNum = 20;
//		iNum ^= (int)lNum;
//		lNum ^= iNum;
//		iNum ^= lNum;
//		System.out.println(iNum + "," + lNum);
		
//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		System.out.println("1번 문자 입력.");
		String s1 = sc.nextLine();
		System.out.println("2번 문자 입력.");
		String s2 = sc.nextLine();
		
		System.out.println((int)s1.charAt(0));
		System.out.println((int)s2.charAt(0));
	}
}
