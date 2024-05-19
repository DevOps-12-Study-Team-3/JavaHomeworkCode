package chap99_homework.homework98;

import java.util.Scanner;

public class Page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
//
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
//
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
//
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
		
//		1.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.");
//		String name = sc.nextLine();
//		System.out.println("나이를 입력하세요.");
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.println("성별을 입력하세요");
//		String sex = sc.nextLine();
//	 
//		System.out.println("이름:" + name); 
//		System.out.println("나이:" + age);
//		System.out.println("성별:" + sex);
//		sc.close();
		
		
//		2.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		System.out.println("연산자를 입력하세요.(+, -, *, /)");
//		char operate = sc.next().charAt(0);
//
//		double result = 0;
//		
//		switch(operate) {
//			case '+':
//				result = a + b;
//				break;
//			case '-':
//				result = a - b;
//				break;
//			case '*':
//				result = a * b;
//				break;
//			case '/':
//				if(b != 0) {
//				result = (double)a / b;
//				}else {
//					System.out.println("0으로는 나눌수 없습니다.");
//					return;
//				}
//				break;
//			default:
//				System.out.println("보기의 연산자를 사용하세요.");
//				return;
//		
//		
//		
//		}
//		
//		System.out.println("연산하신 값은" + result + "입니다.");
//		
//		sc.close();
		
//		3.
		
//		final double PI;
//		PI = 3.14;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원의 반지름을 입력하세요.");
//		double R = sc.nextInt();
//		double around = 2*PI*R*R;
//		double H = 4*PI*R;
//		System.out.println("입력하신 반지름의 원의 넓이는: " + around + " 둘레는 " + H);
		
//		4.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		System.out.println("세번째 정수를 입력하세요.");
//		int c = sc.nextInt();
//		System.out.println("네번째 정수를 입력하세요.");
//		int d = sc.nextInt();
//		System.out.println("다섯번째 정수를 입력하세요.");
//		int e = sc.nextInt();
//		
//		int sum = a+b+c+d+e;
//		int avg = sum/5;
//		System.out.println("총합:" + sum + "평균:" + avg);
//		int min, max, middle;
//		min = a;
//		if(b < min) min = b;
//		if(c < min) min = c;
//		if(d < min) min = d;
//        if (e < min) min = e;
//
//        // 최대 값 찾기
//        max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//        if (d > max) max = d;
//        if (e > max) max = e;
//
//        // 중간 값 찾기
//        if ((a >= b && a <= c || (a <= b && a >= c))) middle = a;
//        else if ((b >= a && b <= c) || (b <= a && b >= c)) middle = b;
//        else middle = c;
//        if (d >= middle && d <= e) {
//            middle = d;
//        } else if (e >= middle && e <= d) {
//            middle = e;
//        }        // 결과를 출력합니다.
//        System.out.println("최소 값: " + min);
//        System.out.println("중간 값: " + middle);
//        System.out.println("최대 값: " + max);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출력할 단을 입력하세요.");
//		int dan = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//			
//	7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int end = sc.nextInt();
//		long f = 1;
//		for(int i = 1; i <= end; i++) {
//			f *= i;
//		}
//		System.out.println(end +"의 팩토리얼은" + f);
		
		
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("10개의 정수를 입력하세요:");
//        int primeCount = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + "번째 정수를 입력하세요: ");
//            int num = scanner.nextInt();
//            
//            // 소수 판별
//            boolean isPrime = true;
//            if (num <= 1) {
//                isPrime = false;
//            } else {
//                for (int j = 2; j <= Math.sqrt(num); j++) {
//                    if (num % j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//
//            // 소수인 경우 소수 개수 증가
//            if (isPrime) {
//                primeCount++;
//            }
//        }

        // 결과를 출력합니다.
//        System.out.println("입력한 10개의 정수 중 소수의 개수는 " + primeCount + "개 입니다.");
//
//        scanner.close();
		
//        1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("첫번째 정수를 입력하세요. ");
//        String str1 = scanner.nextLine();      
//        System.out.println("두번째 정수를 입력하세요. ");
//        String str2 = scanner.nextLine();  
//        
//        int num1 = Integer.parseInt(str1);
//        int num2 = Integer.parseInt(str2);
//        
//        int result = num1 + num2;
//        System.out.println("결과값: " + result);
        
        
        
//        2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("첫번째 정수를 입력하세요. ");
//          int a = scanner.nextInt(); 
//          System.out.println("두번째 정수를 입력하세요. ");
//          int b = scanner.nextInt(); 
//          
//          while(true){
//          if( b != 0 ) {
//        	double result = a / b;
//        	System.out.println(result);
//        	break; 
//          }else {
//        	  System.out.println("b는 0을 입력할 수 없습니다.");
//          }
//          }scanner.close();
          
        
        
//
//        3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("실수를 입력하세요. ");
//          double a = scanner.nextDouble();
//          System.out.println("변환된 정수는:" + (int)a); 
//          scanner.close();
//
//        4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("실수를 입력하세요. ");
//		  double a = scanner.nextDouble();
//		  double result = a*a;
//		  String result2 = Double.toString(result);
//		  System.out.println(result2);
		
//
//        5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
		
//		int iNum = 10;
//		long lNum = 20L;
//		
//		int iNum1 = (int)lNum; 
//		long lNum1 = (long)iNum;
//		
//		System.out.println(iNum1);
//		System.out.println(lNum1);
//
//        6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째문자를 입력하세요. ");
		String str1 = scanner.nextLine();
		System.out.println("두번째문자를 입력하세요. ");
		String str2 = scanner.nextLine();
        
		char[] cha1 = str1.toCharArray();
		char[] cha2 = str2.toCharArray();
		
		System.out.println("입력하신 첫번재 문자의 유니코드:" + cha1);
		System.out.println("입력하신 두번재 문자의 유니코드:" + cha2);

	}
}
