package homework_my._09.advance;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class _01_advance_main {

	public static void main(String[] args) {
		
		// 1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
	    //(Map<Character, Integer> 형태의 Map과 Entry 사용)
		
		
		Scanner sc = new Scanner(System.in) ;
		
		String User_Data ;
		
		int num = 0 ;
		
		int max_value = 0 ;
		
		boolean duplicate = false ;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		System.out.println("문자열을 입력해주세요.");  
		
		User_Data = sc.nextLine() ;
		
		for( int i = 0 ; i < User_Data.length() ; i++ )
		{
			//#####################################################
			
			// map에 중복데이터가 있는 경우 갯수만큼 value에 추가
			
			duplicate = false ;
			
			for( Entry<Character, Integer> entry : map.entrySet() )
			{
				if ( entry.getKey() == User_Data.charAt(i)  )
				{
					System.out.println(" 중복된 Key값이 있습니다." );
					
					duplicate = true ;
					
					++num ;	
				}
			}
			
			if( duplicate == true )
			{
				map.put( User_Data.charAt(i) , num + 1 ) ;
				
				System.out.println( "num의 값 ㅣ " + num );
			}
			else if( duplicate == false )
			{
				num = 0 ;
				
				map.put( User_Data.charAt(i) , 1 ) ;
			}
			
			//#####################################################
						
		}
		
		// [ map 순회 ]
		
		for( Entry<Character, Integer> entry : map.entrySet() )
		{
			System.out.println( "Key : " + entry.getKey() + " / value :  " + entry.getValue() );
		}			
		
		
		// [ 가장 많은 값 찾기 ]
		
		for( Entry<Character, Integer> entry : map.entrySet() )
		{
			// 갱신
			if ( max_value < entry.getValue()  )
			{
				max_value = entry.getValue() ;
			}
		}
		
		// [ 가장 많은 값 출력 ]
		
		for( Entry<Character, Integer> entry : map.entrySet() )
		{
			// 갱신
			if ( max_value == entry.getValue()  )
			{
				System.out.println( "가장 많은 알파벳 : " + entry.getKey() + " / 수량 :  " + entry.getValue() );
			}
		}	
		
		
		sc.close() ;
	}

}
