package HW_0502_basic_01;

public class Tiger extends Cat {

	boolean hasWing;
	
	public Tiger(String size, int age, boolean hasWing) {
		super(size, age);
		this.hasWing = hasWing;
		// TODO Auto-generated constructor stub
	}
	
	public void eat() {
		System.out.println("고기를 먹는다.");
	}
	
	public void sleep() {
		System.out.println("크게 웅크려서 잔다.");
		
	}
	
	public void home() {
		System.out.println("들판에서 산다.");
	}
	
	public void hair() {
		System.out.println("갈기가 없다.");
	}
	
	}

