package homework_my._09.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class _03_middle_main {

	public static void main(String[] args) {
		
		
//		3. Map<Integer, Integer>을 매개변수로 받아서 
//		   key는 정순 출력, 
//		   value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
	//		{1: 3, 2: 4, 3: 5}
	//		1 : 5
	//		2 : 4
	//		3 : 3 
		
		Map<Integer, Integer> map = new LinkedHashMap();
		
		map.put(1, 3) ;
		
		map.put(2, 4) ;		
		
		map.put(3, 5) ;		
		
		printKVDesc( map ) ;
		
		
	}

	public static void printKVDesc( Map<Integer, Integer> map )
	{

        // 맵의 키와 값을 각각 리스트에 저장
        List<Integer> keys = new ArrayList<>( map.keySet() );
        List<Integer> values = new ArrayList<>( map.values() );

        // 키는 정순으로, 값은 역순으로 출력
        for ( int i = 0; i < keys.size(); i++ ) 
        {
            System.out.println( "Key: " + keys.get(i) + ", Value: " + values.get( values.size() - 1 - i ));
        }		
		
	}
	
}
