package homework.basic03;

public class SmartPhone {
//	1. SmartPhone 클래스를 생성하고 속성 세 개와 기능 세 개를 자유롭게 만들어보세요.
	private String brand;
	private String model;
	private int battery;
	
	public SmartPhone() {
		this.brand = "삼성";
		this.model = "갤럭시S24";
		this.battery = 100;
	}
	
	public SmartPhone(String brand, String model, int battery) {
		this.brand = brand;
		this.model = model;
		this.battery = battery;
	}
	
	public void bootPhone() {
		System.out.println("스마트폰을 작동합니다");
	}
	
	public void chargeBattey() {
		System.out.println("스마트폰을 충전합니다. 현재 남은 배터리 : "+this.battery);
	}
	
	public void turnOnDisplay() {
		System.out.println("스마트폰 화면을 켭니다");
	}
}
