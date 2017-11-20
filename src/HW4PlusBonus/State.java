package HW4PlusBonus;

//Test .git on github.com, //return change
/**
 * The Class State is the parent for all States of the Rover.  Simulating a state machine, each instantiated 
 * class must have an entry(),do(), and exit() method.
 * 
 * @author Terry Speicher
 * @version 1.1
 */
public abstract class State {

    /**
     * Entry.  This is the action to be taken when this state is entered
     */
    public void entry() {};

    /**
     * Do this. This is the action to be taken while in this state.
     */
    public void doThis(){ };

    /**
     * Exit.  This is the action to be taken when this state is exited.
     */
    public void exit(){ };

}
