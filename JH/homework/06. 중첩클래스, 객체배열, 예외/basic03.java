package chap00_practice;

public class basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용
		double d = 16.459;
		d *= 100;
		d = (Math.round(d));
		d /= 100;
		System.out.println(d);
	}

}
