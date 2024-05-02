package chap99_homework.myself02;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatString.concatStr("hello", "world");
		ConcatString.concatStr("Hello", "World", 3);
	}

	public static int summation(int num) {
		int sum = 0 ;
		for(int i = 1; i <= num ; i++) {
			sum += num;
		}
		return sum;
	}
	
	public static void printReverse(int[] arr) {
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("arr[" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
		}
	}
	
}
