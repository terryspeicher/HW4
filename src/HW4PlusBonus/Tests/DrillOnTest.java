package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.DrillOn;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

// TODO: Auto-generated Javadoc
/**
 * The Class DrillOnTest.
 */
public class DrillOnTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test drill on.
	 */
	@Test
	public void testDrillOn() {
		assertTrue(new DrillOn() instanceof State);
		Assert.assertTrue(new DrillOn() instanceof State);
		assertFalse(!(new DrillOn() instanceof Object)); // double negative
	}

}
