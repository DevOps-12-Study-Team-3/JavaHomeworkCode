package homework.basic04;

public class ChildB extends Parent {
	private boolean haveFingerPrint;

	public ChildB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChildB(String firstname, String bloodType, double height, String skinColor,
			boolean haveFingerPrint) {
		super(firstname, bloodType, height, skinColor);
		this.haveFingerPrint = haveFingerPrint;
	}

	public boolean isHaveFingerPrint() {
		return haveFingerPrint;
	}

	public void setHaveFingerPrint(boolean haveFingerPrint) {
		this.haveFingerPrint = haveFingerPrint;
	}
	
}
