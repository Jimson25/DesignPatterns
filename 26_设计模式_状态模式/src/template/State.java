package template;

/**
 * 抽象状态角色
 * - 接口或抽象类，负责对象状态定义，并且封装环境角色以实现状态切换。
 */
public abstract class State {
    protected Context context;

    public abstract void handle1();

    public abstract void handle2();

    public void setContext(Context context) {
        this.context = context;
    }
}
