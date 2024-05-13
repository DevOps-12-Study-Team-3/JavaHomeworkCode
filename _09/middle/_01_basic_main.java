package homework._09.middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _01_basic_main {

	public static void main(String[] args) {
		
//		1. 학생이름을 key로 
//		   시험점수를 value로 가지는 
//		   Map<String, Integer>를 생성하고
//
//		  4명의 학생 데이터를 입력한 후 
//		  4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
		
		int Max_Score = 0 ;
		
		Map< String , Integer > map = new HashMap<>() ;
		
		map.put( "유재석" , 90 ) ;		
		map.put( "강호동" , 80 ) ;		
		map.put( "이광수" , 50 ) ;
		map.put( "하하" , 30 ) ;		
		
		// [ 점수 비교 ]
		for ( Entry<String, Integer> user : map.entrySet()   )
		{
			if ( Max_Score < user.getValue() )
			{
				Max_Score = user.getValue() ;
			}
		}
		
		System.out.println( "[가장 높은 점수의 학생 ] "   );
		
		// [가장 높은 점수의 학생 정보 출력]
		
		for ( Entry<String, Integer> user : map.entrySet()   )
		{
			if ( Max_Score == user.getValue() )
			{
				System.out.println( "이름 : " + user.getKey() + " / 점수 : " + user.getValue());
			}
		}
		
		
		
		
		

	}

}
