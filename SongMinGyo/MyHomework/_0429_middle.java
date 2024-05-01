package MyHomework;

public class _0429_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0)  {
				System.out.print(i + ", ");
			} 
			// => if문의 조건만 완성
		}
		System.out.println(" ");
		System.out.println("--------------------");	
		
		// ^^3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
		int j = 1;
		while(j <= 10) {
			if(j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
		System.out.println("--------------------");	
		
		// 4. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요.
		for(int l = 1; l <= 1000; l++) {
			if( l % 2 == 0 && l % 7 == 0)
			System.out.println(l);
		}
		
		System.out.println("--------------------");	
		
		
		// ^^5. 20개 배열을 선언하세요. 20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고,
		// 인덱스의 홀수번째는 앞에서부터 출력하고, 짝수번째는 뒤에서부터 출력하세요.	
		
		// 6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
		// 6-1. 
		// a 01234 / b 01234
		for(int a = 1; a <= 5; a++) {
			for(int b = 0; b < a ; b++) {
				System.out.print("*");
		}
				System.out.println();
			}
		System.out.println("--------------------");	
		
		// 6-2.
		for(int c = 1; c <= 5; c++) {
			for(int d = 5; d > 0; d--) {
				if(c < d) {
					System.out.print(" ");
				} else System.out.print("*");
				} System.out.println();
			
		}
		System.out.println("--------------------");	
		
		// 6-3. 
		for(int e = 1; e <= 5; e++) {
			for(int f = 5; f > 0; f--) {
				if(e > f) {
					System.out.print("");
				} else System.out.print("*");
			} System.out.println();
		}
		System.out.println("--------------------");	
		
		// 6-4.
		for(int g = 1; g <= 5; g++) {
			for(int h = 0; h < g; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	