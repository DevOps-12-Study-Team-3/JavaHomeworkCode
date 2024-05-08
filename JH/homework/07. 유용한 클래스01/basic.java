package chap00_practice;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		Scanner sc = new Scanner(System.in);
		StringBuffer sum = new StringBuffer();
		
		System.out.println("1번 문자열 입력 : ");
		String inputStr1 = sc.nextLine();
		
		System.out.println("2번 문자열 입력 : ");
		String inputStr2 = sc.nextLine();
		
		System.out.println("3번 문자열 입력 : ");
		String inputStr3 = sc.nextLine();
		
		sum.append(inputStr1 + inputStr2 + inputStr3);
		
		System.out.println(sum);
		
//---------------------------------------------------------------------------		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		// 크기가 30인 StringBuffer
		StringBuffer sb = new StringBuffer(30);
		// "hello"라는 문자열이 담겨있다
		sb.append("hello");
		
		int remainBufferSize = sb.capacity() - sb.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			sb.append("a");
		}
		System.out.println(sb);
	}

}
