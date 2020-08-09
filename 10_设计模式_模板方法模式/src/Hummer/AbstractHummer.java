package Hummer;

/**
 * 抽象悍马汽车类
 */
public abstract class AbstractHummer {
    //启动
    protected abstract void start();

    //停止
    protected abstract void stop();

    //按喇叭
    protected abstract void alarm();

    //引擎声
    protected abstract void engineBoom();

    //是否需要喇叭声
    protected boolean isAlarm() {
        return true;
    }

    //模板方法
    public final void run() {
        start();
        if (isAlarm()) {
            alarm();
        }
        engineBoom();
        stop();
    }

    public abstract void setAlarm(boolean alarmFlag);
}
