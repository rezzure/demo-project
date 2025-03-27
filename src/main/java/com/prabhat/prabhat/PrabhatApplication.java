package com.prabhat.prabhat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrabhatApplication {
	@GetMapping ("/welcome")
	public String welcome() {
		return "Hello, you have deployed spring boot app on kubernetess";
	}

	public static void main(String[] args) {
		SpringApplication.run(PrabhatApplication.class, args);
	}

}
