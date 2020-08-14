package proxy.普通代理;

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(IGamePlayer iGamePlayer, String name) {
        if (iGamePlayer == null) {
            throw new IllegalArgumentException("对象创建失败");
        } else {
            this.name = name;
        }
    }


    @Override
    public void killBoss() {
        System.out.println("proxy.普通代理.GamePlayer " + this.name + " killBoss");
    }

    @Override
    public void login(String username, String passwd) {
        System.out.println("proxy.普通代理.GamePlayer " + "用户名: " + username + ", 昵称: " + this.name + "登陆成功");
    }

    @Override
    public void upgrade() {
        System.out.println("proxy.普通代理.GamePlayer " + this.name + " upgrade");
    }
}
