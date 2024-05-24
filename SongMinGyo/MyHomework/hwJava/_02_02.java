package myhw.hwJava;

import myhw.hwJava.Class.Book;
import myhw.hwJava.Class.Student;

public class _02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생의 이름, 학번, 학과를 속성으로 가지고 
		// 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
		Student stu = new Student("김미영", 2015111075, "정보보호학과");
        stu.displayInfo();
        
        System.out.println("--------------------");
    
		// 2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 
        // 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
		Book book = new Book("폭풍의 언덕", "에밀리 브론테","민음사", 18000);
		book.displayInfo();
		
		// 3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
