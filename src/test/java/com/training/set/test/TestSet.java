package com.training.set.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.set.Car;
import com.training.set.CellPhone;
import com.training.set.School;
import com.training.set.Television;
import com.training.set.Laptop;

public class TestSet {

	Set<Laptop> laptops;
	Set<Television> televisions;
	Set<Car> cars;
	Set<School> schools;
	Set<CellPhone> cellphones;
	
	/**
	 * Executes before every test case; creates new object and initializes its properties
	 */
	@Before
	public void setUp() {
		laptops = new HashSet<Laptop>();
		televisions = new HashSet<>();
		schools = new HashSet<>();
		cellphones = new HashSet<>();
		cars = new HashSet<>();
	}
	
	/**
	 * Method to test List Collection on Cellphone class
	 */
	@Test
	public void testSetInterfaceForSortingObjectsOfLaptopClassByMakeWhenDuplicateInputsAreProvided() {
		Laptop l1 = new Laptop("Lenovo", "L480", "Windows 10", "Core i5");
		Laptop l2 = new Laptop("HP", "15-da1030tu", "Linux", "Core i5");
		Laptop l3 = new Laptop("Apple", "MacBook Pro", "macOS", "Core i7");
		Laptop l4 = new Laptop("HP", "15-da1030tu", "Linux", "Core i5");
		
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		laptops.add(l4);
		
		assertEquals(3, laptops.size());
	}

	/**
	 * Method to test List Collection on Cellphone class
	 */
	@Test
	public void testTelevisions() {
		Television t1 = (new Television("LG", "LED", true, 59500));
		Television t2 = (new Television("Sony", "LED", false, 199900));
		Television t3 = (new Television("Sony", "LED", false, 199900));
		
		televisions.add(t1);
		televisions.add(t2);
		televisions.add(t3);
		
		assertEquals(2,televisions.size());
	}
	
	/**
	 * Method to test List Collection on School class
	 */
	@Test
	public void testSchools() {
		School s1 = (new School("DAV", "Bhilai", "Raipur", 4));
		School s2 = (new School("DPS", "Delhi", "Delhi", 1));
		School s3 = (new School("KV", "Jaipur", "Jaipur", 5));
		School s4 = (new School("KV", "Jaipur", "Jaipur", 5));
		
		schools.add(s1);
		schools.add(s2);
		schools.add(s3);
		schools.add(s4);
		
		assertEquals(3, schools.size());
	}
	
	/**
	 * Method to test List Collection on Car class
	 */
	@Test
	public void testCars() {
		Car c1 = (new Car("Suzuki", "Swift", 2005, 514000));
		Car c2 = (new Car("Maruti", "Benz", 2019, 3172000));
		Car c3 = (new Car("Skoda", "Octavia", 2019, 1863252));
		Car c4 = (new Car("Suzuki", "Swift", 2005, 514000));
		
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		
		assertEquals(3, cars.size());
	}
	
	/**
	 * Method to test List Collection on Cellphone class
	 */
	@Test
	public void testCellPhones() {
		CellPhone cp1 = (new CellPhone("Xiaomi", "Redmi K20", "Android", 25000));
		CellPhone cp2 = (new CellPhone("Samsung", "Note 10", "Android", 80000));
		CellPhone cp3 = (new CellPhone("Apple", "iPhone X", "iOS", 44500));
		CellPhone cp4 = (new CellPhone("Samsung", "Note 10", "Android", 80000));
		
		cellphones.add(cp1);
		cellphones.add(cp2);
		cellphones.add(cp3);
		cellphones.add(cp4);
		
		assertEquals(3, cellphones.size());
	}
}
