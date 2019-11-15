package com.training.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.collection.Car;
import com.training.collection.CellPhone;
import com.training.collection.Laptop;
import com.training.collection.School;
import com.training.collection.Television;

public class TestCollection {

	List<Laptop> laptops;
	List<Television> televisions;
	List<Car> cars;
	List<CellPhone> cellphones;
	List<School> schools;

	/**
	 * Executes before every test case; creates new object and initializes its properties
	 */
	@Before
	public void setUp() {
		laptops = new ArrayList<>();
		televisions = new ArrayList<>();
		cellphones = new ArrayList<>();
		cars = new ArrayList<>();
		schools = new ArrayList<>();
	}

	/**
	 * Method to test List Collection on Laptop class
	 */
	@Test
	public void testLaptops() {
		laptops.add(new Laptop("Lenovo", "L480", "Windows 10", "Core i5"));
		laptops.add(new Laptop("HP", "15-da1030tu", "Linux", "Core i5"));
		laptops.add(new Laptop("Apple", "MacBook Pro", "macOS", "Core i7"));
		
		Iterator<Laptop> it = laptops.iterator();
		assertEquals("Lenovo",it.next().getCompany());
		assertEquals("HP", it.next().getCompany());
		assertEquals("Apple", it.next().getCompany());
	}
	
	/**
	 * Method to test List Collection on Television class
	 */
	@Test
	public void testTelevisions() {
		televisions.add(new Television("LG", "LED", true, 59500));
		televisions.add(new Television("Sony", "LED", false, 199900));
		televisions.add(new Television("Samsung", "LCD", false, 50000));
		
		Iterator<Television> it = televisions.iterator();
		assertEquals("LG",it.next().getCompany());
		assertEquals("Sony", it.next().getCompany());
		assertEquals("Samsung", it.next().getCompany());
	}
	
	/**
	 * Method to test List Collection on School class
	 */
	@Test
	public void testSchools() {
		schools.add(new School("DAV", "Bhilai", "Raipur", 4));
		schools.add(new School("DPS", "Delhi", "Delhi", 1));
		schools.add(new School("KV", "Jaipur", "Jaipur", 5));
		
		Iterator<School> it = schools.iterator();
		assertEquals("DAV",it.next().getName());
		assertEquals("DPS", it.next().getName());
		assertEquals("KV", it.next().getName());
	}
	
	/**
	 * Method to test List Collection on Car class
	 */
	@Test
	public void testCars() {
		cars.add(new Car("Suzuki", "Swift", 2005, 514000));
		cars.add(new Car("Maruti", "Benz", 2019, 3172000));
		cars.add(new Car("Skoda", "Octavia", 2019, 1863252));
		
		Iterator<Car> it = cars.iterator();
		assertEquals("Suzuki",it.next().getMake());
		assertEquals("Maruti", it.next().getMake());
		assertEquals("Skoda", it.next().getMake());
	}
	
	/**
	 * Method to test List Collection on Cellphone class
	 */
	@Test
	public void testCellPhones() {
		cellphones.add(new CellPhone("Xiaomi", "Redmi K20", "Android", 25000));
		cellphones.add(new CellPhone("Samsung", "Note 10", "Android", 80000));
		cellphones.add(new CellPhone("Apple", "iPhone X", "iOS", 44500));
		
		Iterator<CellPhone> it = cellphones.iterator();
		assertEquals("Xiaomi",it.next().getCompany());
		assertEquals("Samsung", it.next().getCompany());
		assertEquals("Apple", it.next().getCompany());
	}
}
