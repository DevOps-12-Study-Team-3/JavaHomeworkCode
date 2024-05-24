package MyHomework.hw0508;

public class _basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    // 비어있는 바이트의 공간을 a로 모두 채우시오.
		
		StringBuffer sb = new StringBuffer(30);
		
		sb.append("hello");
		
		System.out.println(sb.toString().replace("", "a"));
		
		
		
		System.out.println("--------------------------------------");
		
		StringBuffer sb2 = new StringBuffer(30);
		
        sb2.append("hello");
 
        int remain = 30 - sb2.length();
        for (int i = 0; i < remain; i++) {
            sb2.append('a');
        }
        
        System.out.println(sb2.toString());
		
		
		
		
	}

}
