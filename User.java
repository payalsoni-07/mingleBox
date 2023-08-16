
public class User
{
	private String username, email, password, userType;
	
	public User(String username, String email, String password,String userType){
	    this.username = username;
	    this.email = email;
	    this.password = password;
	    this.userType = userType;
	}
	public String getUsername(){
	    return username;
	}
	public String getEmail(){
	    return email;
	}
	public String getPassword(){
	    return password;
	}
	public String getUsertype(){
	    return userType;
	}
}
