package proxy.动态代理;

import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //创建一个要被代理的对象
        IGamePlayer player = new GamePlayer("zhang");
        //定义一个handler
        GamePlayIH handler = new GamePlayIH(player);
        //记录时间
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        //获取要被代理的对象的类加载器
        ClassLoader loader = player.getClass().getClassLoader();
        //获取代理对象
        /**
         * newProxyInstance: 返回指定接口的代理类的实例，该接口将方法调用分派给指定的调用处理程序。
         * loader: 加载代理类的类加载器
         * interfaces: 代理类实现的方法列表
         * handler: 调度方法调用的调用处理函数
         */
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[]{IGamePlayer.class}, handler);
        //代理对象执行对应方法
        proxy.login("zhangsan", "passwd");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));


    }
}
