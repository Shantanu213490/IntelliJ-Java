package com.neml.micro.appraisalService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.neml.micro.model")
public class AppraisalServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppraisalServiceApplication.class, args);
	}

}
