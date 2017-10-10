package HW4PlusBonus;

public class MoveBa extends State  {

    public MoveBa(){
        this.entry();
        this.doThis();
    }

    @Override
    public void entry() {
        System.out.println("Entry() MoveBa State");
    }

    @Override
    public void doThis() {
        System.out.println("Do() MoveBa State");

    }

    @Override
    public void exit() {
        System.out.println("Exit() MoveBa State");

    }
}
