package homework.homework10.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _10_basic_main {

	public static void main(String[] args) {
		
		
		// ############################################
		
		// 1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.

		
		// ############################################
		
		
		// 2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
		//매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
		
		String Data1 = " 하이" ;
		String Data2 = " 빅스비" ;	
		
		System.out.println( "결과 : " + add( Data1 , Data2 ) );
		
		
		// ############################################
		
//		3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
//		
		ArrayList<Integer> Array1 = new ArrayList<>() ;
		
		Array1.add( 1 ) ;		
		Array1.add( 2 ) ;		
		Array1.add( 3 ) ;		
		Array1.add( 4 ) ;
		Array1.add( 5 ) ;
		
		System.out.println( "리스트의 총합 : " + sum(Array1) );

		// ############################################
		
//		4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
		
		int array1[] = { 1 ,2 ,3, 4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 } ;
		
		printArr( array1 );
		
		// ############################################
		
//		5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
		
		
		
		
	
		// ############################################
		
		
		// 6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 
		// 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
		
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("1번", "189189189189189189" ) ;		
		map.put("2번", "1891891891891891891111154789189" ) ;		
		map.put("3번", "18918918189717814700009189189" ) ;		
		map.put("4번", "18918918918917891019189" ) ;
		
		
		printOverTen( map ) ;
		
		// ############################################
	
		// 7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 
		// 첫 번째 값은 "나라 한글명"이고 
		// 두 번째 값은 "대표음식"으로 지정한다. 
		//public void notifyFood(String country) 메소드를 만들고 
		// country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요. 
		// country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요. 
		// (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)
	
		Country.notifyFood("한국");
		
		
		// ############################################
			
		
	}
	
	// [ 2번 문제 메소드 ]
	public static <T> String add(T t1, T t2)
	{
		return String.valueOf(t1) + String.valueOf(t2);
	}
	
	// [ 3번 문제 메소드 ]
	public static Integer sum(List<?> list)
	{
		int sum = 0 ;
		
		for( int i = 0 ; i < list.size() ; i++  )
		{
			sum += (int)list.get(i);
		}
				
		return sum ;
	}
	
	// [ 4번 문제 메소드 ]
	
	public static void printArr( int array[] )
	{
		for(  int i = 0 ; i < array.length ; i++ )
		{
			if ( ( i % 3 == 0 ) && ( i > 0 ) )
			{
				System.out.println( "인덱스의 번호 : " + i );
			}
		}
	}
	
	
	
	
	

	
	// [ 6번 문제 메소드 ]
	
	public static <T> void printOverTen( Map<?, ?> map ) 
	{
		for ( Map.Entry<?, ?> entry : map.entrySet() ) 
		{
			String Data = ( String )entry.getValue() ;
			
			if ( Data.length() >= 10 )
			{
				System.out.println( "value의 길이가 10 이상 KEY : " + entry.getKey() );
			
			}
        }		
	}

	
	
}
