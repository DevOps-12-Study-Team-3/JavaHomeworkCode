package homework.basic04;

public class ChildA extends Parent {
	private String lastname;

	public ChildA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChildA(String firstname, String bloodType, double height, String skinColor, 
			String lastname) {
		super(firstname, bloodType, height, skinColor);
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
