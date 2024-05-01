package homework.basic01;

public class _09_Problem {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; ++i)
			intArr[i] = 3*(i+1);
		
		for(int j = intArr.length - 1; j >= 0; j--)
			System.out.println(intArr[j]);
	}

}
