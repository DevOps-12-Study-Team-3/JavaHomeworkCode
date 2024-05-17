package homework.basic14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
		int size = 10;
		List<String> strList = new ArrayList<>();	
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < size; ++i) {
			System.out.print((i+1)+"번 째 문자열 입력 : ");
			strList.add(sc.nextLine());
		}
		
		System.out.println("-----------------------");
		
		strList.stream()
			   .filter(str->str.length() >= 5)
			   .forEach(str -> System.out.println(str));
		
		sc.close();
	}
}
