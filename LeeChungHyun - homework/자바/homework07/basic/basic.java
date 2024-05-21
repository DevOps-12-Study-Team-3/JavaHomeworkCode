package chap99_homework.myself07;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 3개 입력하세요");
			
		StringBuffer sb = new StringBuffer(); // 입력받은 문자열 붙여나갈 버퍼 준비
		
		String str; // 입력받는 문자열 저장
		
		for(int i = 0 ; i < 3; i ++) {
			str = sc.nextLine();
			sb.append(str); // 저장받은 문자열 버퍼에 추가
		}

		System.out.println("3개를 합친 문자열은 " + sb.toString());
		
		System.out.println("---------------------------");
	
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		StringBuffer sb2 = new StringBuffer(30);
		sb2.append("hello");
		
		int spaceNum = sb2.capacity() - sb2.length(); // 공백의 개수
		
		for(int i = 0 ; i < spaceNum ; i++) {
			sb2.append('a'); // 공백 개수만큼 a 추가
		}
		
		System.out.println(sb2.toString());
	}

}
