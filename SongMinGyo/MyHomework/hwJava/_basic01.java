package MyHomework.hwJava;

import java.util.Scanner;

public class _basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요.");
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		
//		int sum = (int)(n1 + n2);
		
		System.out.println("--------------------");
		
		// 2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
		System.out.print("두 개의 정수를 입력하세요: ");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        // (단, b는 0을 입력할 수 없습니다.)
        if (n4 != 0) {
            double result = (double) n3 / n4;
            System.out.println(result);
        } else {
            System.out.println("입력오류");
        }
        
        System.out.println("--------------------");
        
        // 3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
        System.out.print("실수를 입력하세요.");
        double n5 = sc.nextDouble();

        int intN5 = (int) n5;

        System.out.println("입력한 실수의 정수 부분: " + intN5);

        System.out.println("--------------------");
        
        // 4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
        System.out.print("실수를 입력하세요.");
        double n6 = sc.nextDouble();

        // 입력한 실수의 제곱 계산
        double squareN6 = (n6 * n6);

        // 제곱 결과를 문자열로 변환하여 출력
        String result = Double.toString(squareN6);
        System.out.println(result);
        
        System.out.println("--------------------");
		
        // 5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
        int iNum = 10;
        long lNum = 20;

        long n7 = lNum;
        lNum = iNum;
        iNum = (int) n7;

        System.out.println("iNum: " + iNum); 
        System.out.println("lNum: " + lNum); 
        
        System.out.println("--------------------");
		
        // 6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
        System.out.print("두 개의 문자를 입력하세요.");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char char1 = str1.charAt(0);
        char char2 = str2.charAt(0);

        System.out.println("첫 번째 문자 '" + char1 + "'의 유니코드: " + (int) char1);
        System.out.println("두 번째 문자 '" + char2 + "'의 유니코드: " + (int) char2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
