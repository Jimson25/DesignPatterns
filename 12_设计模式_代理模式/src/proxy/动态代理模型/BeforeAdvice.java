package proxy.动态代理模型;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("这是前置通知");
    }
}
