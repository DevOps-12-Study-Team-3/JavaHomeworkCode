package chap99_homework.myself07;

import java.util.Scanner;

public class advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		// StringBuilder sb = new StringBuilder(str); 로도 선언가능
		
		for(int i = 0 ; i < sb.length() - 1 ; i++) {
			if(sb.charAt(i) == sb.charAt(i+1)) { // i번째 문자와 (i+1) 번째 문자가 같으면
				sb.deleteCharAt(i+1); // 뒤의 문자 제거
				i--; // 이때 다음 i로 그냥 넘어가면 3개 이상 연속할 시 문제가 생기므로 i를 원위치로 바꿈
			}
		}
		System.out.println(sb.toString());
	}

}
