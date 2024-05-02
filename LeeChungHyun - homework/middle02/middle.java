package chap99_homework.myself02;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		int[] rev = reverse(nums);
		for(int n : rev) {
			System.out.println(n);
		}
		
		System.out.println("-----------------------");
		
		char[] str = {'y', 'B' , 'c' , 'D'};
		char[] conv = convertCase(str);
		for(char c : conv) {
			System.out.println(c);
		}
		
	}
	
	public static int[] reverse(int[] arr) {
		int[] rev = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			rev[i] = arr[arr.length - i - 1];
		}
		return rev;
	}
	
	public static char[] convertCase(char[] str) {
		char[] conv = new char[str.length];
		
		for(int i = 0 ; i < str.length ; i++) {
			if('A' <= str[i] && str[i] < 'Z') {
				conv[i] = (char) (str[i] + 31);
			}else if(str[i] == 'Z') {
				conv[i] = 'a';
			}else if('a' < str[i] && str[i] <= 'z') {
				conv[i] = (char) (str[i] - 31);
			}else if(str[i] == 'a') {
				conv[i] = 'Z';
			}
		}
		return conv;
	}
}
