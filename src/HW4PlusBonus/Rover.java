package HW4PlusBonus;

import java.util.Hashtable;

/**
 * HW4 Terry Speicher, 3331, id80609111.
 */

public class Rover {

/*
 * The Rover Class represents an implementation of the State Diagram for Homework #4 (See diagram in pdf)
 * Using the state diagram, an Event Driven State Diagram table is created.  
 * The table is represented by a Hashtable that uses the concatenation of the <current state name> +
 * <driving event> to create a key, and the <state to be transitioned into> as the value.
 *
 */



    /** The current rover state. */
	RoverStates currentRoverState;


    /** The pointer to current state object. */
    State pointerToCurrentStateObject;

    /** The rover transition table. */
    Hashtable<String,RoverStates> roverTransition;


    /**
     * Instantiates a new rover.
     */
    public Rover(){

        //Set the current State Enum Holder to "Idle"
        this.currentRoverState = RoverStates.Idle;
        //Set the State pointer to a new Idle state
        pointerToCurrentStateObject = new Idle();

        roverTransition = new Hashtable<String,RoverStates>();

        //Fill the Hash table with valid transitions
        //Using K,V as follows:
        //  K = EnumState.toString() + EnumEvent.toString() and
        //  V = EnumState being transitioned into

        //Column 1, Idles
        roverTransition.put(RoverStates.Idle.toString()+RoverEvents.RPOnce.toString(), RoverStates.MoveFa);
        roverTransition.put(RoverStates.Idle.toString()+RoverEvents.RP5Sec.toString(), RoverStates.MoveFa);
        roverTransition.put(RoverStates.Idle.toString()+RoverEvents.LP5Sec.toString(),RoverStates.MoveBa);
        roverTransition.put(RoverStates.Idle.toString()+RoverEvents.B1_5Sec.toString(),RoverStates.ColorCamera);
        roverTransition.put(RoverStates.Idle.toString()+RoverEvents.B1_10Sec.toString(),RoverStates.SixteenMMCamera);
        roverTransition.put(RoverStates.Idle.toString()+RoverEvents.B1Twice.toString(),RoverStates.DrillOff);

        //Column 2, MoveFc
        roverTransition.put(RoverStates.MoveFc.toString() + RoverEvents.RPTwice.toString(),RoverStates.Idle);

        //Column 3, MoveFa
        roverTransition.put(RoverStates.MoveFa.toString() + RoverEvents.RP5Sec.toString(),RoverStates.MoveFc);
        roverTransition.put(RoverStates.MoveFa.toString() + RoverEvents.RPTwice.toString(),RoverStates.Idle);
        roverTransition.put(RoverStates.MoveFa.toString() + RoverEvents.LPOnce.toString(),RoverStates.MoveFc);

        //Column 4, MoveBc
        roverTransition.put(RoverStates.MoveBc.toString() + RoverEvents.RPOnce.toString(),RoverStates.MoveFa);
        roverTransition.put(RoverStates.MoveBc.toString() + RoverEvents.RPTwice.toString(),RoverStates.Idle);

        //Column 5, MoveBa
        roverTransition.put(RoverStates.MoveBa.toString() + RoverEvents.LPOnce.toString(),RoverStates.MoveBc);
        roverTransition.put(RoverStates.MoveBa.toString() + RoverEvents.RPTwice.toString(),RoverStates.Idle);

        //Column 6, ColorCamera
        roverTransition.put(RoverStates.ColorCamera.toString() + RoverEvents.B1.toString(),RoverStates.ColorCamera);
        roverTransition.put(RoverStates.ColorCamera.toString() + RoverEvents.B1_5Sec.toString(),RoverStates.ColorCamera);
        roverTransition.put(RoverStates.ColorCamera.toString() + RoverEvents.B2.toString(),RoverStates.Idle);

        //Column 7, SixteenMMCamera
        roverTransition.put(RoverStates.SixteenMMCamera.toString() + RoverEvents.B1.toString(),RoverStates.SixteenMMCamera);
        roverTransition.put(RoverStates.SixteenMMCamera.toString() + RoverEvents.B1_5Sec.toString(),RoverStates.SixteenMMCamera);
        roverTransition.put(RoverStates.SixteenMMCamera.toString() + RoverEvents.B2.toString(),RoverStates.Idle);

        //Column 8, DrillOff
        roverTransition.put(RoverStates.DrillOff.toString() + RoverEvents.B1.toString(),RoverStates.DrillOn);
        roverTransition.put(RoverStates.DrillOff.toString() + RoverEvents.B2.toString(),RoverStates.Idle);

        //Column 9, DrillOn
        roverTransition.put(RoverStates.DrillOn.toString() + RoverEvents.B1.toString(),RoverStates.DrillOff);
    }

