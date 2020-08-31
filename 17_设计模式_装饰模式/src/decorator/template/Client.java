package decorator.template;

import decorator.template.component.Component;
import decorator.template.component.ConcreteComponent;
import decorator.template.decorator.ConcreteDecorator_1;
import decorator.template.decorator.ConcreteDecorator_2;
import decorator.template.decorator.Decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecorator_1(new ConcreteDecorator_2(component));
//        decorator = new ConcreteDecorator_2(new ConcreteDecorator_1(new ConcreteComponent()));

        decorator.operate();
    }
}
