package homework.homework12.chap02;

public class Student {
	
	public String Student_name ; // 이름
	
	public String Student_no ; // 학번
	 
	public String Student_major ; // 전공

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getStudent_no() {
		return Student_no;
	}

	public void setStudent_no(String student_no) {
		Student_no = student_no;
	}

	public String getStudent_major() {
		return Student_major;
	}

	public void setStudent_major(String student_major) {
		Student_major = student_major;
	}

	public void Student_info_save( String Student_name , String Student_no , String Student_major )
	{
		this.Student_name = Student_name ;
		this.Student_no = Student_no ;
		this.Student_major = Student_major ;
	}
	
	public void Student_info_print()
	{
		System.out.println( "학생의 이름 : " + getStudent_name() );
		System.out.println( "학생의 학번 : " + getStudent_no() );
		System.out.println( "학생의 전공 : " + getStudent_major() );

	}
	
	
}
