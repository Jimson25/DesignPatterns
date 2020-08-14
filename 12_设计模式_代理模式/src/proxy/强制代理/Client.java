package proxy.强制代理;


import javax.swing.*;

/**
 * 强制代理要求必须从真实角色找到代理角色,不允许直接访问真实角色,
 * 高层模块通过getProxy获取代理对象.代理对象由真是对象进行创建和管理管理
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====== 直接访问真实角色 ======");
        IGamePlayer player = new GamePlayer("name");
        player.login("user", "password");
        player.killBoss();
        player.upgrade();

        System.out.println("====== 通过真实角色获取代理来访问 ======");
        GamePlayer gamePlayer = new GamePlayer("name");
        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("username","passwd");
        proxy.killBoss();
        proxy.upgrade();



    }
}
