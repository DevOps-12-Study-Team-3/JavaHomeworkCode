package MyHomework.hw0508;

import java.util.Scanner;

public class _middle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 
		// 사용자가 정수를 입력하고 
		// 위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
		
		StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		sb = sb.reverse();
		System.out.println(sb);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sb.length() + " 이하의 정수를 입력하세요.");
		
		int i = sc.nextInt();
		
        char result = sb.charAt(i);
        System.out.println(i + "번째의 문자는 " + result);
       

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
