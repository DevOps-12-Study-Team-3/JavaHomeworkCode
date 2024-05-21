package homework.basic10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _06_Problem {
//	6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 
//	길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("1111111111", 1);
		map.put("111111111", 1);
		map.put("11111111", 1);
		map.put("1111111", 1);
		map.put("111111", 1);
		map.put("11111", 1);
		map.put("1111", 1);
		map.put("111", 1);
		map.put("11", 1);
		map.put("1", 1);
		map.put("22222222222", 2);
		map.put("2222222222", 2);
		map.put("22222222", 2);
		
		printOverTen(map);
	}
	
	public static <K extends String, V> void printOverTen(Map<K, V> map) {
		
		Set<Entry<K, V>> entrySet = map.entrySet();
		for(Entry<K, V> entry : entrySet) {
			entry.setValue((V)(entry.getValue()+""));
			
			if(entry.getKey().length() >= 10)
				System.out.println(entry.getKey());
		}
		
	}
}
