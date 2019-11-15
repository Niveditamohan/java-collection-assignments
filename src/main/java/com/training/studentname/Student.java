package com.training.studentname;

public class Student {

	private String studentName;
	
	/**
	 * Default constructor
	 */
	public Student() {
	}

	/**
	 * Parameterized constructor
	 * @param studentName
	 */
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	/**
	 * Getter and setter for studentName attribute
	 */
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * toString() method overridden
	 */
	@Override
	public String toString() {
		return studentName;
	}
	
}
