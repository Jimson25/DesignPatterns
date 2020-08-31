package decorator.template.decorator;

import decorator.template.component.Component;

public class ConcreteDecorator_2 extends Decorator {
    public ConcreteDecorator_2(Component component) {
        super(component);
    }

    private void doSomething(){
        System.out.println("ConcreteDecorator_2 doSomething~~~");
    }

    @Override
    public void operate(){
        this.doSomething();
        super.operate();
    }


}
