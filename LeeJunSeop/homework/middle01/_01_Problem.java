package homework.middle01;

public class _01_Problem {

	public static void main(String[] args) {
//		1. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
//		for(int i = 1; i <= 100; i++) {
//			if()  {
//				System.out.print(i + ", ");
//			} => if문의 조건만 완성
//		}
		
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
