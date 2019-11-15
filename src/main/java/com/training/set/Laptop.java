package com.training.set;

public class Laptop {

	private String company;
	private String model;
	private String operatingSystem;
	private String processor;

	/**
	 * Default constructor
	 */
	public Laptop() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param company
	 * @param model
	 * @param operatingSystem
	 * @param processor
	 */
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
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

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	/**
	 * toString() method overridden
	 */
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}

	/**
	 * Overridden the hashCode() method to provide the desired implementation
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	/**
	 * Overridden the equals() method to provide the desired implementation
	 */
	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		if (this == obj)
			answer = true;
		if (obj == null)
			answer = false;
		if (getClass() != obj.getClass())
			answer = false;
		Laptop laptop = (Laptop) obj;
		if (this.getCompany() == laptop.getCompany() && this.getModel() == laptop.getModel())
			answer = true;
		return answer;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Laptop laptop = (Laptop) obj;
//		if (this.getCompany() == laptop.getCompany() && this.getModel() == laptop.getModel())
//			return true;
//		if (obj == null)
//			return false;
//		if (obj.getClass() != this.getClass())
//			return false;
//		return true;
//	}

}
