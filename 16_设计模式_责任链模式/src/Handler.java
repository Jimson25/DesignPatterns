public abstract class Handler {
    private Handler nextHandler;
    private int level;

    public Handler(int level,Handler instance) {
        this.level = level;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
