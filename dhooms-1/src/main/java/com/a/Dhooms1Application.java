package com.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("controller")
@SpringBootApplication
public class Dhooms1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dhooms1Application.class, args);
	}

}
