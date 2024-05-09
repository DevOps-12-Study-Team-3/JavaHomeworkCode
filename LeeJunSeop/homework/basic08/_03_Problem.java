package homework.basic08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		List<Integer> intArrList = new ArrayList<Integer>();
		int inputSize = 5;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < inputSize; ++i){
			System.out.print(i+1 +"번째 값 입력 : ");
			intArrList.add(Integer.valueOf(sc.nextInt()));
			sc.nextLine();
		}
		
		for(Integer integer : intArrList) {
			System.out.print(integer + " ");
		}
		
		sc.close();
	}
}
