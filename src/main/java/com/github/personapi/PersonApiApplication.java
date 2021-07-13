package com.github.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.github.personapi.controller", "com.github.personapi.service"})
@EntityScan("com.github.personapi.entity")
@EnableJpaRepositories("com.github.personapi.repository")
public class PersonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
