package homework.middle10;

import java.util.List;

import homework.middle10.classes.TList;

public class _05_Problem {
//	5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 
//	splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을구현하세요.
//	(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
	
	public static void main(String[] args) {
		TList<Integer> tlist = new TList<>();
		
		for(int i = 1; i <= 10; ++i) {
			tlist.getTList().add(i);
		}
		for(List list : tlist.splitList()) {
			System.out.println(list);
		}
	}
}
