package homework.middle10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class _04_Problem {
//	4. Map<Integer, Integer>을 매개변수로 받아서 
//	List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요. 
//	매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 
//	키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		Random rand = new Random();
		
		for(int i = 0; i < 50; ++i) {
			map.put(rand.nextInt(11) + 50, rand.nextInt(11) + 15);
		}
		
		List<Entry<Integer, Integer>> list = getOverHundr(map);
		for(int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());;
		}
	}
	
	public static <K extends Number, V extends Number> List<Entry<K, V>> getOverHundr(Map<K,V> map){
		List<Entry<K,V>> entryList = new ArrayList<>();
		
		for(Entry<K, V> entry : map.entrySet()) {
			int mulVal = entry.getKey().intValue() * entry.getValue().intValue();
			if(mulVal > 1000) entryList.add(entry);
		}
		
		
		return entryList;
	}
}
