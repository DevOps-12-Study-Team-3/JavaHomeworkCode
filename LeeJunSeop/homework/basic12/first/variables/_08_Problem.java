package homework.basic12.first.variables;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Problem {
	public static void main(String[] args) {
		int inputSize = 10;
		int[] intArr = new int[10];
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < inputSize; ++i) {
			intArr[i] = sc.nextInt();
			if(max < intArr[i]) max = intArr[i];
		}
		
		boolean[] isPrimeArr = new boolean[max+1];
		
		Arrays.fill(isPrimeArr, true);
		
		isPrimeArr[0] = isPrimeArr[1] = false;
		
		for(int i = 2; i*i <= max; ++i) {
			if(isPrimeArr[i]) {
				for(int j = i*i ; j <= max; j+=i) {
					isPrimeArr[j] = false;
				}
			}
		}
		
		for(int i = 0; i < inputSize; ++i) {
			if(isPrimeArr[intArr[i]]) System.out.println(intArr[i]+"는 소수입니다.");
			else System.out.println(intArr[i] +"는 소수가 아닙니다.");
		}
		
		
		sc.close();
	}
}
