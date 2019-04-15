package com.wade.demo.bootrest.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HelloWorldSpringSqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringSqlApplication.class, args);
	}
}
