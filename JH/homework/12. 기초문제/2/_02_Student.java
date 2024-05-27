package chap00_practice;

public class _02_Student {
	public String name;
	public String studentNum;
	public String major;
	
//	public _02_Student(String name, String studentNum, String major) {
//		this.name = name;
//		this.studentNum = studentNum;
//		this.major = major;
//	}
	
	public void SaveStInfo(String name, String studentNum, String major) {
		this.name = name;
		this.studentNum = studentNum;
		this.major = major;
	}
	
	public void PrintStInfo() {
		System.out.println(name + ", " + studentNum + ", " + major);
	}
}
