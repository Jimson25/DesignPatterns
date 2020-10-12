package template;

public class ConcreteImplementor extends Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementor.doSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplementor.doAnything");
    }
}
