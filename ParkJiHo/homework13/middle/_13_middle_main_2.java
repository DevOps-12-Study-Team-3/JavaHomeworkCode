package homework_my.homework13.middle;

public class _13_middle_main_2 {

	public static void main(String[] args) {
		
		/*
			2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 
			   역순으로 변경하는 메소드 reverseSb를 각각 선언하고 
			   StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
		 */
		
        // 테스트용 StringBuilder 두 개 생성
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(" world!");

        // combineStrBuilder 메소드 호출하여 결과 출력
        StringBuilder result = combineStrBuilder(sb1, sb2);
        System.out.println("결과: " + result);	
	}
	
	// StringBuilder를 합치는 메소드
    public static StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2) 
    {
        return sb1.append(sb2);
    }

    // StringBuilder를 역순으로 변경하는 메소드
    public static StringBuilder reverseSb(StringBuilder sb) 
    {
        return sb.reverse();
    }

    // combineStrBuilder 메소드 정의
    public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 
    {
        return reverseSb(appendSb(sb1, sb2));
    }	
	
}
