package homework.middle09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
		
		Map<String, Integer> stuScoreMap = new HashMap<>();
		
		int peopleCnt = 4;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < peopleCnt; ++i) {
			String key;
			Integer value;
			System.out.print("학생이름 : ");
			key = sc.nextLine();
			
			System.out.println("시험 점수 : ");
			value = Integer.valueOf(sc.nextLine());
			
			stuScoreMap.put(key, value);
		}
		String name = "";
		int max = 0;
		Set<Entry<String, Integer>> entrySet = stuScoreMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				name = entry.getKey();
			}
		}
		
		System.out.println(name + " : " + max);
		
		sc.close();
	}
}
