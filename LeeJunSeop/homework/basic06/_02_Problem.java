package homework.basic06;

import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//		   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		
		System.out.println("사용자가 입력한 문자열 : "+inputStr);
		
		inputStr = inputStr.replace("a", "");
		inputStr = inputStr.replace("e", "");
		inputStr = inputStr.replace("i", "");
		inputStr = inputStr.replace("o", "");
		inputStr = inputStr.replace("u", "");
	
		System.out.println("알파벳 모음 제거한 문자열 : " + inputStr);
		
		sc.close();
	}
	
}
