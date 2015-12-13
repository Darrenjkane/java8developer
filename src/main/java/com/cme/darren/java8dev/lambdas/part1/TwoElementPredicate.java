package com.cme.darren.java8dev.lambdas.part1;

@FunctionalInterface
public interface TwoElementPredicate<T> {

	/**
	 * 
	 * Returns true if the first element is "better" than the second one, returns
	 * false otherwise. Concrete classes (or lambdas) that implement this
	 * interface give meaning to their definition of "better".
	 *
	 * @param obj1
	 * @param obj2
	 * @return true or false
	 */
	boolean isBetter(T obj1, T obj2);
}
