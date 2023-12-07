package com.myprojects.junittests;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestsApplication {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		Integer res1 = myCalc.sum(1, 1);
		Integer res2 = myCalc.substract(10, 8);
		Integer res3 = myCalc.multiply(6, 4);
		double res4 = myCalc.divide(27, 4);

		System.out.println("1 + 1 = " + res1);
		System.out.println("10 - 8 = " + res2);
		System.out.println("6 * 4 = " + res3);
		System.out.println("27 / 4 = " + res4);
	}
}
