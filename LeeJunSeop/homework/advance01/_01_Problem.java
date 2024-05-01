package homework.advance01;

import java.util.Scanner;

public class _01_Problem {

	public static void main(String[] args) {
//		1. . 사용자가 입력한 금액을 오만원권, 만원권, 오천원권, 천원권
//		, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요.
//		   출력 개수는 단위가 큰 것 순서로 계산합니다
//		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 
//		   100원 1개, 50원 1개, 10원 2개> 입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		int[] safeValues = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] safe = new int[safeValues.length];
		
		System.out.println("입력한 금액 : " + money);
		for(int i = 0; i < safeValues.length; ++i) {
			safe[i] = money / safeValues[i];
			money %= safeValues[i];
			
			System.out.println(safeValues[i] + "원 : "+safe[i] +"매(혹은 개)");
		}
		
		sc.close();
		
		
		
	}

}
