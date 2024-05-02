package homework.advance;


public class UserBook {
	
	public String user_name_list[] = new String[ 100 ] ;
	
	public String user_password_list[] =  new String[ 100 ] ;
	
	public UserBook()
	{
		System.out.println( "UserBook 클래스를 호출합니다." );
	}
	
	public String getUser_name_list(int index) {
		
		return user_name_list[index];
	}


	public void setUser_name_list( int index , String user_name_list )
	{
		this.user_name_list[index] = user_name_list;
	}


	public String getUser_password_list( int index ) {
		
		return user_password_list[index] ;
	}


	public void setUser_password_list( int index , String user_password_list ) {
		
		this.user_password_list[index] = user_password_list;
		
	}

	
	public void saveUserInfo( int index , String username , String password )
	{
		
		this.user_name_list[ index ] = username ;
		
		System.out.println( "유저 아이디 : " + this.user_name_list[ index ]  );
		
		this.user_password_list[ index ] = password ;		
		
		System.out.println( "유저 패스워드 : " + this.user_password_list[ index ]  );

		System.out.println( "저장되었습니다." );
		
	}
	
	
	
}
