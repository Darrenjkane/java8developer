package com.cme.darren.java8dev.lambdas.part1;

public class Car {
	String manufacturer;

	public Car(String manufacturer) {
		super();
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Car [manufacturer=" + manufacturer + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

}
