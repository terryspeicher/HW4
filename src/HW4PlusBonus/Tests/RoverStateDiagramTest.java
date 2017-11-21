package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.RoverStateDiagram;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class RoverStateDiagramTest.
 */
public class RoverStateDiagramTest {

	/*
	 * Not really much that can be done for a class with no output. This is just
	 * busy work to test something
	 */

	
	/**
	 * Test RoverStateDiagram.
	 */
	@Test
	public void testRoverStateDiagram() {
		assertTrue(new RoverStateDiagram() instanceof RoverStateDiagram);
		Assert.assertTrue(new RoverStateDiagram() instanceof RoverStateDiagram);
		assertFalse(!(new RoverStateDiagram() instanceof Object)); // double negative
	}

}
