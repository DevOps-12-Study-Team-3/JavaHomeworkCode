package chap99_homework.myself12;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//		PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
	
		printEven( intArr -> {
			for(int i = 0 ; i < intArr.length ; i++) {
				if(intArr[i] % 2 == 0) {
					System.out.println(intArr[i]);
				}
			}
		});
		
	}
	
	public static void printEven (PrintNumber printNumber) {	
		printNumber.printEvenNum(new int[] {1,2,3,4,5});
	}
	
}
