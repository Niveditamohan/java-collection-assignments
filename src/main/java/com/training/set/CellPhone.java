package com.training.set;

import java.util.Objects;

public class CellPhone {

	private String company;
	private String model;
	private String operatingSystem;
	private double price;

	/**
	 * Default constructor
	 */
	public CellPhone() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param company
	 * @param model
	 * @param operatingSystem
	 * @param price
	 */
	public CellPhone(String company, String model, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
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
		CellPhone cellphone = (CellPhone) obj;
		if (this.getCompany() == cellphone.getCompany() && this.getModel() == cellphone.getModel()
				&& this.getOperatingSystem() == cellphone.getOperatingSystem())
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
		return Objects.hash(company, model, operatingSystem, price);
	}
}
