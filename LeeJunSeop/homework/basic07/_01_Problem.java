package homework.basic07;

import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		Scanner sc = new Scanner(System.in);
		
		String str1 = "Hello";
		String str2 = "JAVA";
		String str3 = "World!";
		
		System.out.print("1번째 문자열 입력 : ");
		str1 = sc.nextLine();
		System.out.print("2번째 문자열 입력 : ");
		str2 = sc.nextLine();
		System.out.print("3번째 문자열 입력 : ");
		str3 = sc.nextLine();
		
		StringBuffer strBuffer = new StringBuffer();
		
		strBuffer.append(str1).append(str2).append(str3);
		
		System.out.println(strBuffer);
		
		sc.close();
	}
}
