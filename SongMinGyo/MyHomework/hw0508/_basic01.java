package MyHomework.hw0508;

import java.util.Scanner;

public class _basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[3];
		
		System.out.println("문자열 3개를 입력하세요.");
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		String newStr1 = str1.concat(str2);
		String newStr2 = newStr1.concat(str3);
		
		System.out.println(newStr2);
		
		
		sc.close();
	}

}
