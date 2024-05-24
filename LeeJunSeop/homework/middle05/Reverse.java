package homework.middle05;

public class Reverse {
//	1. Reverse라는 클래스를 만들고 메소드로 
//	   String reverseString(String str)를 만듭니다.
//	    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.

	public String reverseString(String str) {
		String returnStr = "";
		for(int i = str.length() -1; i >= 0; --i) {
			returnStr += str.charAt(i);
		}
		
		return returnStr;
	}
	
}
