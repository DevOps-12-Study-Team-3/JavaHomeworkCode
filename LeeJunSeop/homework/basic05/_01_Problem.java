package homework.basic05;

public class _01_Problem {
	public static void main(String[] args) {
		Car car1 = new HybridCar();
		ElectronicCar car2 = new HybridCar();
		FuelCar car3 = new HybridCar();
		HybridCar car4 = new HybridCar();
		
		System.out.println("차 1");
		car1.speedUp();
		car1.speedDown();
		
		System.out.println("차 2");
		car2.speedUp();
		car2.speedDown();
		car2.charge();
		
		System.out.println("차 3");
		car3.speedUp();
		car3.speedDown();
		car3.addFuel();
		
		System.out.println("차 4");
		car4.speedUp();
		car4.speedDown();
		car4.charge();
		car4.addFuel();
		
	}
}
