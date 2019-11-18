package com.training.comparable.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.comparable.Car;

public class TestCollectionUsingComparable {

	List<Car> cars;
	
	/**
	 * Executes before every test case; creates new object and initializes its properties
	 */
	@Before
	public void setUp() {
		cars = new ArrayList<Car>();
	}
	
	/**
	 * Method to test sorting of Car class instances
	 * using Comparable interface
	 */
	@Test
	public void testSortingOfCarsByNameUsingComparableInterface() {
		Car c1 = (new Car("Suzuki", "Swift", 2005, 514000));
		Car c2 = (new Car("Maruti", "Benz", 2019, 3172000));
		Car c3 = (new Car("Skoda", "Octavia", 2019, 1863252));
		
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);

		Collections.sort(cars);
		Iterator<Car> iterator = cars.iterator();
		
		assertEquals("Maruti", iterator.next().getMake());
		assertEquals("Skoda", iterator.next().getMake());
		assertEquals("Suzuki", iterator.next().getMake());
	}
}
