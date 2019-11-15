package com.training.studentname.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.studentname.Student;

public class TestStudentNameOrder {

	List<Student> students;
	Set<Student> studentSet;
	
	/**
	 * Executes before every test case; creates new object and initializes its properties
	 */
	@Before
	public void setup() {
		students = new ArrayList<>();
		studentSet = new HashSet<>();
	}
	
	/**
	 * Method to test insertion order of list of names of students
	 */
	@Test
	public void testInsertionOrderOfTheNamesOfStudentsInAList() {
		Student s1 = new Student("Nivedita");
		Student s2 = new Student("Manjula");
		Student s3 = new Student("Chetali");
		Student s4 = new Student("Riya");
		Student s5 = new Student("Prashanth");
		Student s6 = new Student("Shekhar");
		Student s7 = new Student("Shyam");
		
		students.add(s7);
		students.add(s6);
		students.add(s5);
		students.add(s4);
		students.add(s3);
		students.add(s2);
		students.add(s1);
		
		Iterator<Student> it = students.iterator();
		assertEquals(s7, it.next());
		assertEquals(s6, it.next());
		assertEquals(s5, it.next());
		assertEquals(s4, it.next());
		assertEquals(s3, it.next());
		assertEquals(s2, it.next());
		assertEquals(s1, it.next());
	}
	
	/**
	 * Method to test insertion order of Set of names of students throws exception
	 * REASON: Set does not maintain natural order of insertion
	 * @throws AssertionError
	 */
	@Test(expected = AssertionError.class)
	public void testInsertionOrderForSetThrowsException() throws AssertionError {
		Student s1 = new Student("Nivedita");
		Student s2 = new Student("Manjula");
		Student s3 = new Student("Chetali");
		Student s4 = new Student("Riya");
		Student s5 = new Student("Prashanth");
		Student s6 = new Student("Shekhar");
		Student s7 = new Student("Shyam");
		
		studentSet.add(s7);
		studentSet.add(s6);
		studentSet.add(s5);
		studentSet.add(s4);
		studentSet.add(s3);
		studentSet.add(s2);
		studentSet.add(s1);
		
		Iterator<Student> it = studentSet.iterator();
		assertEquals(s7, it.next());
		assertEquals(s6, it.next());
		assertEquals(s5, it.next());
		assertEquals(s4, it.next());
		assertEquals(s3, it.next());
		assertEquals(s2, it.next());
		assertEquals(s1, it.next());
	}
}
