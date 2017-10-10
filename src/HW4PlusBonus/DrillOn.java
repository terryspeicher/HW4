package HW4PlusBonus;

// TODO: Auto-generated Javadoc
/**
 * The Class DrillOn.
 */
public class DrillOn extends State  {

    /**
     * Instantiates a new drill on.
     */
    public DrillOn(){
        this.entry();
        this.doThis();
    }
    
    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() DrillOn State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {

        System.out.println("Do() DrillOn State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() DrillOn State");

    }
}
