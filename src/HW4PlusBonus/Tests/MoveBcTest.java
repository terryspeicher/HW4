package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.MoveBc;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class MoveBcTest.
 */
public class MoveBcTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test MoveBc.
	 */
	@Test
	public void testMoveBc() {
		assertTrue(new MoveBc() instanceof State);
		Assert.assertTrue(new MoveBc() instanceof State);
		assertFalse(!(new MoveBc() instanceof Object)); // double negative
	}

}