    /**
     * Update rover.  The class knows the current state of the rover - "this.currentRoverState"  The updateRover
     * method parameter is the event that may or may not trigger a transition to a new state.  The transition is
     * is determined by finding the new state located in the transition Hashtable at (<curState> + <roverEvent>)
     * The resulting state, if not null, is the new state that the rover is transitioned to. The State object pointer
     * is pointed to a new instance of the type of state being transitioned to.
     *
     * @param roverEvent the rover event
     * @return the rover states
     */
    public RoverStates updateRover(RoverEvents roverEvent) {
        RoverStates oldRoverState = this.currentRoverState;  //only needed for printout below
        //Set new state ad then update if not null
        RoverStates newRoverState = this.roverTransition.get(this.currentRoverState.toString() + roverEvent.toString());
        if (newRoverState != null) {
            this.currentRoverState = newRoverState;

            //enum RoverStates {Idle, MoveFc, MoveFa, MoveBc, MoveBa, ColorCamera, SixteenMMCamera, DrillOff, DrillOn;}
            switch (newRoverState) {
                case Idle:
                    if (oldRoverState != RoverStates.Idle) { //coming into Idle
                        pointerToCurrentStateObject.exit(); //run the Exit() from the old state
                        pointerToCurrentStateObject = new Idle(); //create and run the Entry() + Do() for new State
                    }
                    break;
                case MoveFc:
                    if (oldRoverState != RoverStates.MoveFc) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new MoveFc();
                    }
                    break;
                case MoveFa:
                    if (oldRoverState != RoverStates.MoveFa) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new MoveFa();
                    }
                    break;
                case MoveBc:
                    if (oldRoverState != RoverStates.MoveBc) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new MoveBc();
                    }
                    break;
                case MoveBa:
                    if (oldRoverState != RoverStates.MoveBa) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new MoveBa();
                    }
                    break;
                case ColorCamera:
                    if (oldRoverState != RoverStates.ColorCamera) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new ColorCamera();
                    } else {  //keeping same state, possibly doing something within the current state
                        switch (roverEvent) {
                            case B1:
                                if (pointerToCurrentStateObject instanceof ColorCamera) {
                                    ColorCamera cc = (ColorCamera) pointerToCurrentStateObject;
                                    cc.takePicture();
                                }
                                break;
                            case B1_5Sec:
                                if (pointerToCurrentStateObject instanceof ColorCamera) {
                                    ColorCamera cc = (ColorCamera) pointerToCurrentStateObject;
                                    cc.takeSelfie();
                                }
                                break;
                        }
                    }
                    break;
                case SixteenMMCamera:
                    if (oldRoverState != RoverStates.SixteenMMCamera) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new SixteenMMCamera();
                    } else {  //keeping same state, possibly doing something within the current state
                        switch (roverEvent) {
                            case B1:
                                if (pointerToCurrentStateObject instanceof SixteenMMCamera) {
                                    SixteenMMCamera smm = (SixteenMMCamera) pointerToCurrentStateObject;
                                    smm.takePicture();
                                }
                                break;
                            case B1_5Sec:
                                if (pointerToCurrentStateObject instanceof SixteenMMCamera) {
                                    SixteenMMCamera smm = (SixteenMMCamera) pointerToCurrentStateObject;
                                    smm.takeSelfie();
                                }
                                break;
                        }
                    }
                    break;
                case DrillOff:
                    if (oldRoverState != RoverStates.DrillOff) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new DrillOff();
                    }
                    break;
                case DrillOn:
                    if (oldRoverState != RoverStates.DrillOn) {
                        pointerToCurrentStateObject.exit();
                        pointerToCurrentStateObject = new DrillOn();
                    }
                    break;

            }

/*            //just for output, to show what we did.
            System.out.println("\n\n***************************");
            System.out.println("Old Rover Status: " + oldRoverState);
            System.out.println("Action Performed: " + roverEvent);
            System.out.println("New Rover Status: " + this.currentRoverState);
            System.out.println("***************************\n\n");*/

        }

        return this.currentRoverState;  //not sure I needed to return the new state, but I thought I might need it.

    }

    /**
     * Gets the current rover state.
     *
     * @return the current rover state
     */
    public RoverStates getCurrentRoverState() {
        return currentRoverState;
    }

    /* I'm not sure I want to allow the rover state to be set manually.  But, it could happen
    public void setCurrentRoverState(RoverStates currentRoverState) {
        this.currentRoverState = currentRoverState;
    }
    */

}
