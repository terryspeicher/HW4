package HW4PlusBonus;

public class MoveFc extends State  {

    public MoveFc(){
        this.entry();
        this.doThis();
    }

    @Override
    public void entry() {
        System.out.println("Entry() MoveFc State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() MoveFc State");

    }

    @Override
    public void exit() {
        System.out.println("Exit() MoveFc State");

    }
}
