package homework.basic12.first.variables;

import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String mw;
		
		System.out.print("사용자 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("사용자 나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("사용자 성별 입력 : ");
		mw = sc.nextLine();
		
		System.out.println("사용자 이름 :" + name + ", 나이 : "+age + ", 성별 : "+mw);
		
		sc.close();
	}
}
