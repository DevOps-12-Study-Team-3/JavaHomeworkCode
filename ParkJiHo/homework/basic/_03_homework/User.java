package homework.basic._03_homework;

public class User {
	
	public long id;
	
//	private String username ;

//	private String password ;
	
	public String username ;
	
	public String password ;	
	
	public User()
	{
		System.out.println( "User 클래스를 호출합니다." );
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
