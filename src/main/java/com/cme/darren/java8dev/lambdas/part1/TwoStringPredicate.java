package com.cme.darren.java8dev.lambdas.part1;

@FunctionalInterface
public interface TwoStringPredicate {

	/**
	 * 
	 * Returns true if the first String is "better" than the second one, returns
	 * false otherwise. Concrete classes (or lambdas) that implement this
	 * interface give meaning to their definition of "better".
	 *
	 * @param s1
	 * @param s2
	 * @return true or false
	 */
	boolean isBetter(String s1, String s2);
}
