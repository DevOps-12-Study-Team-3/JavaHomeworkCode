package homework_my.homework14.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _14_basic_main {

	public static void main(String[] args) {
		
		// ####################################################
		
		/*
	        [1번문제]
			1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
			intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
			
		 */
		
		List<Integer> intList = new ArrayList<>();
		
        for (int i = 0; i < 10; i++) 
        {
            intList.add( (int) (Math.random() * 10) + 1 ); 
            
            System.out.println( intList );
        }
        
		System.out.println("\n=======================\n");
		
        List<Integer> New_Stream =  intList.stream()
        		.map( num -> num * 3 )
        		.collect( Collectors.toList() );
        
        
        System.out.println( "결과 : " + New_Stream );
        
		System.out.println("\n=======================\n");
		
		
		// ####################################################
		
		// [2번 문제]

		/*
			2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.	
		 */
		
		Scanner sc = new Scanner( System.in );
		
		List<String> User_Data = new ArrayList<>();
		
		for ( int i = 1 ; i <= 10 ; i++ )
		{
			System.out.println( i + "번 문자열을 입력해주세요" );
			
			User_Data.add( sc.nextLine() ) ;
			
		}
		
		User_Data.stream()
				.filter( Data -> Data.length() >= 5 )
				.forEach( Data -> System.out.println( Data ) );

		// ####################################################
		
		// [ 3번 문제 ]

		/*
			3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 
			스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.

		 */
		
		List<String> strList = new ArrayList<>();

		for ( int i = 1 ; i <= 10 ; i++ )
		{
			System.out.println( i + "번 문자열을 입력해주세요" );
			
			strList.add( sc.nextLine() ) ;
			
		}
		
		strList.stream()
		
		.filter( Data -> Data.matches(".*[a-zA-Z].*") )
		
		.forEach( Data -> System.out.println( "영문자가 포함된 문자열 : " + Data ) );	
		
		
		// ####################################################
		
		
	}

}
