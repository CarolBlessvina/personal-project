package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("hello ");
		String source = "Here is an example. Right here.";
		String word = "here";
		int result = Practice.getOccurrences(source, word);
		System.out.println("number of occurrences "+result);
	}

}
