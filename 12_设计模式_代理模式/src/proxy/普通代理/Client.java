package proxy.普通代理;

/**
 * 普通代理模式要求调用者之和代理者接触而不用知道实际执行者是谁
 * 屏蔽了真实对象对高层模块的影响
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy();
        proxy.login("user","passwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
