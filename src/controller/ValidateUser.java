package controller;

public class ValidateUser {

	public boolean validate(String email, String password) {
		// TODO Auto-generated method stub
		if(email.equals("admin") && password.equals("admin"))
			return true;
		else 
			return false;
	}

}
