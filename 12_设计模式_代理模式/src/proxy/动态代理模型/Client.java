package proxy.动态代理模型;

public class Client {
    public static void main(String[] args) {
        //创建一个要被代理的对象
        Subject realSubject = new RealSubject();
        //创建一个handler
        MyInvocationHandler handler = new MyInvocationHandler(realSubject);
        //创建代理对象
        Subject proxy = DynamicProxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                new Class[]{Subject.class}, handler);
        //通过代理对象执行对应方法
        proxy.doSomething("do");

        System.out.println("====== 简化后的代理过程 ======");
        Subject subject = new RealSubject();
        proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("简化后");

    }
}
