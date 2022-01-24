package com.example.demo;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@PropertySource("application.properties")
public class CsvDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CsvDemoApplication.class, args);
		
		
	}

}
