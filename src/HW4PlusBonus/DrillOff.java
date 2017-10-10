package HW4PlusBonus;

public class DrillOff extends State {

    public DrillOff(){
        this.entry();
        this.doThis();

    }
    @Override
    public void entry() {
        System.out.println("Entry() DrillOff State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() DrillOff State");

    }

    @Override
    public void exit() {
        System.out.println("Exit() DrillOff State");

    }
}
