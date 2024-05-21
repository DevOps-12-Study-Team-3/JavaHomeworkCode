package myhw.hwJava.Class;

public class Student {
	
	// 1. 학생의 이름, 학번, 학과를 속성으로 가지고 
	// 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
	
	 private String name;
	 private int studentID;
	 private String major;

	
	 public Student(String name, int studentID, String major) {
	    this.name = name;
	    this.studentID = studentID;
	    this.major = major;
	    }
	 
	 public void displayInfo() {
	        System.out.println("이름: " + name);
	        System.out.println("학번: " + studentID);
	        System.out.println("학과: " + major);
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getStudentID() {
	        return studentID;
	    }

	    public void setStudentID(int studentID) {
	        this.studentID = studentID;
	    }

	    public String getDepartment() {
	        return major;
	    }

	    public void setDepartment(String department) {
	        this.major = department;
	    }
}
