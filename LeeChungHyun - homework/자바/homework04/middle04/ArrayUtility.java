package chap99_homework.myself04.middle;

public class ArrayUtility {
	
	static double[] intToDouble(int[] source) {
		double[] doubleSource = new double[source.length];
		for(int i = 0 ; i < source.length; i++) {
			doubleSource[i] = source[i];
		}
		
		return doubleSource;
	}
	
	static int[] doubleToInt(double[] source) {
		int[] intSource = new int[source.length];
		for(int i = 0 ; i < source.length; i++) {
			intSource[i] = (int) source[i];
		}
		
		return intSource;
	}
	
	
}
