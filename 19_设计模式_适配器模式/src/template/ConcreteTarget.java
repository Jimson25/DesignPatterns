package template;

/**
 * 目标角色是一个已经在正式运行的角色，你不可能去修改角色中的方法，你能做的就是
 * 如何去实现接口中的方法，而且通常情况下，目标角色是一个接口或者是抽象类，一般不会
 * 是实现类。
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget.request");
    }
}
