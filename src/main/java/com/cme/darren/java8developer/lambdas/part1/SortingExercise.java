package com.cme.darren.java8developer.lambdas.part1;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class SortingExercise {

	public static void main(String[] args) {

		String[] names = { "Bob", "Charly", "Wilfred", "Ben", "Mikey", "Adam", "Ed", "Einsteiner" };

		sortShortestToLongest(names);
		sortLongestToShortest(names);
		sortByFirstCharacter(names);
		sortButWithEsAtTheFront(names);

	}

	private static void sortShortestToLongest(String[] names) {
		Arrays.sort(names, (str1, str2) -> str1.length() - str2.length());
		printArray(names);
	}

	private static void sortLongestToShortest(String[] names) {
		Arrays.sort(names, (str1, str2) -> str2.length() - str1.length());
		printArray(names);
	}

	private static void sortByFirstCharacter(String[] names) {
		Arrays.sort(names, (str1, str2) -> (int) str1.charAt(0) - (int) str2.charAt(0));
		printArray(names);
	}

	private static void sortButWithEsAtTheFront(String[] names) {
		Arrays.sort(names, (str1, str2) -> {
			if (str1.toLowerCase().contains("e") && !str2.toLowerCase().contains("e")) {
				return -1;
			}
			if (!str1.toLowerCase().contains("e") && str2.toLowerCase().contains("e")) {
				return 1;
			}
			return 0;
		});
		printArray(names);
	}

	private static void printArray(String[] names) {
		System.out.println(Arrays.asList(names));
	}
}
