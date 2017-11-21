package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.DrillOff;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class DrillOffTest.
 * 
 *   
 * @author Terry Speicher
 * @version 1.1
 */
public class DrillOffTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test drill off.
	 */
	@Test
	public void testDrillOff() {
		assertTrue(new DrillOff() instanceof State);
		Assert.assertTrue(new DrillOff() instanceof State);
		assertFalse(!(new DrillOff() instanceof Object)); // double negative
	}

}
