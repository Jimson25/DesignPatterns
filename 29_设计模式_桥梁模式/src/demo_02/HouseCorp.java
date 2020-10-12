package demo_02;

public class HouseCorp extends Corp {

    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("HouseCorp.makeMoney");
    }
}
