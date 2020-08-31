package decorator.template.component;

public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("invoke decorator.template.component.ConcreteComponent.operate()~");
    }
}
