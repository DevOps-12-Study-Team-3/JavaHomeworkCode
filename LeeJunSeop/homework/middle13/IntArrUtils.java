package homework.middle13;

public class IntArrUtils {
	public static int getMax(int[] intArr) {
		int max = intArr[0];
		for(int i = 0; i < intArr.length; ++i) {
			max = max < intArr[i] ? intArr[i] : max;
		}
		
		return max;
	}
	public static int getMin(int[] intArr) {
		int min = intArr[0];
		for(int i = 0; i < intArr.length; ++i) {
			min = min > intArr[i] ? intArr[i] : min;
		}
		
		return min;
	} 
	public static int getMid(int[] intArr)  {
		int[] tempIntArr = new int[intArr.length];
		
		for(int i = 0; i < intArr.length; ++i) {
			tempIntArr[i] = intArr[i];
		}
		
		for(int i = 0; i < tempIntArr.length-1; ++i) {
			for(int j = i+1; j < tempIntArr.length; ++j) {
				if(tempIntArr[i] > tempIntArr[j]) {
					int temp = tempIntArr[i];
					tempIntArr[i] = tempIntArr[j];
					tempIntArr[j] = temp;
				}
			}
		}
		
		return tempIntArr[tempIntArr.length / 2];
	}
}
