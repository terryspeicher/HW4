package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.MoveFa;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class MoveFaTest.
 */
public class MoveFaTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test MoveFa.
	 */
	@Test
	public void testMoveFa() {
		assertTrue(new MoveFa() instanceof State);
		Assert.assertTrue(new MoveFa() instanceof State);
		assertFalse(!(new MoveFa() instanceof Object)); // double negative
	}

}
