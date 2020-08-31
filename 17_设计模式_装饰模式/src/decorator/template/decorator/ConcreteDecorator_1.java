package decorator.template.decorator;

import decorator.template.component.Component;

public class ConcreteDecorator_1 extends Decorator {
    public ConcreteDecorator_1(Component component) {
        super(component);
    }

    private void doSomething(){
        System.out.println("ConcreteDecorator_1 doSomething~~~");
    }

    @Override
    public void operate(){
        this.doSomething();
        super.operate();
    }


}
