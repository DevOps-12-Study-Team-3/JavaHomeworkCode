package MyHomework.hw0508;

public class _middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    // 비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		StringBuffer sb = new StringBuffer(30);
		
        sb.append("hello");
        
        int remaining = 30 - sb.length();
        int repeatCount = remaining / 3; 
        int extraChars = remaining % 3; 
        
        for (int i = 0; i < repeatCount; i++) {
            sb.append("bit");
        }
        
        
        if (extraChars > 0) {
            sb.append("bit", 0, extraChars);
        }
        
        
        System.out.println(sb.toString());
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


