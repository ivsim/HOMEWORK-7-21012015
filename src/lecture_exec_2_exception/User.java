package lecture_exec_2_exception;

public class User {

	public String email;
	public String password;
	
	public User(String email, String password){
		setEmail(email);
		setPassword(password);
	}
	
	public void setEmail(String email){
		
		if (email.length() <= 5) {
			throw new IllegalArgumentException("Email must be more than 5 characters!");
		}
		if (!email.contains("@")) {
			throw new IllegalArgumentException("Email must contain \"@\"!");
		}
		
			this.email = email;
		
		
	}
	
	public void setPassword(String password){
		
		if (password.length() < 6){
			throw new IllegalArgumentException("Password must be at least 6 characters!");
		}
		if (password.contains("0") ||
		    password.contains("1") ||
		    password.contains("2") ||
			password.contains("3") ||
			password.contains("4") ||
			password.contains("5") ||
			password.contains("6") ||
			password.contains("7") ||
			password.contains("8") ||
			password.contains("9") ){
			this.password = password;
		}
		else {
			throw new IllegalArgumentException("Password must contain at least one digit!");
		}		
		
		
	}
	
	
}
