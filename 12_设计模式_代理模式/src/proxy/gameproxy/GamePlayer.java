package proxy.gameproxy;

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String userInfo) {
        System.out.println("账号为:" + userInfo + "的玩家" + name + ": 玩家登陆成功");
    }

    @Override
    public void killBoss() {
        System.out.println(name + ": 玩家" + "击杀boss");
    }

    @Override
    public void upgrade() {
        System.out.println(name + ": 玩家" + "升级");
    }
}
