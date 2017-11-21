package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.Idle;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class IdleTest.
 */
public class IdleTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test idle.
	 */
	@Test
	public void testIdle() {
		assertTrue(new Idle() instanceof State);
		Assert.assertTrue(new Idle() instanceof State);
		assertFalse(!(new Idle() instanceof Object)); // double negative
	}

}
