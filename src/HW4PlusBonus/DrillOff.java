package HW4PlusBonus;

/**
 * The Class DrillOff.
 * 
 *  
 * @author Terry Speicher
 * @version 1.1
 */
public class DrillOff extends State {

    /**
     * Instantiates a new drill off.
     */
    public DrillOff(){
        this.entry();
        this.doThis();

    }
    
    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() DrillOff State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() DrillOff State");

    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() DrillOff State");

    }
}
