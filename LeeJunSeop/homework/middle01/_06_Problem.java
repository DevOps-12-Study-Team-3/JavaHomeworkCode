package homework.middle01;

public class _06_Problem {
	public static void main(String[] args) {
//		6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
//		6-1)  
//		*
//		**
//		***
//		****
//		*****
		final int WIDTH = 5;
		final int HEIGHT = 5;
		for(int i = 0; i < HEIGHT; ++i) {
			for(int j = 0; j < WIDTH; ++j) {
				System.out.print("*");
				if(i == j) break;
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		
//		6-2)
//		    *
//		   **
//		  ***
//		 ****
//		*****
		for(int i = 0; i < HEIGHT; ++i) {
			for(int j = WIDTH - 1; j >= 0; --j) {
				if(i >= j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
//		6-3)
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = HEIGHT - 1; i >= 0; i--) {
			for(int j = 0; j < WIDTH; ++j) {
				System.out.print("*");
				if(i == j) break;
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
//		6-4)
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i = HEIGHT - 1; i >= 0; i--) {
			for(int j = WIDTH; j >= 0; j--) {
				if(i >= j) System.out.print("*");
				else System.out.print(" ");
				
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
	}
}
