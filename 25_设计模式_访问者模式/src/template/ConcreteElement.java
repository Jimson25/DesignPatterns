package template;

/**
 * 具体的访问者
 * - 实现访问控制的方法，具体的被访问的对象
 */
public class ConcreteElement extends Element {

    @Override
    public void doSomething() {
        System.out.println("ConcreteElement.doSomething");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
