package homework.middle06;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//		   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.
//		bit => 0, 4, 8 com => 1, 5, 9 sql => 2, 6, 10 int => 3, 7, 11
		char[] chArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
		
		int stepSize = 4;
		for(int i = 0; i <= chArr.length / stepSize; ++i) {
			for(int j = i; j < chArr.length; j+=stepSize) {
				System.out.print(chArr[j]);
			}
			System.out.println();
		}
	}
}
