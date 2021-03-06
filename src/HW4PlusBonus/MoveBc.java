package HW4PlusBonus;

/**
 * The Class MoveBc.
 * 
 *  
 * @author Terry Speicher
 * @version 1.1
 */
public class MoveBc  extends State  {

    /**
     * Instantiates a new move bc.
     */
    public MoveBc(){
        this.entry();
        this.doThis();
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() MoveBc State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() MoveBc State");

    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() MoveBc State");

    }
}
