package HW_0502_basic_01;

public class Lion extends Cat {
	boolean tail;
	
	public Lion(String size, int age, boolean tail) {
		super(size, age);
		this.tail = tail;
		// TODO Auto-generated constructor stub
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

	
	public void lifestyle() {
		System.out.println("무리지어 산다.");
	}
}
