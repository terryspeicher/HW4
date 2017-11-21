package HW4PlusBonus.Tests;

import org.junit.Test;

import HW4PlusBonus.ColorCamera;
import HW4PlusBonus.State;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * The Class ColorCameraTest is used for JUnit testing of the ColorCamera class.
 * 
 *   
 * @author Terry Speicher
 * @version 1.1
 */
public class ColorCameraTest {
	
	
	/*
	 * Not really much that can be done for a class with no output.  This is just busy work to 
	 * test something
	 */
	

	/**
	 * Test color camera.
	 */
	@Test
	public void testColorCamera() {
		assertTrue(new ColorCamera() instanceof State);
		Assert.assertTrue(new ColorCamera() instanceof State);
		assertFalse(  !(new ColorCamera() instanceof Object) );  //double negative
	}

}
