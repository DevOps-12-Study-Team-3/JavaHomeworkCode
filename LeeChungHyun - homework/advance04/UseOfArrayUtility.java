package chap99_homework.myself04.advance;

public class UseOfArrayUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s1 = {2,3,4,5,6,7};
		int[] s2 = {2,3,5,6,9};
		
		int[] s3 = ArrayUtility2.remove(s1, s2);
		
		for(int i = 0; i < s3.length ; i++) {
			System.out.println(s3[i]);
		}
		
	}

}
