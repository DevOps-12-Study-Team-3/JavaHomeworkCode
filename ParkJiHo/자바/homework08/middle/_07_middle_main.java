package homework.homework08.middle;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class _07_middle_main {

	public static void main(String[] args) {
		
		// ##################################################################################
		
		// [ 1번문제 ]
		
		/*
			1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 
			   add 메소드로 3일뒤로 변경하고 yyyy-MM-dd 형식으로 출력하세요. 
			   (SimpleDateFormat 클래스 사용. SimpleDateFormat의parse() 메소드를 이용하면 String -> Calendar로 변환가능)	 
		 */
		
		String User_Data ;
	
		
		Scanner sc = new Scanner( System.in ) ;
		
		System.out.println( "설정할 날짜를 yyyy-MM-dd형식으로 입력해주세요" );
		
		User_Data = sc.nextLine() ;
		
		// [ 객체생성 ] - 사용자 날짜 설정
		
		SimpleDateFormat dateFormat = new SimpleDateFormat( User_Data );
		
		
		
		
		
		
		
		// ##################################################################################
				
		// [ 2번문제 ]
		
		
		// ##################################################################################
		
		// [ 3번문제 ]
		
		
		// ##################################################################################
		
	}

}
