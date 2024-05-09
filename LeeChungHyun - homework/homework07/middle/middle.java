package chap99_homework.myself07;

import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		StringBuffer sb3 = new StringBuffer(30);
		sb3.append("hello");
		
		int spaceNum2 = sb3.capacity() - sb3.length();
		
		for(int i = 0 ; i < spaceNum2 ; i++) {
			if( i % 3 == 0) {
				sb3.append('b');
			}else if( i % 3 == 1) {
				sb3.append('i');
			}else if(i % 3 == 2) {
				sb3.append('t');
			}
		}
		
		System.out.println(sb3.capacity());
		System.out.println(sb3.toString());
		
		System.out.println("----------------------");
		
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
