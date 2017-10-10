package HW4PlusBonus;

public class Idle extends State{

    public Idle(){
        this.entry();
        this.doThis();
    }

    @Override
    public void entry() {
        System.out.println("Entry() Idle State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() Idle State");

    }

    @Override
    public void exit() {
        System.out.println("Exit() Idle State");

    }
}
