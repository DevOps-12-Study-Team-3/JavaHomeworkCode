package chap99_homework.myself06.middle;

public class Search {
	public static void search(char[] arr, String str, int[] checkArr) {
		System.out.print(str + " = > ");
		for(int i = 0; i < str.length() ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[j] == str.charAt(i)) {
					if(checkArr[j] == 0) {
						checkArr[j] = 1;
						System.out.print(j + ", ");
						break;
					}
				}
			}
		}
		System.out.println();
	}
}
