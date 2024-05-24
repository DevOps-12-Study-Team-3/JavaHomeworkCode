package homework.middle10.classes;

import java.util.ArrayList;
import java.util.List;

public class TList<T> {
//	5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 
//	splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을구현하세요.
//	(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
	private List<T> tlist;
	
	public TList() {
		this.tlist = new ArrayList<T>();
	}
	
	public List<T> getTList(){
		return this.tlist;
	}
	
	public void setTList(List<T> tlist) {
		this.tlist = tlist;
	}
	
	public List[] splitList(){
		List<T>[] slist = new List[2];
		int halfSize = tlist.size() / 2;
		
		List<T> halfList1 = new ArrayList<T>();
		List<T> halfList2 = new ArrayList<T>();
		
		if(tlist.size() % 2 == 0) {
			halfList1 = tlist.subList(0, halfSize);
			halfList2 = tlist.subList(halfSize, tlist.size());
		}else {
			halfList1 = tlist.subList(0, halfSize+1);
			halfList2 = tlist.subList(halfSize+1, tlist.size());
		}
		slist[0] = halfList1;
		slist[1] = halfList2;
		
		
		return slist;
	
	}
}
