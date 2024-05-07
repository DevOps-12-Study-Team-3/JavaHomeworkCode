package homework.basic04;

public class Parent {

	private String firstname;
	private String bloodType;
	private double height;
	private String skinColor;
	
	public Parent() {
		
	}

	public Parent(String firstname, String bloodType, double height, String skinColor) {
		super();
		this.firstname = firstname;
		this.bloodType = bloodType;
		this.height = height;
		this.skinColor = skinColor;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	
	
}
