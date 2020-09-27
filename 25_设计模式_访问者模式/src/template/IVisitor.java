package template;

/**
 * 抽象访问者
 * 声明访问者可以访问哪些元素，具体到程序就是visit()方法中的参数定义哪些对象可以被访问
 */
public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement el1);
}
