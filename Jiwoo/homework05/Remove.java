package chap99_homework.homework05;

public class Remove {
	
	public String reverseString(String str) {
		char[] charArr = str.toCharArray();
							// 문자열을 문자배열로 변환하는 저장 메소드
		int length = charArr.length;
							// 배열의 길이를 알아냄, length()문자열의 길이
		for (int i = 0; i < length / 2; i++) {
			char temp = charArr[i];
			charArr[i] = charArr[length - 1 - i];
			charArr[length - 1 - i] = temp;
		}
		
		return new String(charArr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse reverser = new Reverse();
		
		String testString = "hello";
		
		System.out.println(reverser.reverseString(testString));
		
	}

}
