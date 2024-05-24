package homework.middle05;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
//		// aaabbccab
//		// abc
		
		// String 클래스의 인스턴스의 메소드 중에 indexOf()를 사용하면
		// 문자로 들어오는 값이나 문자열이 처음 나오는 index 값을 반환한다
		// 해당하는 조건이 없다면 -1반환
		String str = "aaabbccab";
		String result = "";
//		boolean[] isDuplicatedArr = new boolean[str.length()];
//		int cnt = 0;
//		for(int i = 0; i < str.length(); ++i) {
//			if(!isDuplicatedArr[i]) {
//				for(int j = i+1; j < str.length(); ++j) {
//					if(str.charAt(i) == str.charAt(j)) {
//						isDuplicatedArr[j] = true;
//					}
//				}
//			}
//		}
//		
//		for(int i = 0; i < str.length(); ++i) {
//			if(!isDuplicatedArr[i]) tempStr += str.charAt(i);
//		}
		
		for(int i = 0 ; i < str.length(); ++i) {
			if(str.indexOf(str.charAt(i)) == i) result += str.charAt(i);
		}
		
		System.out.println(result);
	}

}
