package demo_02;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("House.beProducted");
    }

    @Override
    public void beSelled() {
        System.out.println("House.beSelled");
    }
}
