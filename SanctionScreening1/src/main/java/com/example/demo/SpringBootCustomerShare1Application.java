package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import info.debatty.java.stringsimilarity.Levenshtein;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootCustomerShare1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomerShare1Application.class, args);
		Levenshtein l = new Levenshtein();
		System.out.println(l.distance("My string", "My string"));
	}

}
