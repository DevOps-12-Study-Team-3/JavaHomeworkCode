package homework.basic06;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용
		double dVal = 16.459;
		System.out.println("처음 값 : "+ dVal);
		System.out.println("해당 값을 소수점 둘 째 자리까지 반올림 한 값 : "
				+ (double)Math.round(dVal * 100) / 100);
		
	}
}
