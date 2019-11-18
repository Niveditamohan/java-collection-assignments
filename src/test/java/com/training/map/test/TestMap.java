package com.training.map.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.map.Student;

public class TestMap {

	Map<String,Student> students;
	
	/**
	 * Executes before every test case
	 */
	@Before
	public void setup() {
		students = new HashMap<>();
	}
	
	/**
	 * Method to test HashMap on students 
	 * Map: Key = student name, Value = favorite fruit
	 */
	@Test
	public void testMapOnStudentClass() {
		Student student1 = new Student("Nivedita", "Grapes");
		Student student2 = new Student("Manjula", "Strawberry");
		Student student3 = new Student("Chetali", "Pear");
		Student student4 = new Student("Riya", "Pineapple");
		
		students.put("Nivedita", student1);
		students.put("Manjula", student2);
		students.put("Chetali", student3);
		students.put("Riya", student4);
		
		assertEquals("Grapes", students.get("Nivedita").getFruit());
	}
	
	/**
	 * Method to test HashMap on students with invalid input
	 * Map: Key = student name, Value = favorite fruit
	 */
	@Test
	public void testMapOnStudentClassWithIncorrectInput() {
		Student student1 = new Student("Nivedita", "Grapes");
		Student student2 = new Student("Manjula", "Strawberry");
		Student student3 = new Student("Chetali", "Pear");
		Student student4 = new Student("Riya", "Pineapple");
		
		students.put("Nivedita", student1);
		students.put("Manjula", student2);
		students.put("Chetali", student3);
		students.put("Riya", student4);
		
		assertNotEquals("Apple", students.get("Nivedita").getFruit());
	}
	
	/**
	 * Executes after every test case
	 */
	@After
	public void tearDown() {
		students = null;
	}
}
