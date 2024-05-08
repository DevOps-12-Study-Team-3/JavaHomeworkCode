package chap99_homework.myself06.basic;

import java.util.Scanner;

public class basic_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		// 가, 바의 개수를 담을 변수 준비
		int cnt = 0;
		
		for(int i = 0; i < str.length() ; i++) {
			if(str.charAt(i) == '가' || str.charAt(i) == '바') {
				 cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("문자열 속 가, 바의 개수는 " + cnt + "개 입니다.");
		}
	}
}
