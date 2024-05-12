package homework_my._09.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_basic_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		Map< String , String > map = new HashMap<>() ;
		
		map.put( "홍길동" , "010-1234-5678") ;		
		map.put( "강호동" , "010-2222-3333") ;
		map.put( "유재석" , "010-5555-3583") ;
		
		System.out.println( "사용자 이름을 입력해주세요." );

		System.out.println( "전화번호 : "  + map.get( sc.nextLine() )   );

		sc.close(); // 스캐너 종료
	}

}
