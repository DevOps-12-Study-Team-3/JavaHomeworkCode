package chap00_practice;

public class _02_Class {
	public static void main(String[] args) {
//		1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
		_02_Student stu = new _02_Student();
		stu.SaveStInfo("반재형", "1999", "Java");
		stu.PrintStInfo();
		
//		2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
		_02_Book book = new _02_Book();
		book.SaveInfo("개미", "베르나르", "출판", 20000);
		book.PrintInfo();
		
//		3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
		_02_SumString sumString = new _02_SumString();
		System.out.println(sumString.ReturnString("안녕", "하세요"));
		
//		4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
		_02_Multiply mul = new _02_Multiply();
		System.out.println(mul.Mul(1, 3.5415));
		
//		5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.

//		6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.

//		7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
//		    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 
	}
}
