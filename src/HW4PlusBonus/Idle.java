package HW4PlusBonus;

// TODO: Auto-generated Javadoc
/**
 * The Class Idle.
 */
public class Idle extends State{

    /**
     * Instantiates a new idle.
     */
    public Idle(){
        this.entry();
        this.doThis();
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() Idle State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
//    @Override
//    public void doThis() {
//        System.out.println("Do() Idle State");
//
//    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() Idle State");

    }
}
