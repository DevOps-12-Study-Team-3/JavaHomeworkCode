package homework.middle10;

import homework.middle10.classes.CoffeeMenu;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다. 
//		가격이 값이 되고 순서대로 2000, 3000, 4000, 4500으로 지정한다. 
//		메뉴의 총 가격을 계산하는 추상 메소드를 정의하고 각각의 상수에서 구현하는데 
//		아메리카노(아이스 300 추가), 라떼(아이스 500 추가), 모카(휘핑 1000 추가), 콜드브루(시럽 200 추가) 
//		모든 메뉴 옵션 없는 주문은 지정한 가격대로 진행된다. 
//		totalPrice(int optionOrder, int normalOrder) 
//		옵션 추가 잔수와 일반 메뉴 잔수를 받아서 각 메뉴의 가격을 계산하는 추상 메소드 구현한다. 
//		아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요.
		
		int iceAmeCnt = 2;
		int hotAmeCnt = 1;
		int iceLatteCnt = 1;
		int whipMochaCnt = 2;
		int coldbrewCnt = 2;
		
		int price = 0;
		
		System.out.println("아아 "+iceAmeCnt + "잔 뜨아 " + hotAmeCnt + "잔 아라 "+iceLatteCnt + ""
				+ "잔 휘핑 모카 " + whipMochaCnt + "잔 콜드브루 "+ coldbrewCnt + "잔 가격 : "
						+ "" + (CoffeeMenu.AMERICANO.totalPrice(iceAmeCnt, hotAmeCnt) + 
						CoffeeMenu.LATTE.totalPrice(iceLatteCnt, 0) + 
						CoffeeMenu.MOCHA.totalPrice(whipMochaCnt, 0) + 
						CoffeeMenu.COLDBREW.totalPrice(0, coldbrewCnt)));
	}
}
