
public interface FuelCar extends Car {
//	Car를 상속받는 FuelCar(void addFuel()) 인터페이스를 만들고
	static void addFuel() {
		System.out.println("연료 충전");
	}
}
