package com.training.set;

import java.util.Objects;

public class School {

	private String name;
	private String city;
	private String district;
	private int schoolRanking;
	
	/**
	 * Default constructor
	 */
	public School() {
	}

	/**
	 * Parameterized constructor
	 * @param name
	 * @param city
	 * @param district
	 * @param schoolRanking
	 */
	public School(String name, String city, String district, int schoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.schoolRanking = schoolRanking;
	}

	/**
	 * Getters and setters for all attributes
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getSchoolRanking() {
		return schoolRanking;
	}

	public void setSchoolRanking(int schoolRanking) {
		this.schoolRanking = schoolRanking;
	}
	
	/**
	 * Overridden the equals() method to provide the desired implementation
	 */
	@Override
	public boolean equals(Object obj) {
		School school = (School) obj;
		if(this.getName()==school.getName() && this.getDistrict()==school.getDistrict() && this.getCity()==school.getCity())
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
		return Objects.hash(name, city, district, schoolRanking);
	}
}
