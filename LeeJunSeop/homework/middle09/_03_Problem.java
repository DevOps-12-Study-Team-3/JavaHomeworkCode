package homework.middle09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03_Problem {
	public static void main(String[] args) {
//		3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
//		{1: 3, 2: 4, 3: 5}
//		1 : 5
//		2 : 4
//		3 : 3
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 3);
		map.put(2, 4);
		map.put(3, 5);
		
		printKVDesc(map);
		
	}
	
	public static void printKVDesc(Map<Integer, Integer> map) {
		List<Integer> keyList = new ArrayList<>();
		List<Integer> valueList = new ArrayList<>();
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			keyList.add(entry.getKey());
			valueList.add(entry.getValue());
		}
		// 키 정렬
		for(int i = 0 ; i < keyList.size() ; ++i) {
			for(int j = i+1; j < keyList.size(); ++j) {
				if(keyList.get(i) > keyList.get(j)) {
					int temp = keyList.get(i);
					keyList.set(i, keyList.get(j));
					keyList.set(j, temp);
					
				}
			}
		}
		// 밸류 정렬
		for(int i = 0 ; i < valueList.size() ; ++i) {
			for(int j = i+1; j < valueList.size(); ++j) {
				if(valueList.get(i) < valueList.get(j)) {
					int temp = valueList.get(i);
					valueList.set(i, valueList.get(j));
					valueList.set(j, temp);
					
				}
			}
		}
		
		for(int i = 0; i < map.size(); ++i) {
			System.out.println(keyList.get(i) + " : " + valueList.get(i));
		}
	}
}
