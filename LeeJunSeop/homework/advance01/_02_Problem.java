package homework.advance01;

import java.util.Scanner;

public class _02_Problem {

	public static void main(String[] args) {
//		2. 369게임을 작성합니다.
//		   1~99까지의 정수를 입력받고
//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//		   2개가 있으면 "박수짝짝"을 출력하세요
//		   예를 들어 13은 "박수짝"
//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		
		Scanner sc = new Scanner(System.in);
		int intVal;
		while(true) {
			System.out.print("1 ~ 99사이 정수를 입력하세요 : ");
			intVal = sc.nextInt();
			if(intVal >= 1 && intVal <= 99) break;
			
			System.out.println("1 ~ 99 사이 정수값만 입력해 주세요!");
		}
		
		int cnt369 = 0;
		int[] array369 = new int[2];
		
		array369[0] = (intVal / 10) % 10;
		array369[1] = intVal % 10;
		
		for(int i = 0; i < array369.length; ++i) {
			if(array369[i] == 3 || array369[i] == 6 || array369[i] == 9)
				cnt369++;
		}
		
		if(cnt369 == 2) System.out.println("박수짝짝");
		else if(cnt369 == 1) System.out.println("박수짝");
		else System.out.println("박수X");
		
		
		sc.close();
	}

}
