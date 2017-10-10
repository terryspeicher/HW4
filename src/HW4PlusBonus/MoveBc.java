package HW4PlusBonus;

public class MoveBc  extends State  {

    public MoveBc(){
        this.entry();
        this.doThis();
    }

    @Override
    public void entry() {
        System.out.println("Entry() MoveBc State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() MoveBc State");

    }

    @Override
    public void exit() {
        System.out.println("Exit() MoveBc State");

    }
}
