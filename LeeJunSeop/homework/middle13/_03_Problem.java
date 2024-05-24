package homework.middle13;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 
//		static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고 
//		maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 
//		람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
		
		int size = 20;
		int[] intArr = new int[size];
		for(int i= 0; i < size; ++i) {
			intArr[i] = (int)(Math.random() * 100);
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
	
		System.out.println("최대값 : " + maxOrMinOrMid(intArr, IntArrUtils::getMax));
		System.out.println("최소값 : " + maxOrMinOrMid(intArr, IntArrUtils::getMin));
		System.out.println("중간값 : " + maxOrMinOrMid(intArr, IntArrUtils::getMid));

	}
		
	
	public static int maxOrMinOrMid(int[] intArr, MaxMinMid mmm) {
		return mmm.maxOrMinOrMid(intArr);
	}
}
