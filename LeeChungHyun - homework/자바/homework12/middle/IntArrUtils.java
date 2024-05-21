package chap99_homework.myself12;

public class IntArrUtils {
//	3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 
//	구현하고 maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
	
	public static int getMax(int[] intArr, MaxMinMid maxMinMid) {
		return maxMinMid.maxOrMinOrMid(intArr);
	}
	
	public static int getMin(int[] intArr, MaxMinMid maxMinMid) {
		return maxMinMid.maxOrMinOrMid(intArr);
	}
	
	public static int getMid(int[] intArr, MaxMinMid maxMinMid) {
		return maxMinMid.maxOrMinOrMid(intArr);
	}
}
