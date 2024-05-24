package homework.basic12.first.variables;

import java.util.Scanner;

public class _07_Problem {
//	7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		long result = 1;

		System.out.print(num + "! = ");
		while(num > 0) {
			result *= num--;
		}
		
		System.out.println(result);
		
		
		sc.close();
	}
}
