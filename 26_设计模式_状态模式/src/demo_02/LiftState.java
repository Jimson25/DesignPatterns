package demo_02;

public abstract class LiftState {
    protected Context context;

    //首先电梯门开启动作
    public abstract void open();

    //电梯门有开启，那当然也就有关闭了
    public abstract void close();

    //电梯要能上能下，运行起来
    public abstract void run();

    //电梯还要能停下来
    public abstract void stop();

    public void setContext(Context context) {
        this.context = context;
    }
}
