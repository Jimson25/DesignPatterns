package proxy.强制代理;

public interface IGamePlayer {

    void killBoss();

    void login(String username, String passwd);

    void upgrade();

    IGamePlayer getProxy();
}
