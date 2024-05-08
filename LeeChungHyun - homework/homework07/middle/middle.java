package chap99_homework.myself07;

import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		int spaceNum = sb.capacity() - sb.length(); // 공백의 개수
		
		for(int i = 0 ; i < (spaceNum/3)+1 ; i++) {
			sb.append("bit"); // 공백에 bit 문자열 반복해서 추가
		}
		sb.setLength(30); // 문자열 길이가 30을 초과하므로 30만큼 자름
		
		System.out.println(sb);
		
		System.out.println("----------------------");
		
		// 이 방식은 한번 문자열아 크기 30을 한번 초과하므로 버퍼가 자동으로 크기가 늘어나있음
		// 여기선 62로 증가
		// setLength는 길이만 줄이고 크기는 고정
		// 크기도 30으로 맞추고 싶으면 bit를 mod3으로 분기시켜서 하나씩 넣어서 문자열 길이가
		// 30이 되는 순간 for문 종료시키면 됨
		
//
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 
		// 사용자가 정수를 입력하고 위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 
		//입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
		
		StringBuffer sb2 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요.");
		
		int idx = sc.nextInt();
		
		sb2.reverse(); // 문자열 역순
		System.out.println(sb2.charAt(idx)); // 문자열의 idx번째 문자 추출
		

	}

}
