package homework.basic13;

public class _01_Problem {
	
//	1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//	PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
	public static void main(String[] args) {
		int arrSize = 20;
		int[] intArr = new int[arrSize];
		
		for(int i = 0; i < arrSize; ++i) {
			intArr[i] = (int)(Math.random() * 100);
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		printEvenNum(intArr, arr->{
			for(int i = 0; i < arr.length; ++i) {
				if(arr[i] % 2 == 0) System.out.print(arr[i] + " ");
			}
			System.out.println();
		});
	}
	
	public static void printEvenNum(int[] intArr, PrintNumber printNumber) {
		
		printNumber.printEnvenNum(intArr);
	}
}
