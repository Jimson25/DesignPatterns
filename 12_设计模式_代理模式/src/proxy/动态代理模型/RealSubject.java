package proxy.动态代理模型;

/**
 * 真是主题
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("proxy.动态代理模型.RealSubject.doSomeThing() " + str);
    }
}
