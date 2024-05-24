package homework.middle07;

import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 사용자가 정수를 입력하고 
//		위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
		
		StringBuffer strBuffer = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		
		int idx = sc.nextInt();
		sc.nextLine();
		
		System.out.println("뒤집기 전 : " + strBuffer);
		System.out.println("뒤집은 후 : " + strBuffer.reverse());
		System.out.println(idx+"번째 문자 : " + strBuffer.charAt(idx));
		
	}
}
