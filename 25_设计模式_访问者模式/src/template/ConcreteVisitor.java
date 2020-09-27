package template;

/**
 * 具体的访问者
 *  它决定了具体的访问者能干什么事情
 */
public class ConcreteVisitor implements IVisitor {
    @Override
    public void visit(ConcreteElement el1) {
        el1.doSomething();
    }
}
