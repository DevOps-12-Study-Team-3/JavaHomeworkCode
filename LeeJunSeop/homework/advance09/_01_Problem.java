package homework.advance09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();	
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); ++i) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else map.put(str.charAt(i), map.get(str.charAt(i)).intValue() + 1);
		}
		
		int max = 0;
		char ch = 0;
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(max < entry.getValue()) {
				 max = entry.getValue();
				 ch = entry.getKey();
			}
		}
		
		System.out.println(ch +"의 개수 : " + max);
		
		sc.close();
	}
}
