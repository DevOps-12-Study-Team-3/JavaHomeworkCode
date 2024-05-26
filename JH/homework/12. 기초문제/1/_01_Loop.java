package chap00_practice;

import java.util.Scanner;

public class _01_Loop {
	public static void main(String[] args) {
//		1. 1부터 10까지의 정수의 합을 출력하세요.
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//		int square = 2;
//		for(int i = 1; i < 11; i++) {
//			
//			square *= 2;
//			System.out.println("2^" + i + " = " + square);
//		}
//		
//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수 입력.");
//		int sInt = sc.nextInt();
//		
//		for(int i = 0; i <= sInt; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		
//		4. 사용자가 입력한 정수의 약수를 출력하세요.
//		System.out.println("정수 입력.");
//		int scStr = sc.nextInt();
//		
//		for(int i = 1; i <= scStr; i++) {
//			if(scStr % i == 0) {
//				System.out.println(i);
//			}
//		}
		
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//		int[] intArr = new int[10];
//		for(int i = 0; i < intArr.length; i++) {
//			System.out.println("정수 10개 입력.");
//			intArr[i] = sc.nextInt();
//		}
//		for(int i = 9; i >= 0; i--) {
//			System.out.println(intArr[i]);
//		}
		
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//		System.out.println("문자열 입력.");
//		String sStr = sc.nextLine();
//		
//		for(int i = sStr.length()-1; i >= 0; i--) {
//			System.out.println(sStr.charAt(i));
//		}
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
		System.out.println("1번 정수 입력.");
		int num1 = sc.nextInt();
		System.out.println("2번 정수 입력.");
		int num2 = sc.nextInt();
		
		int gcd = 1;
		int lcm = 1;
		int smaller = Math.min(num1, num2);
		
		
		for(int i = 1; i <= smaller; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		// 최소공배수 공식
		lcm = (num1 * num2) / gcd;
		
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + lcm);
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
//		8-1. *
//		     **
//		     ***
//		     ****
//		     *****
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *
//		for(int i = 0; i < 5; i++) {
//			for(int k = 1; k < i+1; k++) {
//				System.out.print(" ");
//			}
//			for(int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
//		int sum = 0;
//		while(true) {
//			System.out.println("정수를 입력.(q를 입력하면 종료)");
//			String sStr = sc.nextLine();
//			if(sStr.equals("q")) {
//				break;
//			}
//			int sInt = Integer.parseInt(sStr);
//			sum += sInt;
//			
//		}
//		System.out.println("입력한 정수의 합 :" + sum);
	}
}
