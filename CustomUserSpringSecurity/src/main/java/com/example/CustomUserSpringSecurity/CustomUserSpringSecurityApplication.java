package com.example.CustomUserSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CustomUserSpringSecurityApplication {

	public static void main(String[] args) {

//		PasswordEncoder passEnc = new BCryptPasswordEncoder();
//		String s = passEnc.encode("password");
//		System.out.println(s);
		SpringApplication.run(CustomUserSpringSecurityApplication.class, args);
	}

}
