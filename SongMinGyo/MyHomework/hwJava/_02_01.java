package myhw.hwJava;

import java.util.Arrays;
import java.util.Scanner;

public class _02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
		  int[] num = new int[10];
		  
	       for (int i = 0; i < num.length; i++) {
	           num[i] = i + 1;
	        }
	       
	        for (int number : num) {
	            System.out.println(number);
	        }
	        
	        
	        System.out.println("--------------------");
		
	        // 2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 
	        // 배열의 모든 요소를 출력하세요.
	        // **"q를 입력하기까지" 구현/ 무한한 배열 값 표현
	        Scanner sc = new Scanner(System.in);
	        int[] num2 = new int[1000];
	        
	        for(int i = 0; i < 100; i++) {
	        	num2[i] = i + 1;
	        	
	        }
	        
	        System.out.println("--------------------");
	        
	        // 3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
	        int[] num3 = new int[10];
	        
	        System.out.println("10개의 정수를 입력하세요.");
	        
	        int sum = 0;

	        for (int i = 0; i < num3.length; i++) {
	            num3[i] = sc.nextInt();
	            sum += num3[i];
	        }

	        int avg = sum / 10;

	        for (int number : num3) {
	            System.out.println(number);
	        }

	        System.out.println("평균: " + avg);
	        
	        System.out.println("--------------------");
	        
	        // 4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 
	        // 배열의 합을 계산하여 출력하세요.
	        int[] num4 = new int[50];
	        int sum2 = 0;
	        
	        for(int i = 0,  j = 2; i < 50 ; i++, j += 2) {
	        	if(j % 2 == 0) {
	        	num4[i] = j;
	        	sum += j;
	        	}	
	        }
	        
//	        for (int number : num4) {
//	            System.out.print(number + ", ");
//	        }
	        
	        sc.nextLine();
	        System.out.println("배열의 합: " + sum);
	        
	        System.out.println("--------------------");
	        
	        // 5. 사용자가 입력한 10개의 정수를 배열에 저장하고 
	        // 최소값과 최대값을 찾아서 출력하세요.
	        System.out.println("10개의 정수를 입력하세요.");
	        int[] num5 = new int[10];

	        for(int i = 0; i < 10; i++) {
	        	num5[i] = sc.nextInt();
	        }
	        
	        int min = 0;
	        int max = 0;
	        
	        min = num5[0];
	        max = num5[0];

	        for(int i = 1; i < 10; i++ ) {
	        	if(num5[i] < min)
	        		min = num5[i];
	        }
	        
	        for(int i = 1; i < 10; i++ ) {
	        	if(num5[i] > max)
	        		max = num5[i];
	        }
	        
	        System.out.println("최대값: " + max + ", 최소값: " + min);
	        
	        System.out.println("--------------------");
	        
	        // 6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 
	        // 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
	        System.out.println("5개의 문자열을 입력하세요.");
	        String[] str = new String[5];
	        
	        for(int i = 0; i < 5; i++) {
	        	// ** sc.nextLine() 이라고 했을 떄 왜 안되지...?
	        	str[i] = sc.next();	        	
	        }
	        
	        String minLength = str[0];
	        String maxLength = str[0];
	        
	        for(int i = 1; i < 5; i++ ) {
	        	if(str[i].length() < minLength.length())
	        		minLength = str[i];
	        }
	        
	        for(int i = 1; i < 5; i++ ) {
	        	if(str[i].length() > maxLength.length())
	        		maxLength = str[i];
	        }
	        
	        System.out.println("길이가 가장 긴 문자열: " + maxLength + ", 길이가 가장 작은 문자열: " + minLength);
	        
	        System.out.println("--------------------");
	        
	        // 7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 
	        // 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 
	        // 두 배열을 합친 새로운 배열을 생성하세요.
	        int[] arr1 = new int[4];
	        int[] arr2 = new int[3];
	        
	        for(int i = 0; i < arr1.length; i++) {
	        	arr1[i] = (int)(Math.random() * 100)+ 1;
	        }
	        
	        for(int i = 0; i < arr2.length; i++) {
	        	arr2[i] = (int)(Math.random() * 100)+ 1;
	        }
	        
	        int[] mergedArray = mergeArrays(arr1, arr2);
	        
	        System.out.println(Arrays.toString(mergedArray));
	        System.out.println("--------------------");
	        
	        // 8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. 
	        // -기준으로 잘라진 문자열 배열을 생성하고 
	        // 잘라진 문자열 중에 가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.

	        
	        
	        
	        
	        
	        
	        
	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
	}

}
