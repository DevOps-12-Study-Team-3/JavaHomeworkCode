package homework_my.homework14.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _14_middle_main {

	public static void main(String[] args) {
		
		// ===============================================
		
		/*
			[1번문제]
			
			1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고 
			List<Student> studentList에 
			(1, 홍길동, 100), 
			(2, 임꺽정, 75), 
			(3, 장길산, 86), 
			(4, 정도전, 97), 
			(5, 이순신, 95)를 저장하고 
			
			Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

		 */
		
		List<Student> studentList = new ArrayList<>();

		studentList.add( new Student( 1 , "홍길동" , 100 ) ) ;
		studentList.add( new Student( 2 , "임꺾정" , 75 ) ) ;
		studentList.add( new Student( 3 , "장길산" , 86 ) ) ;
		studentList.add( new Student( 4 , "정도전" , 97 ) ) ;		
		studentList.add( new Student( 5 , "이순신" , 95 ) ) ;
		
		
		List<Student> Studnet_95_list = studentList.stream()
													.filter( student -> student.getScore() >= 95 )
													.collect( Collectors.toList() );
									
        System.out.println( Studnet_95_list );	
		
		// ===============================================
        
        // [ 2번 문제 ]
        
        /*
         	2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
         */
         
		List<Student> Studnet_grade_list = studentList.stream()
				
				.filter( student -> student.getGrade().equals("A+")  )
				
				.collect( Collectors.toList() );
		// 결과 출력
		System.out.println( Studnet_grade_list );	
        
		// ===============================================
		
		// [ 3번문제 ]
		
		// 3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 
		// 스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		
		List<Character> charList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in) ;
 		
	    // 사용자로부터 영문자 10개 입력 받기
        for (int i = 0; i < 10; i++) 
        {
            System.out.print( i +  "번 영문자를 입력해주세요!");
            
            charList.add( sc.nextLine().charAt(0) );
        }
		
		List< Character > Change_List = charList.stream()
				
											 .map( ch -> {
												 
											 		if ( ch >= 'A' && ch <= 'Z')
											 		{
											 			return ch.toLowerCase( ch );
											 		}
											 		else if ( ch >= 'a' && ch <= 'z')
											 		{
											 			return ch.toUpperCase( ch );
											 		}
											 		else
											 		{
											 			return ch;
											 		}
											 		
											 	})
											 		
											 .collect( Collectors.toList() );

		System.out.println( Change_List );
		
		
		// ===============================================
		
		

	}

}
