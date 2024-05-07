package homework.middle06;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 처음에 은행에 맡긴 돈은 10000원입니다
//		   금리는 연 10%입니다
//		   복리이자로 계산했을 때 10년후 얼마가 될까요?
//		원금이 A, 이율이 r, 기간이 n일 경우 복리법에 의한 원리합계는 A(1+n)^n
		
		int principal = 10000;
		double interest = 0.10;
		int year = 10;
		double total = (double)principal;
		for(int i = 0; i < year; ++i) {
			total *= (1+interest);
		}
		
		System.out.println("원금 : " + principal);
		System.out.println("금리 : " + (int)(interest*100));
		System.out.println("기간 : " + year);
		System.out.println("복리법에 의한 원리합계 : " + total);
	}
}
