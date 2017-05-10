package tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import program.Movie;

public class TestMovie {

	private static Movie jamesBond;

	@BeforeClass
	public static void init() {
		jamesBond = new Movie("James Bond - Spectre", Movie.REGULAR);
	}

	@Test
	public void testGetPriceCode() {
		assertEquals(Movie.REGULAR, jamesBond.getPriceCode());
	}

	@Test
	public void testSetPriceCode() {
		jamesBond.setPriceCode(Movie.CHILDRENS);
		assertEquals(Movie.CHILDRENS, jamesBond.getPriceCode());
	}

	@Test
	public void testGetTitle() {
		assertEquals("James Bond - Spectre", jamesBond.getTitle());
	}
}