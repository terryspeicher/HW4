package HW4PlusBonus;

/**
 * The Class ColorCamera.
 */
public class ColorCamera extends State  {

    /**
     * Instantiates a new color camera.
     */
    public ColorCamera() {

        this.entry();
        this.doThis();
    }


    /* (non-Javadoc)
     * @see HW4PlusBonus.State#entry()
     */
    @Override
    public void entry() {
        System.out.println("Entry() ColorCamera State");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#doThis()
     */
    @Override
    public void doThis() {
        System.out.println("Do() Color Camera");
    }

    /* (non-Javadoc)
     * @see HW4PlusBonus.State#exit()
     */
    @Override
    public void exit() {
        System.out.println("Exit() ColorCamera State");

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
