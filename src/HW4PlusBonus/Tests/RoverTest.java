package HW4PlusBonus.Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import HW4PlusBonus.Rover;
import HW4PlusBonus.RoverEvents;
import HW4PlusBonus.RoverStates;

/**
 * The Class RoverTest. RoverTest does the JUnit testing for the Rover Project.  The Rover Class is the 
 * heart of the project and the State Class (and those that extend the State Class) only produce outputs, and 
 * therefore, can not be tested.  JUnit testing is done by creating a Rover and systematically placing 
 * the Rover into each of the 10 states, and then asserting that it is in the expected state after each of the
 * RoverEvents is applied.  
 * 
 * @author Terry Speicher
 * @version 1.1
 */
@SuppressWarnings("unused")
public class RoverTest {

	/**
	 * Test rover creation.
	 */
	@Test
	public void testRoverCreation() {
		
		Rover rover = new Rover();
		//new rover should be in Idle
		assertTrue(RoverStates.Idle == rover.getCurrentRoverState());
		
	}
	
	/**
	 * Test idle state transitions.
	 */
	@Test
	public void testIdleStatetransitions() {
		
		Rover rover = new Rover();

		//from Idle state, test all events
		rover = new Rover(); // make rover start all over to control what state it is in before the assertions
		assertTrue(RoverStates.MoveFa == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover();
		assertTrue(RoverStates.MoveFa == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover();
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover();
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover();
		assertTrue(RoverStates.MoveBa == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover();
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1));
		rover = new Rover();
		assertTrue(RoverStates.ColorCamera == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover();
		assertTrue(RoverStates.SixteenMMCamera == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover();
		assertTrue(RoverStates.DrillOff == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover();
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test move fc state transitions.
	 */
	@Test
	public void testMoveFcStatetransitions() {
		
		Rover rover = new Rover();

		//From MoveFc (forward, constant speed)
		
		// make rover start all over to control what state it is in before the assertions 
		//get rover to MoveFc state
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.RP5Sec); rover.updateRover(RoverEvents.RP5Sec);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test move fa state transitions.
	 */
	@Test
	public void testMoveFaStatetransitions() {
		
		Rover rover = new Rover();

		//From MoveFa (moving forward, accelerating)
		//Before each test, create new rover and put in the
		//MoveFa
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(RoverStates.MoveFc == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(RoverStates.MoveFc == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.RPOnce); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test move bc state transitions.
	 */
	@Test
	public void testMoveBcStatetransitions() {
		
		Rover rover = new Rover();
		
		//From MoveBc (moving backward, constant speed)
		//Before each test, create new rover and put in the
		//MoveBc
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(RoverStates.MoveFa == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); rover.updateRover(RoverEvents.LPOnce);
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test move ba state transitions.
	 */
	@Test
	public void testMoveBaStatetransitions() {
		
		Rover rover = new Rover();

		//From MoveBa (moving backward, accelerating)
		//Before each test, create new rover and put in the
		//MoveBa
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(RoverStates.MoveBc == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.LP5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test color camera state transitions.
	 */
	@Test
	public void testColorCameraStatetransitions() {
		
		Rover rover = new Rover();

		//From ColorCamera 
		//Before each test, create new rover and put in the
		//ColorCamera
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(RoverStates.ColorCamera == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(RoverStates.ColorCamera == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_5Sec); 
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test sixteen MM camera state transitions.
	 */
	@Test
	public void testSixteenMMCameraStatetransitions() {
		
		Rover rover = new Rover();

		
		//From SixteenMMCamera 
		//Before each test, create new rover and put in the
		//SixteenMMCamera
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(RoverStates.SixteenMMCamera == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(RoverStates.SixteenMMCamera == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1_10Sec); 
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test drill off transitions.
	 */
	@Test
	public void testDrillOfftransitions() {
		
		Rover rover = new Rover();

		//From DrillOff 
		//Before each test, create new rover and put in the
		//DrillOff
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(RoverStates.DrillOn == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); 
		assertTrue(RoverStates.Idle == rover.updateRover(RoverEvents.B2));
		
	}
	
	/**
	 * Test drill on state transitions.
	 */
	@Test
	public void testDrillOnStatetransitions() {
		
		Rover rover = new Rover();

		//From DrillOn 
		//Before each test, create new rover and put in the
		//DrillOn
		//state, then test each transition from that state
		
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.RPTwice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LPOnce));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.LP5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(RoverStates.DrillOff == rover.updateRover(RoverEvents.B1));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_5Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1_10Sec));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B1Twice));
		rover = new Rover(); rover.updateRover(RoverEvents.B1Twice); rover.updateRover(RoverEvents.B1); 
		assertTrue(rover.getCurrentRoverState() == rover.updateRover(RoverEvents.B2));
		
	}

}
