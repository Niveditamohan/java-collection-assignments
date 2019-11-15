package com.training.set;

import java.util.Objects;

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
	
	/**
	 * Overridden the equals() method to provide the desired implementation
	 */
	@Override
	public boolean equals(Object obj) {
		Car car = (Car) obj;
		if(this.getMake()==car.getMake() && this.getModel()==car.getModel())
			return true;
		else if(obj==null)
			return false;
		else if(obj.getClass()!=this.getClass())
			return false;
		else
			return false;
	}

	/**
	 * Overridden the hashCode() method to provide the desired implementation
	 */
	@Override
	public int hashCode() {
		return Objects.hash(make, model,year, price);
	}
}
