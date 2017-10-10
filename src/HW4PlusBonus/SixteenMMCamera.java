package HW4PlusBonus;

public class SixteenMMCamera extends State  {

    public SixteenMMCamera(){
        this.entry();
        this.doThis();
    }
    @Override
    public void entry() {
        System.out.println("Entry() SixteenMMCamera");
    }

    @Override
    public void doThis() {
        System.out.println("Do() SixteenMMCamera");

    }

    @Override
    public void exit() {
        System.out.println("Exit() SixteenMMCamera");

    }
    public void takePicture(){
        System.out.println("Take Picture");
    }

    public void takeSelfie(){
        System.out.println("Take Selfie");
    }
}
