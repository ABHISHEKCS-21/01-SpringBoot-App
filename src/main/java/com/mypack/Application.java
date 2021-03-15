package com.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	List<string> list= new ArrayList();
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//Some modification done ok
		//Changed made by feature-22;
	}

}
