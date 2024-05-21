package chap99_homework.myself06.basic;

import java.util.Scanner;

public class basic_02 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		// 모음이 제어된 문자열 담을 공간 준비
		String removedVowelStr = "";
		
		for(int i = 0; i < str.length() ; i++) {
			if(str.charAt(i) != 'a' && str.charAt(i) != 'A'&&
					str.charAt(i) != 'e' && str.charAt(i) != 'E'&&
					str.charAt(i) != 'i' && str.charAt(i) != 'I'&&
					str.charAt(i) != 'o' && str.charAt(i) != 'O'&&
					str.charAt(i) != 'u' && str.charAt(i) != 'U') {
				removedVowelStr += str.charAt(i);
			}
		}
		
		System.out.println(removedVowelStr);
	}
}
