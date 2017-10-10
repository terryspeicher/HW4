package HW4PlusBonus;

// TODO: Auto-generated Javadoc
/**
 * The Class MoveBa.
 */
public class MoveBa extends State  {

    /**
     * Instantiates a new move ba.
     */
    public MoveBa(){
        this.entry();
        this.doThis();
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() MoveBa State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() MoveBa State");

    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() MoveBa State");

    }
}
