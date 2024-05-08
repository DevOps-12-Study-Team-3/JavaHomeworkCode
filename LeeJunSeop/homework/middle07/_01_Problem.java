package homework.middle07;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		StringBuffer strBuffer = new StringBuffer(30);
		strBuffer.append("hello");
		int emptySize = strBuffer.capacity() - strBuffer.length();
		
		for(int i = 0; i < emptySize; ++i) {
			if(i % 3 == 0) strBuffer.append('b');
			else if(i % 3 == 1) strBuffer.append('i');
			else strBuffer.append('t');
		}
		
		System.out.println(strBuffer);
	
	}
}
