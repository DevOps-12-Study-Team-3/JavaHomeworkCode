package homework.basic02;

import java.util.Scanner;

public class _01_Problem {
//	1. int 값을 하나 매개변수로 전달받아서 1부터 매개변수로 전달된 값까지의 총합을 구해서 총합을 리턴하는 메소드를 구현하세요. 
//	실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다.
//	(예시 public static void add(int a, int b) { return a + b; })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intVal;
		while(true) {
			System.out.print("0보다 큰 정수 값 입력 : ");
			intVal = sc.nextInt();
			if(intVal > 0) break;
		}
		
		System.out.println("1부터 "+ intVal+"까지의 총 합 : " + totalSum(intVal));
		
		sc.close();
		
	}

	
	private static int totalSum(int last) {
		int sum = 0;
		for(int i = 1; i <= last; ++i) {
			sum += i;
		}
		
		return sum;
			
	}

}
