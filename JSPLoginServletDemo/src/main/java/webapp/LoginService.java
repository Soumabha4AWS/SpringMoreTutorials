package webapp;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Shubham") && password.equals("Sengupta");
	}

}