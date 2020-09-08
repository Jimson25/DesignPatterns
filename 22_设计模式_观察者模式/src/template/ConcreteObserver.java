package template;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收信息并处理");
    }
}
