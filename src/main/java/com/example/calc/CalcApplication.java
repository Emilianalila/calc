package com.example.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);

		int res = add(3, 5);
		System.out.println("res = " + res);
	}

	static int add(int x, int y) {
		return x + y;
	}

}
