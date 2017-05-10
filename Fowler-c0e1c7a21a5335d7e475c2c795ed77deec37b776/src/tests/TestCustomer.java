package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import program.Customer;


public class TestCustomer {

    private static Customer testCustomer;

    @BeforeClass
    public static void init()
    {
        testCustomer = new Customer("Kunde1");
    }

    @Test
 	public void testGetName() {
 		assertEquals("Kunde1", testCustomer.getName());
 	}

 	@Test
 	public void testStatement() {
 		assertNotNull(testCustomer.statement());
 }
}