package week9;

public class Credentials {
	
	private String username, password;
	
	
	public  String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		if(username.length() < 8) {
			System.err.println("username should  at least be 8 characters long");
			return; //  exit the method
		}
		
		if(!username.endsWith("@gmail.com")) {
			System.err.println("user name must end with @gmail.com");
			return;
		}
		
		this.username = username;
	}

	
	
	public String getPassword() {
		return password;
	}
	

	public void setPassword(String password) {
		
		if(!Character.isLetter(password.charAt(0) )) {
			System.err.println("password must start with a letter");
			return;
		}
		
		this.password = password;
	}
	
	

	
	
}
