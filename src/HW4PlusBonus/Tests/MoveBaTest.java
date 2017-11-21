package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.MoveBa;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

// TODO: Auto-generated Javadoc
/**
 * The Class MoveBaTest.
 */
public class MoveBaTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test MoveBa.
	 */
	@Test
	public void testMoveBa() {
		assertTrue(new MoveBa() instanceof State);
		Assert.assertTrue(new MoveBa() instanceof State);
		assertFalse(!(new MoveBa() instanceof Object)); // double negative
	}

}
