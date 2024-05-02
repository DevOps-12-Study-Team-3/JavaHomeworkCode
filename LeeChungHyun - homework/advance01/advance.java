package chap99_homework.myself01;

import java.util.Scanner;

public class advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("가격을 입력하세요");
		int price = sc.nextInt();
		int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int numCoin = coin.length;
		for(int i = 0; i < numCoin ; i++) {
			int d = price / coin[i];
			System.out.println(coin[i] + " : " + d + " 개 " );
			price -= d * coin[i];
		}

		System.out.println("-----------------");
		
		System.out.println("1 ~ 99 까지의 정수를 입력하세요");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 0 ; i < 2 ; i++) {
			int d = num % 10;
			if(d == 3 || d == 6 || d == 9) {
				cnt++;
			}
			num = (num - d) / 10;
		}
		switch(cnt) {
			case 1 : System.out.println("박수짝");
					 break;
			case 2 : System.out.println("박수짝짝");
					 break;
		}
		sc.close();
		
		
		System.out.println("-----------------");
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= (5 - i) ; j++) {
					System.out.print(" ");
			}
			for(int j = 1 ; j <= (2 * i  - 1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
