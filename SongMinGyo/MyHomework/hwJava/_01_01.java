package myhw.hwJava;

import java.util.Scanner;

public class _basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수
		// 1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		String name;
		int age;
		String sex;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요.");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별을 입력하세요.");
		sex = sc.nextLine();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + sex);
		
		System.out.println("--------------------");
		
		// 2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 
		// 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		int num1;
		int num2;
		char operator;
		
		System.out.println("첫 번째 정수를 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요.");
		num2 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요.");
		operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println("num1 + num2 = " + (num1 + num2));
			break;
		case '-':
			System.out.println("num1 - num2 = " + (num1 - num2));
			break;
		case '*':
			System.out.println("num1 * num2 = " + (num1 * num2));
			break;
		case '/':
			System.out.println("num1 / num2 = " + (num1 / num2));
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
	}
		
		System.out.println("--------------------");
		
		// 3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.
		// (넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
	    // 단, 원주율 3.14는 상수로 선언하세요.
		double PI = 3.14;
		int radius = 20;
		
		double volume = (PI * radius * radius);
		double round = ((2 * radius) * PI);
		
		System.out.println("반지름이 20인 원의 넓이는 " + volume + 
				" , 원의 둘레는 " + round);
		
		System.out.println("--------------------");
		
		// 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		System.out.println("5개의 정수를 입력하세요.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		int sum = n1 + n2 + n3 + n4 + n5;
		int avg = sum / 5;
		
		System.out.println("입력한 5개의 정수의 합계: " + sum +
				", 평균: " + avg);
		
		System.out.println("--------------------");
		
		// 5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		System.out.println("세 개의 정수를 입력하세요.");
		
		int n6 = sc.nextInt();
		int n7 = sc.nextInt();
		int n8 = sc.nextInt();
		
		int min, mid, max;
        
        if (n6 <= n7 && n6 <= n8) {
            min = n6;
        } else if (n7 <= n6 && n7 <= n8) {
            min = n7;
        } else {
            min = n8;
        }

        if (n6 >= n7 && n6 >= n8) {
            max = n6;
        } else if (n7 >= n6 && n7 >= n8) {
            max = n7;
        } else {
            max = n8;
        }

        mid = n6 + n7 + n8 - min - max;
        
        System.out.println("최소 값: " + min);
        System.out.println("중간 값: " + mid);
        System.out.println("최대 값: " + max);
    
        System.out.println("--------------------");
        
        // 6. 사용자가 입력한 정수의 구구단을 출력하세요.
		int n9 = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n9 + " * " + i + " = " + (n9 * i));
		}
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
