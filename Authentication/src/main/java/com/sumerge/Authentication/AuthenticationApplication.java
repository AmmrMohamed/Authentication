package com.sumerge.Authentication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(UsersRepository repository) {
//		return args -> {
//			users users = new users(
//					"amor@gmail.com",
//					"123123"
//			);
//			repository.insert(users);
//		};
//	}


}
