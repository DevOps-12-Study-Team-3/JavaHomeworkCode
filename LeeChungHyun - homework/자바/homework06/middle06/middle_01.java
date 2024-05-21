package chap99_homework.myself06.middle;

import java.util.Scanner;

public class middle_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		// 문자의 길이
		int len = str.length();
		
		// 가운데 위치 (ex 3이면 1, 4면 2)
		int mid = len/2;
		
		if(len % 2 != 0) {
			System.out.println(str.charAt(mid));
		}else {
			System.out.print(str.charAt(mid-1));
			System.out.println(str.charAt(mid));
		}
		
	}
}
