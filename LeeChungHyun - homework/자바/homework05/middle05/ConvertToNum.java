package chap99_homework.myself05.middle;

public class ConvertToNum {
	public static String convertToNum(String s1) {
		String str = "";
		for(int i = 0; i < s1.length() ; i++) {
			if( i % 3 == 0 || i % 5 != 0 ) {
				str += 3;
			} else if( i % 5 == 0 || i % 3 != 0 ) {
				str += 5;
			} else if(i % 3 == 0 && i % 5 != 0 )
			{
				str += 35;
			} else {
				str += s1.charAt(i);
			}
		}
		return str;
	}
}
