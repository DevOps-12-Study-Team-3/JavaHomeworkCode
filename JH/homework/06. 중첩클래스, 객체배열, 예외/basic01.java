package chap00_practice;

import java.util.Scanner;

public class basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		Scanner sc = new Scanner(System.in);
		String[] inputStr = new String[5];
		int count = 0;
		for(int i = 0; i < inputStr.length; i++) {
			System.out.println("문자를 입력하세요 : ");
			inputStr[i] = sc.nextLine();
			if(inputStr[i].equals("가") || inputStr[i].equals("바")) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println(count + "개");
		}
	}

}
