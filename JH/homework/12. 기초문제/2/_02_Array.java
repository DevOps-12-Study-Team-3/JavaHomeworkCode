package chap00_practice;

import java.util.Scanner;

public class _02_Array {
	public static void main(String[] args) {
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
//		int[] intArr = new int[10];
//		
//		for(int i = 0; i < intArr.length; i++) { 			
//			System.out.println(intArr[i]+i+1);
//		}
		
//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		int[] intArr = new int[1000];
//		int i = 0;
//		
//		while (true) {
//			System.out.println("정수를 입력.(q 입력 시 종료)");
//			String sStr = sc.nextLine();
//			if(sStr.equals("q")) {
//				break;
//			}
//			intArr[i] = Integer.parseInt(sStr);
//			i++;
//		} 
//		
//		for(int j = 0; j < i; j++) {
//			System.out.println(intArr[j]);
//		}
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
//		int[] intArr = new int[10];
//		int sum = 0;
//		int average = 0;
//		for(int i = 0; i < intArr.length; i++) {
//			System.out.println("정수 입력.");
//			intArr[i] = sc.nextInt();
//			sum += intArr[i];
//		}
//		average = sum / 10;
//		System.out.println(average);
//		
//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
//		int[] intArr = new int[50];
//		int index = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				 intArr[index++] = i;
//			}
//		}
//		
//		int sum = 0;
//		for (int num : intArr) {
//			sum += num;
//		}
//		
//		System.out.println(sum);
//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
		int[] intArr = new int[10];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
//			for(int i)
		}
//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
//
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
//
//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//		    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
	}
}
