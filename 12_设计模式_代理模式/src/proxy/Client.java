package proxy;

import proxy.gameproxy.GamePlayer;
import proxy.gameproxy.GamePlayerProxy;
import proxy.gameproxy.IGamePlayer;

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
    }
}
