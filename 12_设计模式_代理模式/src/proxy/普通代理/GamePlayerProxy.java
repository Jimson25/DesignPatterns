package proxy.普通代理;

public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer;

    public GamePlayerProxy() {
        this.gamePlayer = new GamePlayer(this,"name");
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void login(String username, String passwd) {
        this.gamePlayer.login("user","passwd");
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
