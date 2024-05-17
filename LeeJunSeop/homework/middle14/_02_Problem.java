package homework.middle14;

import java.util.ArrayList;
import java.util.List;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺼정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		studentList.stream()
				   .filter(student -> student.getScore() >= 95)
				   .forEach(student ->{
					  student.setGrade("A+");
					  System.out.println(student);
				   });
	}
}
