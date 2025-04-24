package com.vcApp.Videocall;

import com.vcApp.Videocall.user.User;
import com.vcApp.Videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service){
		return args -> {
			service.register(User.builder()
							.username("vijay")
							.email("vj@gmail.com")
							.password("vj")
					.build());
			service.register(User.builder()
							.username("adhi")
							.email("ad@gmail.com")
							.password("ahah")
					.build());
			service.register(User.builder()
							.username("ram")
							.email("rm@mail.com")
							.password("ahah")
					.build());
		};
	}

}
