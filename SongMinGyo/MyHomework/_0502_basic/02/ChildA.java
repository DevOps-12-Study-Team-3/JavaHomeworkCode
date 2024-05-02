package HW_0502_basic_02;

public class ChildA extends Parent {
	int name;
	
	public ChildA(long firstName, int bloodType, int height, String skinColor, int name) {
		super(firstName, bloodType, height, skinColor);
		this.name = name;
		
	}
	
}
