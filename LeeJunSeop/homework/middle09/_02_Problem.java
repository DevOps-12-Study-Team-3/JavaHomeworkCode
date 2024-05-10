package homework.middle09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 
//		key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(20, 30);
		map.put(10, 15);
		map.put(102, 154);
		map.put(10, 155);
		
		Entry<Integer, Integer> entry = getMaxMul(map);
		System.out.println(entry.getKey()+ " : " +entry.getValue());
		
		
		
	}
	
	public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map){
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		Entry<Integer, Integer> entry = null;
		Integer max = 1;
		for(Entry<Integer, Integer> tempEntry : entrySet) {
			if(max < tempEntry.getKey() * tempEntry.getValue()) {
				max = tempEntry.getKey() * tempEntry.getValue();
				entry = tempEntry;
			}
		}
		
		return entry;
	}
}
