package com.luv2code.docusign_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DocusignDemoApplication {

	@GetMapping("/msg")
	public String message(){
		return "Congrats";
	}

	public static void main(String[] args) {
		SpringApplication.run(DocusignDemoApplication.class, args);
	}

}
