
public class HybridCar implements ElectronicCar, FuelCar {
//	   ElectronicCar, FuelCar를 상속받는 HybridCar 클래스로 구현하세요.
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도 증가");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도 감소");
	}

	
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("하이브리드 연료 충전");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("충!전!");
	}

}
