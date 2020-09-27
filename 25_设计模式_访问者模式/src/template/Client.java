package template;

public class Client {
    public static void main(String[] args) {
        ConcreteElement element = new ConcreteElement();
        element.accept(new ConcreteVisitor());
    }
}
