package com.app.stein;

import com.app.stein.model.Role;
import com.app.stein.model.User;
import com.app.stein.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootApplication
public class SteinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteinApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	 CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "Felipe", "Gilmar", "felipe", "1234", new ArrayList<>(), null, null));
			userService.saveUser(new User(null, "Bruno", "Vasconcellos", "bruno", "1234", new ArrayList<>(), null, null));
			userService.saveUser(new User(null, "Ricardo", "Triques", "ricardo", "1234", new ArrayList<>(), null, null));
			userService.saveUser(new User(null, "Renato", "Santos", "renato", "1234", new ArrayList<>(), null, null));

			userService.addRoleToUser("renato", "ROLE_USER");
			userService.addRoleToUser("felipe", "ROLE_USER");
			userService.addRoleToUser("renato", "ROLE_MANAGER");
			userService.addRoleToUser("ricardo", "ROLE_ADMIN");
			userService.addRoleToUser("ricardo", "ROLE_MANAGER");
			userService.addRoleToUser("bruno", "ROLE_ADMIN");
			userService.addRoleToUser("bruno", "ROLE_USER");
			userService.addRoleToUser("renato", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("felipe", "ROLE_SUPER_ADMIN");
		};
	}
}