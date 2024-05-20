package MyHomework.hwJava;

import java.util.Scanner;

public class _basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("둘 중 큰 정수: " + num1);
        } else if (num1 < num2) {
            System.out.println("둘 중 큰 정수: " + num2);
        } else {
            System.out.println("두 정수는 같습니다.");
        }
        
        // 2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
        System.out.print("정수를 입력하세요.");
        int num3 = sc.nextInt();

        if (num3 > 0) {
            System.out.println("양수");
        } else if (num3 < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }
        sc.nextLine();
        
        // 3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
        // "Python"인 경우 "공부중인 언어입니다."를 출력하고, 
        // 그렇지 않은 경우 "다른 언어를 공부해보세 요."를 출력하세요.(switch~case~default 사용)
        System.out.println("언어를 입력하세요.");
        
        String lang = sc.nextLine();
        switch (lang) {
            case "Java":
                System.out.println("좋아하는 언어입니다.");
                break;
            case "Python":
                System.out.println("공부중인 언어입니다.");
                break;
            default:
                System.out.println("다른 언어를 공부해보세요.");
                break;
        }
		
		
		// 4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 
        // 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
        System.out.print("숫자를 입력하세요.");
        int num4 = sc.nextInt();
        int mulThree = num4 % 3;

        switch (mulThree) {
            case 0:
                System.out.println("3의 배수입니다.");
                break;
            default:
                System.out.println("3의 배수가 아닙니다.");
        }
        
        // 5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 
        // 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
        System.out.print("숫자를 입력하세요.");
        int num5 = sc.nextInt();
        
        if (num5 % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // 6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
        int[] num = new int[5];
        System.out.println("5개의 정수를 입력하세요.");

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("가장 큰 수: " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
