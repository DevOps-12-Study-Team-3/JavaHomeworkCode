package chap99_homework.myself06.middle;

public class middle_02 {
	public static void main(String args[]) {
		char[] arr= {'b','c','s','i','i','o','q','n','t','m','l','t'};
		int [] checkArr = new int[12];
		
		Search.search(arr, "bit", checkArr);
		Search.search(arr, "com", checkArr);
		Search.search(arr, "sql", checkArr);
		Search.search(arr, "int", checkArr);
		
	}
}
