package homework.advance07;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		String str = "aabbcdeffaaaaynguuuuuu";
		StringBuilder strBuilder = new StringBuilder(str);
		char tempCh = 0;
		for(int i = 0; i < strBuilder.length(); ++i) {
			if(tempCh != strBuilder.charAt(i))
				tempCh = strBuilder.charAt(i);
			else
			{
				strBuilder.deleteCharAt(i);
				i--;
			}
		}
		
		System.out.println(strBuilder);
	}
}
