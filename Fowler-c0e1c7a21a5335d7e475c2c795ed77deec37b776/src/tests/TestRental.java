package tests;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import program.Movie;
import program.Rental;

public class TestRental {

	private static Movie jamesBond;
	private static Rental rental;

	@BeforeClass
	public static void init() {
		jamesBond = new Movie("James Bond - Spectre", 17);
		rental = new Rental(jamesBond, 5);
	}

	@Test
	public void testGetDaysRented() {
		assertEquals(5, rental.getDaysRented());
	}

	@Test
	public void testGetMovie() {
		assertEquals(jamesBond, rental.getMovie());

	}
}