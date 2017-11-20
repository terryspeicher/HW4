package HW4PlusBonus;

/**
 * The Class MoveFc.
 * 
 * @author Terry Speicher
 * @version 1.1
 */
public class MoveFc extends State  {

    /**
     * Instantiates a new move fc.
     */
    public MoveFc(){
        this.entry();
        this.doThis();
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() MoveFc State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() MoveFc State");

    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() MoveFc State");

    }
}
