package chap99_homework.myself04.middle;

// 3개의 정숫값을 입력하고 최댓값을 구합니다.

import java.util.Scanner;

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
		int max = a;
		
		if(b>a) {
			max = b;
			if(c>b) {
				max = c;
			}
		}else {
			if(c>a) {
				max = c;
			}
		}

		System.out.println("최댓값은 " + max + "입니다.");
	}
}