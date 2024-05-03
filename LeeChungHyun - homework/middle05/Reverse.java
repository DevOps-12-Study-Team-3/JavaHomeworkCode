package chap99_homework.myself05.middle;

public class Reverse {
	public static String reverseString(String str) {
		String revStr = "";
		for(int i = 0 ; i < str.length() ; i++) {
			revStr += str.charAt(str.length()-i-1);
		}
		return revStr;
	}
}
