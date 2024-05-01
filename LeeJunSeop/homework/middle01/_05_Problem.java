package homework.middle01;

import java.util.Random;

public class _05_Problem {

	public static void main(String[] args) {
//		5. 20개 배열을 선언하세요.
//	    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//	    인덱스의 홀수번째는 앞에서부터 출력하고
//	    짝수번째는 뒤에서부터 출력하세요.
		
		Random rand = new Random();
		
		int[] randIntArr = new int[20];
		for(int i = 0; i < 20; ++i) {
			randIntArr[i] = rand.nextInt(101);
		}
		
		System.out.println("홀수번째 인덱스는 앞에서부터 출력");
		for(int j = 0; j < randIntArr.length; j++) {
			if(j % 2 == 1)
				System.out.print("randIntArr["+j+"] = " + randIntArr[j] +" ");
		}

		System.out.println();
		System.out.println("짝수번째 인덱스는 뒤에서부터 출력");
		
		for(int k = randIntArr.length - 1; k >= 0; k--) {
			if(k % 2 == 0)
				System.out.print("randIntArr["+k+"] = " + randIntArr[k] +" ");
		}

		System.out.println();
	}

}
