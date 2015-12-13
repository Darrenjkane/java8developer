package com.cme.darren.java8developer.lambdas.part1;

public class ElementUtils {

	private ElementUtils() {
	} // Uninstantiatable class; contains only static methods.
	
	public static <T> T betterElement(T obj1, T obj2, TwoElementPredicate<T> predicate) {
		if (predicate.isBetter(obj1, obj2)){ 
			return obj1;
		}
		return obj2;
	}
}
