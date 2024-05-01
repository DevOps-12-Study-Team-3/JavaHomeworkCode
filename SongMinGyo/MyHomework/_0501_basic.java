package MyHomework;

public class _0501_basic {
	// 1. SmartPhone 클래스를 생성하고 속성 세 개와 기능 세 개를 자유롭게 만들어보세요.
	public class SmartPhone {
		
		public String company;
		
		public String color;
	
		public int price;
		
	public SmartPhone() {
	}
	
	public SmartPhone(int price) {
		this.price = price;
	}
	
	public void turnOn() {
	System.out.println("전원 On");
	}
	
	public void turnOff() {
		System.out.println("전원 Off");
	}
	
	public void callIn() {
		System.out.println("전화 수신");
	}
	
	public void callack() {
		System.out.println("전화 발신");
	}
	
	public void printCarInfo() {
		System.out.println("제조사: " + company);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	
	}
}

}