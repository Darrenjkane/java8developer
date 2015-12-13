package com.cme.darren.java8developer.lambdas.part1;


public class IsBetterExamples {
	
	public static void main(String[] args) {
		
		String test1 = "Hello";
		String test2 = "Goodbye";
		
		String message = "Better of %s and %s based on %s is %s.%n";
		
		String result1 = StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
		System.out.printf(message, test1, test2, "length", result1);
		
		String result2 = StringUtils.betterString(test1, test2, (s1, s2) -> true);
		System.out.printf(message, test1, test2, "1st arg", result2);
		

		String result3 = ElementUtils.betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length());
		System.out.printf(message, test1, test2, "length", result3);

		String result4 = ElementUtils.betterElement(test1, test2, (s1, s2) -> true);
		System.out.printf(message, test1, test2, "length", result4);

		int result5 = ElementUtils.betterElement(1, 2, (n1, n2) -> n1 > n2);
		System.out.printf(message, test1, test2, "length", result5);

		Car car1 = new Car("Mazda");
		Car car2 = new Car("Ford");
		
		Car result6 = ElementUtils.betterElement(car1, car2, (c1, c2) -> c1.getManufacturer().length() > c2.getManufacturer().length());
		System.out.printf(message, car1, car2, "length", result6);
	}
}
