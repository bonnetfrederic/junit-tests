package com.myprojects.junittests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitTestsApplication.class, args);

		Calculator myCalc = new Calculator();
		Integer res = myCalc.sum(1, 1);
		System.out.println("1 + 1 = " + res);
	}

}
