package homework.middle04;

public class _03_Problem {
	public static void main(String[] args) {
		int[] intArr = {1,2,3};
		double[] doubleArr = {11.1, 22.2, 33.3};
		
		System.out.println("정수 배열");
		for(int num : intArr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("정수 배열 -> 실수 배열");
		for(double num : ArrayUtility.intToDouble(intArr)) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("==============================");
		System.out.println("실수 배열");
		for(double num : doubleArr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("실수 배열 -> 정수 배열");
		for(int num : ArrayUtility.doubleToInt(doubleArr)) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
