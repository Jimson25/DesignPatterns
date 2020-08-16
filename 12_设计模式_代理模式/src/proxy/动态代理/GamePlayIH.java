package proxy.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

    //被被代理者
    private Class cls = null;
    //被代理的实例
    private Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    /**
     * 动态代理实现AOP
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人用" + args[0] + "登陆");
        }
        return result;
    }

    //普通动态代理
    /*@Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj, args);
    }*/
}
