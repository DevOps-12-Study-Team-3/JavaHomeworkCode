package chap00_practice;

import java.util.Scanner;

public class basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//		   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		Scanner sc = new Scanner(System.in);


		System.out.println("알파벳을 입력하세요 : ");
		String inputStr	= sc.nextLine();
		String result = removeString(inputStr);
		System.out.println(result);
	}
	
	public static String removeString(String input) {
		return input.replaceAll("[aeiouAEIOU]", "");
	}
	

}
