package demo_01;

public class HouseCorp extends Corp {
    @Override
    public void produce() {
        System.out.println("HouseCorp.produce");
    }

    @Override
    public void sell() {
        System.out.println("HouseCorp.sell");
    }
}
