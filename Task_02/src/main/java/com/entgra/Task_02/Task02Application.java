package com.entgra.Task_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class Task02Application {

	public static void main(String[] args) {

		SpringApplication.run(Task02Application.class, args);
	}
//	public Docket apis(){
//		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.entgra")).build();
//	}

}

