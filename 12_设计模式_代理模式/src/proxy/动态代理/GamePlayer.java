package proxy.动态代理;

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer( String name) {
        this.name = name;
    }


    @Override
    public void killBoss() {
        System.out.println("proxy.动态代理.GamePlayer " + this.name + " killBoss");
    }

    @Override
    public void login(String username, String passwd) {
        System.out.println("proxy.动态代理.GamePlayer " + "用户名: " + username + ", 昵称: " + this.name + "登陆成功");
    }

    @Override
    public void upgrade() {
        System.out.println("proxy.动态代理.GamePlayer " + this.name + " upgrade");
    }
}
