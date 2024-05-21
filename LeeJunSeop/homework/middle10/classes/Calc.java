package homework.middle10.classes;

public class Calc<T extends Number> {
//	2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고 
//	T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 메소드를 구현하세요. 
//	각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.
//	(Math.round()로 소수점 두자리까지만 표출)
	public double add(T[] arr) {
		double sum = 0.;
		for(int i = 0; i < arr.length; ++i) {
			sum += arr[i].doubleValue();
		}
		
		return (double)Math.round(sum * 100) / 100;
	}
	public double sub(T[] arr) {
		double sub = arr[0].doubleValue();
		for(int i = 1; i < arr.length; ++i) {
			sub -= arr[i].doubleValue();
		}
		
		return (double)Math.round(sub * 100) / 100;
	}
	
	public double mul(T[] arr) {
		double mul = 1.;
		for(int i = 0; i < arr.length; ++i) {
			mul *= arr[i].doubleValue();
		}
		
		return (double)Math.round(mul * 100) / 100;
	}
	public double div(T[] arr) {
		double div = arr[0].doubleValue();
		for(int i = 1; i < arr.length; ++i) {
			if(arr[i].doubleValue() != 0.) div /= arr[i].doubleValue();
		}
		
		return (double)Math.round(div * 100) / 100;
	}
}
