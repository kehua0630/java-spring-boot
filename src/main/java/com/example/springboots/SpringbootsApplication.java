package com.example.springboots;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsApplication.class, args);
	}

	@Bean
    public CommandLineRunner testRunner(Teacher teacher) {
        return args -> teacher.teach();  // Should print both "Teacher teaches..." and "HP Printer: Printing from teacher."
    }

}
