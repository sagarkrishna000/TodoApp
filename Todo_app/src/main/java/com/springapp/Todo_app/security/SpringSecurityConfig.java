package com.springapp.Todo_app.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		UserDetails userDetails1 = addNewUser("Sagar", "sagar123");
		UserDetails userDetails2 = addNewUser("Saggy", "pass123");
		
		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

	private UserDetails addNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
									.username(username)
									.password(password)
									.roles("User", "Admin")
									.build();
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
