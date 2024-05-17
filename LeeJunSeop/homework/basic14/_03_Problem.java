package homework.basic14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 
//		스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		int size = 10;
		List<String> strList = new ArrayList<>();	
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < size; ++i) {
			System.out.print((i+1)+"번 째 문자열 입력 : ");
			strList.add(sc.nextLine());
		}
		System.out.println("-----------------------");
//		strList.stream()
//		       .filter(str -> {
//		    	   for(int i = 0 ; i < str.length(); ++i) {
//		    		   if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
//		    				   || (str.charAt(i) >= 'A' && str.charAt(i) == 'Z'))
//		    			   return true;
//		    	   }
//		    	   return false;
//		       })
//		       .forEach(str -> System.out.println(str));
		strList.stream()
	       .filter(str -> Pattern.matches(".*[a-zA-Z]+.*", str))
	       .forEach(str -> System.out.println(str));
		
		
		sc.close();
		
	}
}
