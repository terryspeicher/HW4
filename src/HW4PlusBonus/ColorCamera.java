package HW4PlusBonus;

public class ColorCamera extends State  {

    public ColorCamera() {

        this.entry();
        this.doThis();
    }


    @Override
    public void entry() {
        System.out.println("Entry() ColorCamera State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() Color Camera");
    }

    @Override
    public void exit() {
        System.out.println("Exit() ColorCamera State");

    }
    public void takePicture(){
        System.out.println("Take Picture");
    }

    public void takeSelfie(){
        System.out.println("Take Selfie");
    }
}
