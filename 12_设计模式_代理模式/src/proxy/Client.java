package proxy;

import proxy.gameproxy.GamePlayer;
import proxy.gameproxy.GamePlayerProxy;
import proxy.gameproxy.IGamePlayer;
import proxy.proxy.Proxy;
import proxy.proxy.RealSubject;
import proxy.proxy.Subject;

public class Client {
    public static void main(String[] args) {
        System.out.println("====== 游戏玩家上线 ======");
        IGamePlayer gamePlayer = new GamePlayer("zhang");
        gamePlayer.login("zhangsan");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        System.out.println("====== 代理玩家上线 ======");
        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);
        proxy.login("zhangsan");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("====== 代理模式原型 ======");
        Subject realSubject = new RealSubject();
        realSubject.request();
        System.out.println("====== 使用代理执行 ======");
        Subject proxy1 = new Proxy(realSubject);
        proxy1.request();


    }
}
