package chap99_homework.myself10;

import java.util.ArrayList;
import java.util.List;

public class TList<T> {
//	5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 
//	리스트로 나누는 기능을구현하세요.(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
	public List<T> tList;
	
	public List<T>[] splitList(List<T> tList) {
		List<T>[] splitListArr = new List[2];
		
		int halfSize = tList.size() / 2;
		
		List<T> firstList = new ArrayList<>();
		List<T> secondList = new ArrayList<>();
		
		if(tList.size() % 2 ==0 ) {
			firstList.addAll(tList.subList(0, halfSize));
			secondList.addAll(tList.subList(halfSize, tList.size()));
		}else {
			firstList.addAll(tList.subList(0, halfSize + 1));
			secondList.addAll(tList.subList(halfSize + 1, tList.size()));
		}
		
		splitListArr[0] = firstList;
		splitListArr[1] = secondList;
		
		return splitListArr;
	}
	
}
