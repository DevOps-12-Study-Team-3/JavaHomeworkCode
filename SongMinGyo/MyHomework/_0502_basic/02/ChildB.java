package HW_0502_basic_02;

public class ChildB extends Parent {
	int fingerPrint;
	
	public ChildB(long firstName, int bloodType, int height, String skinColor, int fingerPrint) {
		super(firstName, bloodType, height, skinColor);
		this.fingerPrint = fingerPrint;
		
	}
}
