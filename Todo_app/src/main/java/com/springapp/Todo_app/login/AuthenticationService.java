package com.springapp.Todo_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("Sagar");
		boolean isValidPassword = password.equals("pass123");
		
		return isValidUsername && isValidPassword;
	}

}
