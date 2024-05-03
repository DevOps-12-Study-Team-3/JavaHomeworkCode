package homework.middle05;

import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println("문자열 : " + str);
		
		System.out.println("반전된 문자열 : " + new Reverse().reverseString(str));
		
		sc.close();
	}
}
