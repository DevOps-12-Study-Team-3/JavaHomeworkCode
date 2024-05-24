package homework.middle14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class _03_Problem {
	static final int MAXLEN = 10;
	public static void main(String[] args) {
//		3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 
//		스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		
		
		Scanner sc = new Scanner(System.in);
		List<Character> charList = new ArrayList<>();
		
		
		String str = "";
		while(true) {
			str = sc.nextLine();
			if(str.length() == MAXLEN) break;
		}
		
		for(int i = 0; i < MAXLEN; ++i) {
			charList.add(str.charAt(i));
		}
		
		charList.stream()
				.map(ch -> Character.isUpperCase(ch) ? 
						Character.toLowerCase(ch) : Character.toUpperCase(ch))
				.forEach(ch -> System.out.print(ch));
				
	
		sc.close();
	}
}
