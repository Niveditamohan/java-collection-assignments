package com.training.set;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean threeDEnabled;
	private double price;

	/**
	 * Default constructor
	 */
	public Television() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param company
	 * @param type
	 * @param threeDEnabled
	 * @param price
	 */
	public Television(String company, String type, boolean threeDEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}

	/**
	 * Getters and setters for all attributes
	 */
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isThreeDEnabled() {
		return threeDEnabled;
	}

	public void setThreeDEnabled(boolean threeDEnabled) {
		this.threeDEnabled = threeDEnabled;
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
		Television television = (Television) obj;
		if (this.getCompany() == television.getCompany() && this.getType() == television.getType()
				&& this.getPrice() == television.getPrice())
			return true;
		else if (obj == null)
			return false;
		else if (obj.getClass() != this.getClass())
			return false;
		else
			return false;
	}

	/**
	 * Overridden the hashCode() method to provide the desired implementation
	 */
	@Override
	public int hashCode() {
		return Objects.hash(company, type, threeDEnabled, price);
	}
}
