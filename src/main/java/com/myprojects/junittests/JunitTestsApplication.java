package com.myprojects.junittests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitTestsApplication.class, args);

		Calculator myCalc = new Calculator();

		Integer res1 = myCalc.sum(1, 1);
		Integer res2 = myCalc.substract(10, 8);
		Integer res3 = myCalc.multiply(6, 4);
		float res4 = myCalc.divide(39, 3);

		System.out.println("1 + 1 = " + res1);
		System.out.println("10 - 8 = " + res2);
		System.out.println("6 * 4 = " + res3);
		System.out.println("39 / 3 = " + res4);
	}

}
