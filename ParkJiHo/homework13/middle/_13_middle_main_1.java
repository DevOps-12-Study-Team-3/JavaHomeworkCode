package homework_my.homework13.middle;

public class _13_middle_main_1 {

	public static void main(String[] args) {
		
		
		/*
			1. 두 개의 StringBuilder 값을 매개변수로 받아 
			두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
			
			StringBuilderUtils 함수형 인터페이스 선언, 
			StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언	

		 */
		
        // 테스트용 StringBuilder 두 개 생성
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(" world!");

        // 함수를 사용하여 메인에서 호출
        StringBuilder result = combineStrings(sb1, sb2, (sb1Input, sb2Input) -> {
            sb1Input.append(sb2Input);
            return sb1Input.reverse();
        });

        // 결과 출력
        System.out.println("결과: " + result);

	}
	
	
    // 함수 정의
    public static StringBuilder combineStrings( StringBuilder sb1, StringBuilder sb2, StringBuilderUtils stringBuilderUtils ) 
    {
        return stringBuilderUtils.combineStrBuilder( sb1 , sb2 );
    }
	
	
}
