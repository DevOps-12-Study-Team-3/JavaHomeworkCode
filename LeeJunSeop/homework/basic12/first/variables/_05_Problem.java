package homework.basic12.first.variables;

import java.util.Scanner;

public class _05_Problem {
	public static void main(String[] args) {
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		int inputSize = 3;
		int[] inputIntArr = new int[3];
		for(int i = 0; i < inputSize; ++i) {
			inputIntArr[i] = sc.nextInt();
		}
	
		sc.nextLine();
	
		// bubble sort
		for(int i = 0; i < inputSize; ++i) {
			for(int j = i; j < inputSize - 1; ++j) {
				if(inputIntArr[j] > inputIntArr[j+1]) {
					int temp = inputIntArr[j];
					inputIntArr[j] = inputIntArr[j+1];
					inputIntArr[j+1] = temp;
				}
			}
		}
		
		System.out.println("최소값 : " + inputIntArr[0]);
		System.out.println("중간값 : " + inputIntArr[1]);
		System.out.println("최대값 : " + inputIntArr[2]);
		
		
		sc.close();
	}
}
