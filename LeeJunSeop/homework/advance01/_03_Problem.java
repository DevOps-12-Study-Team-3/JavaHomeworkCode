package homework.advance01;

public class _03_Problem {

	public static void main(String[] args) {
//		3. 다음과 같이 출력하세요.
//	    *
//	   ***
//	  *****
//	 *******
//	*********
		final int HEIGHT = 5;
		final int WIDTH = 9;
		for(int i = 0; i< HEIGHT; ++i) {
			for(int j = 0; j <= WIDTH / 2 - i; ++j){
				System.out.print(" ");
			}
		
			for(int j = 0; j <= i*2; ++j) {
				 System.out.print("*");
			}
			System.out.println();
		}

	}

}
