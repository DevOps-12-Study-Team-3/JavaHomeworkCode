package homework.basic12.first.variables;

import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int num1; 
		int num2;
		char ch;
		
		System.out.print("정수 1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		

		System.out.print("연산자 입력 : ");
		ch = sc.nextLine().charAt(0);
		
		switch(ch) {
		case '+' : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
		case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); break;
		case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); break;
		case '/' : System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2)); break;
		case '%' : System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); break;
		default : break;
		};
		
		
		
		sc.close();
	}
}
