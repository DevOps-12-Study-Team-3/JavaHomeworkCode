package chap99_homework.myself05.middle;

public class Remove {
	public static String remove(String s1) {
		String str = "";
		
		for(int i = 0 ; i < s1.length(); i++) {
			boolean isDup = false;
			for(int j = 0 ; j < i ; j++) {
				if(s1.charAt(j) == s1.charAt(i)) {
					isDup = true;
					break;
				}
			}
			if(!isDup) str += s1.charAt(i);
		}
		return str;
	}
}
