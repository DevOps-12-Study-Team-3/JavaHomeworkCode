package chap99_homework.homework05;

public class Reverse {

		// TODO Auto-generated method stub
//		1. Reverse라는 클래스를 만들고 메소드로 
//		   String reverseString(String str)를 만듭니다.
//		    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.
	public String reverseString(String str) {
		
		String reversed = "";
		
		for( int i = 0; i < str.length(); i++) {
			reversed = str.charAt(i) + reversed  ;
		}
	
		return reversed;

	}
	public static void main(String[] args) {
		Reverse reverser = new Reverse();
		
		String testString = "Hello, world!";
		System.out.println(reverser.reverseString(testString));
		
	}
	
}

