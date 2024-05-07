package chap99_homework.homework05;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		System.out.println("속도를 올린다");
		// TODO Auto-generated method stub

	}

	@Override
	public void speedDown() {
		System.out.println("속도를 낮춘다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void addFuel() {
		System.out.println("연료를 주입한다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void charge() {
		System.out.println("배터리를 충진한다.");
		// TODO Auto-generated method stub

	}

}
