package com.myprojects.junittests;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestsApplication {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		// Calculator methods
		Integer res1 = myCalc.sum(1, 1);
		Integer res2 = myCalc.substract(10, 8);
		Integer res3 = myCalc.multiply(6, 4);
		double res4 = myCalc.divide(27, 4);

		System.out.println("1 + 1 = " + res1);
		System.out.println("10 - 8 = " + res2);
		System.out.println("6 * 4 = " + res3);
		System.out.println("27 / 4 = " + res4);

		// java.util.function methods
		Function<String, Integer> strLengthFunction = str -> str.length();
		int res5 = strLengthFunction.apply("Hello");
		System.out.println("longueur de la chaîne 'Hello': " + res5);

		Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
		boolean res6 = isEvenPredicate.test(6);
		System.out.println("6 is even : " + res6);

		Consumer<String> stringPrinter = str -> System.out.println(str);
		stringPrinter.accept("This is a java.util.function.Consumer test.");

		Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);
		int randomNumber = randomIntSupplier.get();
		System.out.println("java.util.function.Supplier test, with Math.random(): " + randomNumber);
		
	}
}
