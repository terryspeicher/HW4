package HW4PlusBonus;

/**
 * The Class MoveFa.
 * 
 *  
 * @author Terry Speicher
 * @version 1.1
 */
public class MoveFa extends State  {
    
    /**
     * Instantiates a new move fa.
     */
    public MoveFa(){
        this.entry();
        this.doThis();
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() MoveFa State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() MoveFa State");

    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() MoveFa State");

    }
}
