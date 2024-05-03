package homework.middle05;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 사용자가 입력한 문자열에서 인덱스가 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
//		3, 5의 공배수 인덱스 일 때는 35로 변경
//		// aaaaaaaaaaa
//		// aaa3a53aa35
		
		String str = "aaaaaaaaaaaaaaaaaaaaa";
		String result = "";
		result += str.charAt(0);
		for(int i = 1; i < str.length(); ++i) {
			if(i % 3 == 0 && i % 5 == 0) result += "35";
			else if(i % 3 == 0) result += "3";
			else if(i % 5 == 0) result += "5";
			else result += str.charAt(i);
		}
		
		System.out.println(result);
	}
}
