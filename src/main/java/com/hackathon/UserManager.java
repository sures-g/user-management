package com.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.hackathon.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.hackathon"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class UserManager {

	public static void main(String[] args) {
		SpringApplication.run(UserManager.class, args);
	}
}
