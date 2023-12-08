package com.myprojects.junittests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestsApplication {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		// Calculator methods
		System.out.println("\n### Calculator methods:");
		Integer res1 = myCalc.add(1, 1);
		Integer res2 = myCalc.substract(10, 8);
		Integer res3 = myCalc.multiply(6, 4);
		double res4 = myCalc.divide(27, 4);

		System.out.println("1 + 1 = " + res1);
		System.out.println("10 - 8 = " + res2);
		System.out.println("6 * 4 = " + res3);
		System.out.println("27 / 4 = " + res4);
		double div = myCalc.divide(13, 0);
		System.out.println("13 / 0 = " + div);

		// java.util.function methods
		System.out.println("\n### java.util.function methods:");
		Function<String, Integer> strLengthFunction = str -> str.length();
		int res5 = strLengthFunction.apply("Hello");
		System.out.println("java.util.function.Funtion test with (longueur de la chaîne 'Hello'): " + res5);

		Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
		boolean res6 = isEvenPredicate.test(6);
		System.out.println("java.util.function.Predicate test with (6 is even) : " + res6);

		Consumer<String> stringPrinter = str -> System.out.println(str);
		stringPrinter.accept("java.util.function.Consumer for printing 'test': test");

		Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);
		int randomNumber = randomIntSupplier.get();
		System.out.println("java.util.function.Supplier test, with Math.random(): " + randomNumber);

		// Collections
		System.out.println("\n### Collections:");
		System.out.println("\n ° List:");
		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.forEach(str -> System.out.print(str + ", "));
		System.out.println();
		
		System.out.println("\n ° Map:");
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("Mike", 13);
		myMap.put("Steve", 15);
		myMap.put("Elf", 12);
		System.out.println("Eléments du Map: " + myMap);
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Clé : " + key + ", Valeur : " + value);
		}

		System.out.println("\n ° Set:");
		Set<String> ensemble = new HashSet<>();
		ensemble.add("Rouge");
		ensemble.add("Vert");
		ensemble.add("Bleu");
		ensemble.add("Rouge");  // Ignoré car "Rouge" est déjà présent
		System.out.println("Éléments de l'ensemble : " + ensemble);
		
		System.out.println("\n ° Queue:");
		Queue<String> file = new LinkedList<>();
		file.add("Étape 1");
		file.add("Étape 2");
		file.add("Étape 3");
		System.out.println("Prochaine étape de la File " + file + ": " + file.poll());

		System.out.println("\n ° Stack:");
		Stack<String> strStack = new Stack<>();
		strStack.push("bottom");
		strStack.push("middle");
		strStack.push("top");
		System.out.println("Eléments de la pile: " + strStack);
		System.out.println("Premier élément de la pile: " + strStack.pop());

		// Stream API
		System.out.println("\n### Stream API");
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("Eléments > 2 parmi la liste " + intList + ": ");
		List<Integer> intList2 = intList
			.stream()
			.filter(intElem -> intElem.intValue() > 2).collect(Collectors.toList());
		intList2.forEach(i -> System.out.println(i));

		System.out.println();
	}
}
