package homework.homework08.basic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class _08_basic_main {

	public static void main(String[] args) {
		
		//###################################################################
		
		// [ 1번문제 ]
		
		/*
		  	1 . Calendar 객체를 오늘날짜로 생성하세요.
		   		객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		   		위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		 */
	
		// #########################################
		
		// [ 객체 생성 ]
		
		Calendar calendar = Calendar.getInstance();
		
		// #########################################
		
		// [ 변경 전 ]
		
		System.out.println( "[변경 전]" );
		
		System.out.println( "오늘 날짜 : " + DateToStirng( calendar ) ) ;
		
		System.out.println( "현재 시간 : " + timeToString( calendar ) ) ;	
		
		System.out.println( "\n================================\n" );
		
		// #########################################
		
		// [ 변경 후 ]
				
		calendar.set(2020, 4 - 1 , 8) ;
		
		System.out.println( "[변경 후]" );
		
		System.out.println( "오늘 날짜 : " + DateToStirng( calendar ) ) ;
		
		System.out.println( "현재 시간 : " + timeToString( calendar ) ) ;	
		
		System.out.println( "\n================================\n" );
		
		// #########################################
		
		// [ 5년 뒤 ]
		calendar.add( Calendar.YEAR ,  5 );
	 
		System.out.println( "5년 후 : " + DateToStirng( calendar ) ) ;
		
		// [ 2달 뒤 ]
		calendar.add( Calendar.MONTH , 2 );	
		
		System.out.println( "2달 후 : " + DateToStirng( calendar ) ) ;
		
		// [ 3일 뒤 ]
		calendar.add( Calendar.DATE ,  3 ) ;

		System.out.println( "3일 후 : " + DateToStirng( calendar ) ) ;
		
		System.out.println( "\n================================\n" );
		
		//###################################################################
		
		// [ 2번 문제 ]
		
		/*
		  	2. Calendar 객체를 오늘날짜로 생성하세요.
		   오늘날짜를 2023-03-24 형식으로 출력하세요.
		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		  
		 */
		
		
		Calendar calendar2 = Calendar.getInstance();
		
		calendar2.set(2023, 2 , 24) ;
		
		System.out.println( "" );
		
		System.out.println( "오늘 날짜 : " + DateToStirng( calendar2 ) + " / "  +timeToString( calendar2 ) ) ;
		
		System.out.println( "\n================================\n" );
		
		//###################################################################
		
		// [ 3번문제 ]
		
		/*
		    3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 
		       사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		 
		 */
		
		ArrayList<Integer> User_Data_list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner( System.in );
		
		int Usere_Data ;
		
		for( int i = 0 ; i < 5 ; i++ )
		{
			System.out.println( "정수형 데이터를 입력하세요." );
			
			Usere_Data = sc.nextInt() ;
			
			User_Data_list.add( Usere_Data ) ;
		}
		
		for( int k = 0 ; k < User_Data_list.size() ; k++ )
		{
			System.out.println( "데이터 : " +  User_Data_list.get( k ) );
		}
		
		System.out.println( "\n================================\n" );
		
		
		//###################################################################
			
		
	}
	
	
	public static String DateToStirng( Calendar calendar )
	{
		// 몇년 몇월 몇일 형태의 String이 리턴되도록 구현
		
		String result = "" ;
		
		
		result += calendar.get( Calendar.YEAR ) + "-" ;
		result += ( calendar.get( Calendar.MONTH ) + 1 ) + "-" ;		
		result += calendar.get( Calendar.DATE ) ;		
		
		return result ;
			
	}
	
	public static String timeToString( Calendar calendar )
	{
		// 몇시 ( 0 ~ 23 ) 몇분 몇초 형태의 String이 리턴 되도록 구현
		
		String result = "" ;
		
		result += calendar.get( Calendar.HOUR ) + "시" ;
		result += calendar.get( Calendar.MINUTE ) + "분" ;		
		result += calendar.get( Calendar.SECOND ) + "초" ;		
		
		return result ;	
		
	}	
	
	
	

}
