package homework.basic02;

public class _03_Problem {
//	3. 2번에서 만든 메소드를 오버로딩해서 String 타입의 값 2개와 int 타입의 값 1개를 매개변수로 받아서 
//	문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.
	public static void main(String args[]) {
		ConcatString cs = new ConcatString();
		String text1 = "Hello";
		String text2 = "World";
		int intNum = 2024;
		
		System.out.println(cs.concatString(text1, text2, intNum));;
	}
}
