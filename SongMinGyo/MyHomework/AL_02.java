package myhw;

import java.util.Scanner;

public class AL_02 {

// 문제: 총 N개의 정수가 주어졌을 때, 정수 v 가 몇 개인지 구하는 프로그램을 작성하시오.
	
// 입력: 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
// 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v 가 주어진다. 
// 입력으로 주어지는 정수와 v 는 -100보다 크거나 같으며, 100보다 작거나 같다.
	
// 출력: 첫째 줄에 입력으로 주어진 N개의 정수 중에 v 가 몇 개인지 출력한다
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("정수의 개수 N을 입력하세요.");
	        int N = sc.nextInt();

	        System.out.println("N개의 정수를 입력하세요.");
	        int[] A = new int[N];
	        for (int i = 0; i < N; i++) {
	            A[i] = sc.nextInt();
	        }
	        
	        System.out.println("탐색할 정수 V를 입력하세요.");
	        int v = sc.nextInt();

	        int count = 0;
	        for (int i = 0; i < N; i++) {
	            if (A[i] == v) {
	                count += 1;
	            }
	        }

	        System.out.println(count);

	 }
}
