package com.cme.darren.java8dev.lambdas.part1;

public class StringUtils {

	private StringUtils() {
	} // Uninstantiatable class; contains only static methods.
	
	public static String betterString(String s1, String s2, TwoStringPredicate tsp) {
		if (tsp.isBetter(s1, s2)){ 
			return s1;
		}
		return s2;
	}
}
