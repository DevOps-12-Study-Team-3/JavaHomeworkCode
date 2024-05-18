package chap00_practice;

import java.util.Scanner;

public class _01_statement {
	public static void main(String[] args) {
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		System.out.println("1번 정수 입력.");
//		int num1 = sc.nextInt();
//		System.out.println("2번 정수 입력.");
//		int num2 = sc.nextInt();
//		
//		if(num1 < num2) {
//			System.out.println(num2 + "가 더 큰 정수입니다.");
//		} else if (num1 > num2) {
//			System.out.println(num1 + "가 더 큰 정수입니다.");
//		} else {
//			System.out.println("같은 숫자");
//		}
		
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//		System.out.println("정수 입력.");
//		int num = sc.nextInt();
//		if(num > 0) {
//			System.out.println(num + "은 양수");
//		} else if(num < 0) {
//			System.out.println(num + "은 음수");
//		} else {
//			System.out.println(num + "은 0");
//		}
		
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고
//		그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
//		System.out.println("프로그래밍 언어 입력.");
//		String scStr = sc.nextLine();
//		
//		switch(scStr) {
//			case "Java":
//				System.out.println("좋아하는 언어입니다.");
//				break;
//			case "Python":
//				System.out.println("공부중인 언어입니다.");
//				break;
//			default :
//				System.out.println("다른 언어를 공부해보세요.");
//			}
//		if(scStr.equals("Java")) {
//			System.out.println("좋아하는 언어입니다.");
//		} else if(scStr.equals("Python")) {
//			System.out.println("공부중인 언어입니다.");
//		} else {
//			System.out.println("다른 언어를 공부해보세요.");
//		}
		
//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.
//		(switch~case~default 사용)
//		System.out.println("숫자 입력.");
//		int sNum = sc.nextInt();
//		
//		switch(sNum % 3) {
//		case 0 :
//		System.out.println("3의 배수입니다.");
//		break;
//		default:
//			System.out.println("3의 배수가 아닙니다.");
//		}
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
//		System.out.println("숫자 입력.");
//		int sNum = sc.nextInt();
//		
//		if(sNum % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//		int[] intArr = new int[5];
//		
//		for(int i = 0; i < intArr.length; i++) {
//			System.out.println(i+1 + "번째 숫자 입력.");
//			intArr[i] = sc.nextInt();
//		}
//		int max = intArr[0];
//		for(int i = 1; i < intArr.length; i++) {
//			if(max < intArr[i]) {
//				max = intArr[i];
//			} 
//		}
//		System.out.println("가장 큰 수 : " + max);
//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//		System.out.println("문자열 입력.");
//		String sStr = sc.nextLine();
//		
//		if(sStr.equals("Yes")) {
//			System.out.println("예");
//		} else if(sStr.equals("No")) {
//			System.out.println("아니오");
//		} else {
//			System.out.println("잘 못 입력하셨습니다.");
//		}
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//		System.out.println("1번 정수 입력.");
//		int sNum1 = sc.nextInt();
//		System.out.println("2번 정수 입력.");
//		int sNum2 = sc.nextInt();
//		if(sNum1 > sNum2) {
//			System.out.println("첫 번째 수가 더 큽니다.");
//		} else if (sNum1 < sNum2) {
//			System.out.println("두 번째 수가 더 큽니다.");
//		} else {
//			System.out.println("두 수가 같습니다.");
//		}
//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		System.out.println("1번 정수 입력.");
		int sNum1 = sc.nextInt();
		System.out.println("2번 정수 입력.");
		int sNum2 = sc.nextInt();
		System.out.println("3번 정수 입력.");
		int sNum3 = sc.nextInt();
		
		int hol = 0;
		int jjak = 0;
		
		if(sNum1 % 2 == 0) {
			jjak++;
		} else {
			hol++;
		}
		if(sNum2 % 2 == 0) {
			jjak++;
		} else {
			hol++;
		}
		if(sNum3 % 2 == 0) {
			jjak++;
		} else {
			hol++;
		}
		
		if(jjak == 3) {
			System.out.println("모두 짝수 입니다.");
		} else if(hol == 3) {
			System.out.println("모두 홀수 입니다.");
		} else {
			System.out.println("짝수 : " + jjak + "개 홀수 : " + hol + "개");
		}
		
//		if(sNum1 % 2 == 0 && sNum2 % 2 == 0 && sNum3 % 2 ==0) {
//			System.out.println("모두 짝수 입니다.");
//		} else if(sNum1 % 2 != 0 && sNum2 % 2 != 0 && sNum3 % 2 != 0) {
//			System.out.println("모두 홀수 입니다.");
//		} else {
//			if(sNum1 % 2 == 0)
//				int jjak = 0
//		}
	}
}
