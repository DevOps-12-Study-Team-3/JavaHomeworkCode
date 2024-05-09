package chap99_homework.myself01;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0)  {
				System.out.print(i + ", ");
			} 
		}
		System.out.println();
		
		System.out.println("------------------");
		
		int n = 1;
		while(n <= 10) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
		
		System.out.println("------------------");
		
		int sum = 0;
		for(n = 1 ; n <= 1000 ; n++) {
			if(n % 2 == 0 && n % 7 == 0) {
				System.out.println(n);
				sum += n;
			}
		}
		System.out.println("총합 : " + sum);
	
		System.out.println("------------------");
		
		int[] intArr = new int[20];
		for(n = 0 ; n < intArr.length ; n++) {
			intArr[n] = (int)(Math.random()*101);
		}
		for(n = 0 ; n < intArr.length ; n++) {
			if(n % 2 != 0) {
				System.out.println("intArr[" + n + "] = " + intArr[n]);
			}else {
				System.out.println("intArr[" + (18-n) + "] = " + intArr[(18-n)]);
			}
		}
		
		System.out.println("------------------");
		
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(j < 4 - i ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(int i = 4; i >= 0 ; i--) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(int i = 4; i >= 0 ; i--) {
			for(int j = 0 ; j < 5 ; j++) {
				if(j < 4 - i ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
