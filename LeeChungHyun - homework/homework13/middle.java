package chap99_homework.myself13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class middle {
	public static void main(String args[]) {
//		1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고 
//		List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), 
//		(4, 정도전, 97), (5, 이순신, 95)를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 
//		들어있는 Stream을 만드세요.
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		Stream<Student> highScoreStudent = studentList.stream().filter(stu -> stu.getScore() >= 95);

//		2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
	
		highScoreStudent.map(stu -> {
										stu.setGrade("A+");
										return stu;
									})
						.forEach(stu -> System.out.println(stu));
		

//		3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서 
//		영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		List<Character> charList = new ArrayList<Character>();
		
		for(int i =  0 ; i < 10 ; i++) {
			System.out.println( i + "번째 영문자를 입력하세요");
			charList.add(sc.nextLine().charAt(0));
		}
		
		charList.stream().map( c -> {
			if(c >= 'a' && c <= 'z') {
				return (char) (c-32);
			}else {
				return (char) (c+32);
			}
		}).forEach(c -> System.out.print(c));
		
		sc.close();
		
	}
}
