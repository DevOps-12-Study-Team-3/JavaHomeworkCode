package homework.basic07;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		비어있는 바이트의 공간을 a로 모두 채우시오.
		
		StringBuffer strBuffer = new StringBuffer("hello");
		
		System.out.println("문자열 길이 : "+ strBuffer.length());
		System.out.println("버퍼 크기 : "+ strBuffer.capacity());
		
		for(int i = strBuffer.length() ; i < strBuffer.capacity(); ++i) {
			strBuffer.insert(i, 'a');
		}
		
		System.out.println(strBuffer);
	}
}
