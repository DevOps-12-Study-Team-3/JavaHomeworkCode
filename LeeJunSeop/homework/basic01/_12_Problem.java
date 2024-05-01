package homework.basic01;

import java.util.Scanner;

public class _12_Problem {
	public static void main(String[] args) {
//		12. 정수 10개를 입력받아 배열에 저장하고, 
//	    이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int[] inputIntArr = new int[10];
		
		for(int i = 0; i < inputIntArr.length; ++i) {
			System.out.print(i+"번째 배열에 값을 입력하세요 : ");
			inputIntArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < inputIntArr.length; ++i) {
			if(inputIntArr[i] % 2 == 0 || inputIntArr[i] % 3 == 0)
				System.out.println("inputIntArr["+i+"] = "+inputIntArr[i]+"는 2의 배수 또는 3의 배수이다.");
		}
		
		
		sc.close();
	}

}
