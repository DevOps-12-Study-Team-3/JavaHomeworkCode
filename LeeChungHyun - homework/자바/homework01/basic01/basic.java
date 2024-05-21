package chap99_homework.myself01;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		
		System.out.println("--------------------------------");
		
		int a = 10; 
		int b = 20;
		System.out.println(a < b);
		System.out.println(a > b);
		
		System.out.println("--------------------------------");
		
		int i = 10;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("--------------------------------");
		i = 10;
		do {
			System.out.println(i);
			i--;
		} while(i > 0);
		
		System.out.println("--------------------------------");
		
		for(i = 10 ; i > 0 ; i--) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		
		int sum = 0;
		i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("--------------------------------");
		
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println(sum);
		
		System.out.println("--------------------------------");
		
		sum = 0;
		for(i = 1 ; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("--------------------------------");
		
		int[] intArr = new int[10];
		for(i = 0; i < intArr.length ; i++) {
			intArr[i] = (i + 1) * 3;
		}
		for(i = intArr.length - 1 ; i >= 0 ; i--) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		int[] intArr_2 = new int[10];
		sum = 0;
		System.out.println("숫자 10개 입력하세요");
		for(i = 0 ; i < intArr_2.length ; i++) {
			intArr_2[i] = sc.nextInt();
			sc.nextLine();
			sum += intArr_2[i];
		}
		System.out.println("총합 : " + sum);
		
		System.out.println("--------------------------------");

		int [] intArr_3 = new int[10];
		for(i = 0 ; i < intArr_3.length ; i++) {
			intArr_3[i] = (int)(Math.random()*10) + 1;
			if(intArr_3[i] % 2 != 0) {
				System.out.println(intArr_3[i]);
			}
		}
	
		System.out.println("--------------------------------");

		int[] intArr_4 = new int[10];
		System.out.println("숫자 10개 입력하세요");
		for(i = 0 ; i < intArr_4.length ; i++) {
			intArr_4[i] = sc.nextInt();
		}
		for(i = 0 ; i < intArr_4.length ; i++) {
			if(intArr_4[i] % 2 == 0 || intArr_4[i] % 3 == 0) {
				System.out.println(intArr_4[i]);
			}
		}
		
		sc.close();
		
	}

}
