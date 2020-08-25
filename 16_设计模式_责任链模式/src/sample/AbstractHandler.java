package sample;

public abstract class AbstractHandler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    //责任链中的下一位
    private AbstractHandler nextHandler;

    //没定义一个成员都要明确它能处理的等级
    public AbstractHandler(int level) {
        this.level = level;
    }

    protected abstract void response(IWomen women);

    /**
     * 设置下一位执行者
     * @param handler 下一位执行者
     */
    public void setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 处理信息
     * @param women 提供处理信息的角色
     */
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("没有下一层,请求失败");
            }
        }
    }

}
