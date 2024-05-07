package homework.basic05;

public class HybridCar implements ElectronicCar, FuelCar{

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도 상승");
		
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub

		System.out.println("속도 감소");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료를 채웁니다.");
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("차를 충전합니다");
	}
	

}
