package proxy.动态代理模型;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    /**
     *  通用类,不具备业务性
     */
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        //todo 没搞明白这里的判断是干嘛用的
        if (true) {
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
