package demo_01;

public class ClothesCorp extends Corp {
    @Override
    public void produce() {
        System.out.println("ClothesCorp.produce");
    }

    @Override
    public void sell() {
        System.out.println("ClothesCorp.sell");
    }
}
