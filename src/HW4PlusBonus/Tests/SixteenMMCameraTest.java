package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.SixteenMMCamera;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class SixteenMMCameraTest.
 */
public class SixteenMMCameraTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test Sixteen MM Camera.
	 */
	@Test
	public void testSixteenMMCamera() {
		assertTrue(new SixteenMMCamera() instanceof State);
		Assert.assertTrue(new SixteenMMCamera() instanceof State);
		assertFalse(!(new SixteenMMCamera() instanceof Object)); // double negative
	}

}
