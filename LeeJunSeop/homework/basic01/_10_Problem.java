package homework.basic01;

import java.util.Scanner;

public class _10_Problem {
	public static void main(String[] args) {
//		10. int배열을 10개 생성해서
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 총합을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 10; ++i) {
			System.out.print(i+1 +"번째 값 입력 : ");
			int inputNum = sc.nextInt();
			System.out.println(inputNum);
			sum += inputNum;
		}
		System.out.println("총합 : " + sum);
		
		sc.close();
	}

}
