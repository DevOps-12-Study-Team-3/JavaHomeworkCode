package homework.basic12.first.variables;

import java.util.Scanner;

public class _04_Problem {

//4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int[] intArr = new int[size];
		
		for(int i = 0 ; i < size; ++i) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			intArr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		int sum = 0;
		double average = 0.;
		for(int i = 0; i < size; ++i) {
			sum += intArr[i];
		}
		average = (double)sum / size;
		
		System.out.println("총합 : " + sum +", 평균 : " + average);
		
		
	}
}
