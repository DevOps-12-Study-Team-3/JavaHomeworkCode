package homework.middle02;

public class _02_Problem {
//	2. char 배열 한 개를 매개변수로 받아서 소문자는 대문자로, 
//	대문자는 소문자로 변환하는데 대문자로 변환된 값은 뒤로 하나 이동한 문자를 
//	소문자로 변환된 값는 앞으로 하나 이동한 문자를 저장한 배열을 리턴하는 메소드를 구현하세요. 
//	매개변수로 전달되는 char 배열에는 알파벳 대소문자만 존재합니다. 
//	{'y', 'B', 'c', 'D'} 배열이 전달되면 {'Z', 'a', 'D', 'c'}가 리턴돼야 합니다. 
//	그리고 만약 'z'가  입력되면 'A'가 'a'가 입력되면 'Z' 리턴돼야 합니다(알파벳 범위내에서만 이동할수 있도록).
//	실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다. 
//	(예시 public static void add(int a, int b) { return a + b; })

	public static void main(String[] args) {
		char[] chArr = {'A', 'E', 'Z', 'a', 'f', 'z'};
		char[] convertArr = convertAlphabet(chArr);
		
		for(int i = 0; i < convertArr.length; ++i)
			System.out.print(convertArr[i] + " ");
		
	}
	
	public static char[] convertAlphabet(char[] chArr) {
		char[] targetArr = new char[chArr.length];
		for(int i = 0; i < targetArr.length; ++i) {
			// 대소문자 반전
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') targetArr[i] = (char)(chArr[i] + ('a' - 'A'));
			else targetArr[i] = (char)(chArr[i] - ('a' - 'A'));
			
			
			// 위치 이동
			if(targetArr[i] == 'Z') targetArr[i] = 'A';
			else if(targetArr[i] == 'a') targetArr[i] = 'Z';
			else if(targetArr[i] >'a' && targetArr[i] <= 'z') targetArr[i] -= 1;
			else targetArr[i] += 1;
		}
	
		return targetArr;
	}
}
