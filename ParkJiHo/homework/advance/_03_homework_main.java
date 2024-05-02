package homework.advance;

import homework.basic._03_homework.User;

public class _03_homework_main {

	public static void main(String[] args) 
	{
		
		int user_index = 0 ;
		
		// #####################################
		
		// [ User 클래스 ] - 호출
		
		User user = new User() ;
		
		// #####################################
		
		// [ userBook 클래스 ] - 호출
		
		UserBook userBook = new UserBook( ) ;
		
		// #####################################
		
		// [ 유저이름 / 유저패스워스 ] - get // set
		
		userBook.setUser_name_list( user_index , "1번 유저 ID" ) ; 
		
		userBook.setUser_password_list( user_index , "1번 유저 Password" ) ; 
		
		// #####################################

		for ( int i = 0 ;  i < userBook.user_name_list.length ; i++ )
		{
			
			for ( int j = 0 ;  j < userBook.user_password_list.length ; j++ )
			{
				
				userBook.saveUserInfo( user_index  , userBook.user_name_list[ i + 1 ] ,userBook.user_password_list[ j ]  ) ;
				
			}		
		
		}
		// #####################################

	}
	
	
}
