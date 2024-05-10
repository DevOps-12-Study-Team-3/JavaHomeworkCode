package chap99_homework.myself09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)

		Map<String, Integer> scores = new HashMap<>();
		scores.put("김", 70);
		scores.put("이", 60);
		scores.put("박", 80);
		scores.put("최", 90);
		
		String name = "김";
		
		for(Entry<String, Integer> entry : scores.entrySet()) {
			if(entry.getValue() > scores.get(name)) {
				name = entry.getKey();
			}
		}
		System.out.println("최고점을 받은 학생 - ");
		System.out.println("이름 : " + name + ", 점수 : " +scores.get(name));
		
	}

//	2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	
	public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map){
		
		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		
		Entry<Integer, Integer> entry = iterator.next();
		
		while(iterator.hasNext()) {
			Entry<Integer, Integer> nextEntry = iterator.next();
			if((entry.getKey() * entry.getValue()) 
					 <  (nextEntry.getKey() * nextEntry.getValue())){
				entry = nextEntry;
			}
		}

		return entry;
	}
	
//	3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
//	{1: 3, 2: 4, 3: 5}
//	1 : 5
//	2 : 4
//	3 : 3
	
	public static void printKVDesc(Map<Integer, Integer> map){
		
		List<Integer> keyList = new ArrayList<>();
		List<Integer> valueList = new ArrayList<>();
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			keyList.add(entry.getKey());
			valueList.add(entry.getValue());
		}
		
		Collections.sort(keyList);
		Collections.sort(valueList, Collections.reverseOrder());	
		
		for(int i = 0 ; i < map.size() ; i++)
		{
			System.out.println(keyList.get(i) + " : " + valueList.get(i));
		}
		
	}
	
	
	
	
	
	
	
	
	
}
