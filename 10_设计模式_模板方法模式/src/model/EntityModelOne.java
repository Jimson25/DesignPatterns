package model;

public class EntityModelOne extends AbstractModel{
    @Override
    protected void doSomething() {
        System.out.println("EntityModelOne说: 做点什么勒~~");
    }

    @Override
    protected void doAnything() {
        System.out.println("EntityModelOne说: 随便写写吧~~");
    }
}
