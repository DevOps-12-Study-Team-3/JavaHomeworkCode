package MyHomework;

public class _0429_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
		int num = 10;
		System.out.println(++num);
		// print: 11/ num: 11
		System.out.println(++num);
		// print: 12/ num: 12
		System.out.println(num--);
		// print: 12/ num: 11
		System.out.println(--num);
		// print: 10/ num: 10
		System.out.println(num--);
		// print: 10/ num: 9
		System.out.println(--num);
		// print: 8/ num: 8
		
		System.out.println("--------------------");
		
		// 2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
		int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		System.out.println(a > b);
		
		System.out.println("--------------------");
		
		// 3. 10 ~ 1까지 거꾸로 while문으로 출력
		num = 10;
		
		while(num >= 1) {
			System.out.println(num--);
		}
			
		System.out.println("--------------------");	
		
		// 4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		int j = 10;
		do {
			System.out.println(j--);
		}while(j >= 1);
		
		System.out.println("--------------------");	
		
		// 5. 10 ~ 1까지 거꾸로 for문으로 출력
		int k;
		for(k = 10; k >= 1; k--) {
		System.out.println(k);
		}
		
		System.out.println("--------------------");
		
		// 6. 1 ~ 100까지 합을 while문으로 출력
		int l = 1;
		int sum = 0;
		
		while(l <= 100) {
			sum += l++;
		}
		System.out.println(sum);
		
		System.out.println("--------------------");
		
		// 7. 1 ~ 100까지 합을 do ~ while문으로 출력
		int n = 1;
		int sum2 = 0;
			do {
				 sum2 += n++; 
				} while(n <= 100);
			System.out.println(sum2);
		
		System.out.println("--------------------");	
		
		// 8. 1 ~ 100까지 합을 for문으로 출력
		int m;
		int sum3 = 0;
		for(m = 1; m <= 100; m++) {
			
			sum3 += m;
		}
		System.out.println(sum3);
		
		System.out.println("--------------------");	
		
		// ^^9.  int 10개짜리 배열 생성하여 int배열에 3의 배수를 차례대로 저장하세요. 그리고 거꾸로 출력하세요.
		int[] numArr = new int[10];
		for(int w = 0; w < numArr.length; w++) {
			numArr[w] = (w + 1) * 3;
		System.out.println(numArr[w]);
		}
		
		System.out.println("--------------------");	
		
		// ^^10. int배열을 10개 생성해서 사용자로부터 10개의 값을 입력받고 순서대로 출력하고 총합을 구하세요.
		for(int r = 0; r < numArr.length; r++) {
			numArr[r] = (r + 1) * 10;
		System.out.println(numArr[r]);
		sum3 = 0;
		sum3 += numArr[r];
		System.out.println(sum3);
		}
		
		System.out.println("--------------------");	
		
		// 11. int 배열로 10개의 공간을 생성하세요. 1 ~ 10까지의 임의의 수를 저장하고 홀수만 골라서 출력하세요.
	
		// 12. 정수 10개를 입력받아 배열에 저장하고, 이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
		
	}

