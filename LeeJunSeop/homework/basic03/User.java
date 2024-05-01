package homework.basic03;

public class User {
//	3. User 클래스를 생성하세요. long id, String username, String password를 필드로 가지고
//	getter, setter 메소드를 구현하세요. id, username, password 필드는 private으로 지정합니다.
	
	private long id;
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return this.username;
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
