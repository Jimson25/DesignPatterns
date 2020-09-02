package template;

/**
 * 抽象构件角色
 *  定义参加组合对象的共有方法和属性，可以定义一些默认的行为或属性，比如我们例子中的getInfo就封装到了抽象类中。
 */
public abstract class Component {
    public void doSomething(){
        System.out.println("Component.doSomething");
    }
}
