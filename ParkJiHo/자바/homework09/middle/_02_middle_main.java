package homework_my._09.middle;

import java.util.HashMap;
import java.util.Map;

public class _02_middle_main {

	public static void main(String[] args) {
		
		// 2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 
		// key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
		
		Map<Integer, Integer> map = new HashMap<>() ;
		
		map.put( 1 , 1 ) ;
		
		map.put( 2 , 2 ) ;
		
		map.put( 3 , 3 ) ;
		
		map.put( 4 , 4 ) ;
		
		map.put( 5 , 5 ) ;
		
		map.put( 6 , 6 ) ;
		
		map.put( 9 , 9 ) ;
	
		
		System.out.println( "Key와 Value 곱이 가장 큰 Entry : " + getMaxMul( map ) );
	}
	
	
	public static Map.Entry<Integer, Integer> getMaxMul( Map<Integer, Integer> map )
	{
		Map.Entry<Integer, Integer> maxEntry = null;
		
		int Max = 0 ;
		
		for ( Map.Entry<Integer, Integer> entry : map.entrySet()   ) 
		{
			int result = ( entry.getKey() * entry.getValue() );
			
			// MaX값이 갱신된 경우
			if( Max < result )
			{
				Max = result ;
				
				maxEntry = entry ; // Key와 value 값을 같이 Input
			}
		}
		
		return maxEntry  ; // Key와 value 값을 같이 Output
	}
	
	

}
