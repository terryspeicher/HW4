package HW4PlusBonus;

// TODO: Auto-generated Javadoc
/**
 * The Class SixteenMMCamera.
 */
public class SixteenMMCamera extends State  {

    /**
     * Instantiates a new sixteen MM camera.
     */
    public SixteenMMCamera(){
        this.entry();
        this.doThis();
    }
    
    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() SixteenMMCamera");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() SixteenMMCamera");

    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() SixteenMMCamera");

    }
    
    /**
     * Take picture.
     */
    public void takePicture(){
        System.out.println("Take Picture");
    }

    /**
     * Take selfie.
     */
    public void takeSelfie(){
        System.out.println("Take Selfie");
    }
}
