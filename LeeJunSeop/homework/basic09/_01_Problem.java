package homework.basic09;

import java.util.HashMap;
import java.util.Map;

public class _01_Problem {
	public static void main(String[] args) {
//		1. Map<String, Integer>을 하나 생성하여 
//		key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		Map<String, Integer> alphabetUniMap = new HashMap<>();
		
		for(int i = 'A'; i <= 'Z'; ++i) {
			alphabetUniMap.put((char)i + "", i);
		}
		
		for(int i = 'a'; i <= 'z'; ++i) {
			alphabetUniMap.put((char)i + "", i);
		}
		
		System.out.println(alphabetUniMap);
	}
}
