package demo_01;

public abstract class Corp {
    public abstract void produce();

    public abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }


}
