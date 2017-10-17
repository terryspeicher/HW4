package HW4PlusBonus;

//Test .git on github.com, //return change
/**
 * The Class State.
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
    public void exit(){
    };

}
