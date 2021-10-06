package com.bikkadIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(GitAppApplication.class, args);
	
	// IES-134 changes done
	context.close();
	
	}

}
