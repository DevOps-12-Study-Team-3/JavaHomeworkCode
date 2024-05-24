package homework.middle10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _01_Problem {
	public static void main(String[] args) {
//		1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때 
//		key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
		
		Map<Double, Integer> map = new HashMap<>();

		for(int i = 0 ; i < 20; ++i) {
			map.put(Math.random()*100, (int)(Math.random() * 100));
		}
		System.out.println(getMaxMul(map));
	}
	
	public static <K extends Number, V extends Number> Entry<K,V> getMaxMul(Map<K, V> map){
		Entry<K, V> resEntry = null;
		int maxMulVal = 1;
		
		
		for(Entry<K, V> entry : map.entrySet()) {
			if(maxMulVal < entry.getKey().intValue() * entry.getValue().intValue()) {
				maxMulVal = entry.getKey().intValue() * entry.getValue().intValue();
				resEntry = entry;
			}
		}
		
		return resEntry;
	}
}
