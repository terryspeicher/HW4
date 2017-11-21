package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.MoveFc;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class MoveFcTest.
 */
public class MoveFcTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test MoveFc.
	 */
	@Test
	public void testMoveFc() {
		assertTrue(new MoveFc() instanceof State);
		Assert.assertTrue(new MoveFc() instanceof State);
		assertFalse(!(new MoveFc() instanceof Object)); // double negative
	}

}
