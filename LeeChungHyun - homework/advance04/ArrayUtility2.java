package chap99_homework.myself04.advance;

public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int l1 = s1.length;
		int l2 = s2.length;
		int[] concatArr = new int[l1 + l2];
		for(int i = 0 ; i < l1 + l2 ; i++) {
			if(i < l1) {
				concatArr[i] = s1[i];
			}else {
				concatArr[i] = s2[i-l1];
			}
		}
		return concatArr;
		
	}
	
	static int[] remove(int[] s1, int[] s2){
		int l1 = s1.length;
		int l2 = s2.length;
		boolean [] checker = new boolean[l1];
		int checkerCnt = 0;
		for(int i = 0 ; i < l2 ; i++) {
			for(int j = 0 ; j < l1 ; j++) {
				if(s2[i] == s1[j] && checker[j] == false) {
					checker[j] = true;
					checkerCnt ++;
					break;
				}
			}
		}
		int [] removeArr = new int[l1-checkerCnt];
		int interval = 0;
		for(int i = 0 ; i < l1-checkerCnt ; i++) {
			if(checker[i + interval] == false) {
				removeArr[i] = s1[i + interval];
			}else {
				interval++;
				i--;
			}
		}
		return removeArr;
	}
	
}
