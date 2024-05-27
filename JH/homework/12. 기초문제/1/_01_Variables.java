package chap00_practice;

import java.util.Scanner;

public class _01_Variables {
	public static void main(String[] args) {
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 입력.");
//		String name = sc.nextLine();
//		System.out.println("나이 입력.");
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.println("성별 입력.");
//		String sex = sc.nextLine();
//		
//		System.out.println("이름은 " + name + "나이는 " + age + "성별은 " + sex);
		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//		System.out.println("정수 2개 입력.");
//		int sInt1 = sc.nextInt();
//		int sInt2 = sc.nextInt();
//		int op = sInt1 + sInt2;
//		char add = '+';
//		
//		System.out.println(sInt1 + " + " + sInt2 + " = " + op);
		
		
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
		
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
//
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													  2 * 2 = 4
//													  .....
//													  2 * 9 = 18 
//
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		
		int[] intArr = new int[10];
		int primeCnt = 0;
		System.out.println("숫자 10개 입력.");
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
			
			if(intArr[i] < 2 || intArr[i] > 30) {
				System.out.println("2 ~ 30의 숫자를 입력");
				i--;
				continue;
			}
			boolean isPrime = true;
			for(int j = 2; j <= Math.sqrt(intArr[i]); j++) {
				if(intArr[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeCnt++;
			}
		}
		System.out.println("소수의 개수 : " + primeCnt);
	}
}
