package code_1.strategy;

/**
 * 开后门计策
 */
public class BackDoorStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("invoke BackDoorStrategy~~~");
    }
}
