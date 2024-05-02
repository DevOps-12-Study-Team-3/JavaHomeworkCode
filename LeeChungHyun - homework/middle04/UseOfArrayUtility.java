package chap99_homework.myself04.middle;

public class UseOfArrayUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,2,3};
		double[] doubleArr = {1.6, 3.1, 4.0};
		
		int[] iArr = ArrayUtility.doubleToInt(doubleArr);
		double[] dArr = ArrayUtility.intToDouble(intArr);
	
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("intArr[" + i + "] = " + intArr[i]);
		}
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("dArr[" + i + "] = " + dArr[i]);
		}
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("douleArr[" + i + "] = " + doubleArr[i]);
		}
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("iArr[" + i + "] = " + iArr[i]);
		}
		
	}

}
