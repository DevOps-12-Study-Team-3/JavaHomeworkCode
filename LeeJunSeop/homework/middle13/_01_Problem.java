package homework.middle13;

public class _01_Problem {
//	1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 
//	역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
//	StringBuilderUtils 함수형 인터페이스 선언, 
//	StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
	public static void main(String[] args) {
		StringBuilder strBuilder1 = new StringBuilder("Hello");
		StringBuilder strBuilder2 = new StringBuilder("World");
		
		System.out.println(strBuilder1);
		System.out.println(strBuilder2);
		
		StringBuilder resultSb = combineStrBuilder(strBuilder1, strBuilder2, (sb1, sb2) ->{
			StringBuilder sumSb = sb1.append(sb2);
			StringBuilder reverseSb = new StringBuilder();
			for(int i = sumSb.length() - 1 ; i >= 0; i--) {
				reverseSb.append(sumSb.charAt(i));
			}
			
			return reverseSb;
		});
		
		System.out.println(resultSb);
		
	}
	
	public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2, 
			StringBuilderUtils sbu) {
		return sbu.combineStrBuilder(sb1, sb2);
	}
}
