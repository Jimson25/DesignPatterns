package proxy.动态代理模型;

import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject){
        //获取被代理者的类加载器
        ClassLoader classLoader = subject.getClass().getClassLoader();
        //获取被代理者实现的接口
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        //获取自定义的handler对象
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        //获取代理对象
        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
