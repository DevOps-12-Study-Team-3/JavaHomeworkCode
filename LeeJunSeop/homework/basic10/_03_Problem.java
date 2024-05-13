package homework.basic10;

import java.util.ArrayList;
import java.util.List;

public class _03_Problem {
	public static void main(String[] args) {
//		3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 
//		리스트의 총합을 구하는 메소드를 구현하세요.
		
		List<Integer> dList = new ArrayList<>();
		for(int i = 0; i < 10; ++i) {
			dList.add(i + 2);
		}
		
		System.out.println("합 : " + sum(dList));
	}
	
	
	public static Integer sum(List<?> list) {
		
		int sum = 0;
		for(int i = 0; i < list.size(); ++i) {
			sum += (int)list.get(i);
		}
		
		return sum;
	}
}
