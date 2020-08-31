package code_1.strategy;

public class GivenGreenLightStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("invoke GivenGreenLightStrategy~~~");
    }
}
