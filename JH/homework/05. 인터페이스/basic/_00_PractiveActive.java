
public class _00_PractiveActive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new HybridCar();
		ElectronicCar elecCar = new HybridCar();
		FuelCar fuelCar = new HybridCar();
		
		car.speedUp();
		car.speedDown();
		
		elecCar.speedUp();
		elecCar.speedDown();
		elecCar.charge();
		
		fuelCar.speedUp();
		fuelCar.speedDown();
		FuelCar.addFuel(); // 연료 충전
		
//		fuelCar.charge();
		
		HybridCar hybrid = new HybridCar();
		hybrid.addFuel(); // 하이브리드 연료 충전
	}

}
