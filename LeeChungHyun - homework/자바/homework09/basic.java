package chap99_homework.myself09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.

		Map<String, Integer> alpahbet = new HashMap<>();
		
		for(char c = 'A' ;  c <= 'Z'; c++) {
			alpahbet.put(String.valueOf(c), (int)c);
		}
		
		for(char c = 'a' ;  c <= 'z'; c++) {
			alpahbet.put(String.valueOf(c), (int)c);
		}
		
		System.out.println(alpahbet);
		
	}
//	2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 특정 이름의 전화번호를 조회하는 기능을 구현하세요.
	
	public static void search(Map<String, String> phonenumber, String name) {
		System.out.println(phonenumber.get(name));
	}


}
