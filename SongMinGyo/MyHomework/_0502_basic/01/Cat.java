package HW_0502_basic_01;

public class Cat extends Mam {
	int age;
	
	public Cat() {
		
	}

	public Cat(String size, int age) {
		super(size);
		this.age = age;
	}


	public void eat() {
		System.out.println("츄르를 먹는다.");
	}
	
	public void sleep() {
		System.out.println("웅크려서 잔다.");
		
	}
	
	public void home() {
		System.out.println("상자 안에 산다.");
	}
}
