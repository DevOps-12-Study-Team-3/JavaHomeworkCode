package homework.middle13;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 
//		역순으로 변경하는 메소드 reverseSb를 각각 선언하고 
//		StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.

		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("World");
		
		System.out.println(combineStrBuilder(sb1, sb2));
		
	}
	
	public static StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2, 
			AppendStringBuilder asb) {
		return asb.appendSb(sb1, sb2);
	}
	
	public static StringBuilder reverseSb(StringBuilder sb, ReverseStringBuilder rsb) {
		return rsb.reverseSb(sb);
	}
	
	public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) {
		return reverseSb(appendSb(sb1, sb2, (str1, str2) ->{
			StringBuilder sumSb = str1.append(str2);
			return sumSb;
		}), sb -> {
			StringBuilder reverseSb = new StringBuilder();
			for(int i = sb.length() - 1 ; i >= 0; i--) {
				reverseSb.append(sb.charAt(i));
			}
			
			return reverseSb;
		});
	}
	
}
