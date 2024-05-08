package homework.basic06;

import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String inputStr = sc.nextLine();
		
		System.out.println("사용자 입력 문자열 : " + inputStr);
		int gaCnt = 0;
		int baCnt = 0;
		for(char ch : inputStr.toCharArray()) {
			if(ch == '가') gaCnt++;
			if(ch == '바') baCnt++;
		}
		
		if(gaCnt + baCnt == 0)
			System.out.println("가, 바가 존재하지 않습니다.");
		else System.out.println("가의 개수 : " + gaCnt + ", 바의 개수 : " + baCnt);
		
		sc.close();
	}
}
