package HW4PlusBonus;

public class DrillOn extends State  {

    public DrillOn(){
        this.entry();
        this.doThis();
    }
    @Override
    public void entry() {
        System.out.println("Entry() DrillOn State");
    }

    @Override
    public void doThis() {

        System.out.println("Do() DrillOn State");
    }

    @Override
    public void exit() {
        System.out.println("Exit() DrillOn State");

    }
}
