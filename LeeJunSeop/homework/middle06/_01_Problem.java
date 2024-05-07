package homework.middle06;

import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
//	    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String inputStr = sc.nextLine();
		int firstIdx = inputStr.length() / 2 % 2 == 0 ?
						inputStr.length() / 2 - 1 : inputStr.length() / 2;
		int lastIdx = inputStr.length() / 2 % 2 == 0 ?
				inputStr.length() / 2 : inputStr.length() / 2;
		
		for(int i = firstIdx; i <= lastIdx; ++i) {
			System.out.print(inputStr.charAt(i));
		}
		
		sc.close();
	}
}
