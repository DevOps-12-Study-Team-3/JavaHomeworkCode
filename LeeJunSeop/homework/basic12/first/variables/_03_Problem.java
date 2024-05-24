package homework.basic12.first.variables;

public class _03_Problem {
	private static final double pi = 3.14;
	
	public static void main(String[] args) {
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//	    단, 원주율 3.14는 상수로 선언하세요.
		int radius = 20;
		System.out.println("원의 넓이 : " + area(radius));

		System.out.println("원의 둘레 : " + round(radius));
		
	}
	
	public static double area(int radius) {
		return pi * radius * radius;
	}
	
	public static double round(int radius) {
		return 2 * pi * radius;
	}
}
