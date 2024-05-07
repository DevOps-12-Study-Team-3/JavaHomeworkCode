package chap99_homework.myself06.middle;

public class middle_03 {
	public static void main(String args[]) {
		
		// 원금
		double initMoney = 10000;
		
		// 이자율
		double rate = 0.1;
		
		// 10년 후 금액을 저장할 변수
		double Money = initMoney;
		
		for(int i = 0 ; i < 10; i ++) {
			Money *= (1+rate);
		}
		
		System.out.println("10년 후 금액은 " + Money + " 원 입니다.");
	}
}
