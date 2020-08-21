package CommonCode.receiver;

/**
 * 通用执行者类
 * 在上面例子中对应`group`
 */
public abstract class Receiver {
    /**
     * 每个具体执行者都得做的事
     */
    public abstract void doSomething();
}
