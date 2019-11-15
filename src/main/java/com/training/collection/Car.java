package com.training.collection;

public class Car {

	private String make;
	private String model;
	private double year;
	private double price;
	
	/**
	 * Default constructor
	 */
	public Car() {
	}

	/**
	 * Parameterized constructor
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String make, String model, double year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * Getters and setters for all attributes
	 */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
