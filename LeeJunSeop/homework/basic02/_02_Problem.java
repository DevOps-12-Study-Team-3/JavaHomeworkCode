package homework.basic02;

public class _02_Problem {
//	2. ConcatString 클래스를 하나 만들고 String 타입의 값 2개를 매개변수로 받아서 문자열 결합을 진행하고 
//	결합된 문자열을 리턴하는 메소드를 구현하세요. 
	public static void main(String[] args) {
		ConcatString cs = new ConcatString();
		String text1 = "Hello";
		String text2 = "World";
		
		System.out.println(cs.concatString(text1, text2));;
	}
}
