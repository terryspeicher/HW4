package HW4PlusBonus;

public class MoveFa extends State  {
    public MoveFa(){
        this.entry();
        this.doThis();
    }

    @Override
    public void entry() {
        System.out.println("Entry() MoveFa State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() MoveFa State");

    }

    @Override
    public void exit() {
        System.out.println("Exit() MoveFa State");

    }
}
