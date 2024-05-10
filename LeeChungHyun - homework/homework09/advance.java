package chap99_homework.myself09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요");
		
		String str = sc.nextLine();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		
		Character maxChar = str.charAt(0);
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > map.get(maxChar)) {
				maxChar = entry.getKey();
			}
			
		}
		
		System.out.println("" + maxChar + "가 가장 많이 사용되었고 "+ map.get(maxChar) + "개 나타났습니다.");
		
		
		
		
	}

}
