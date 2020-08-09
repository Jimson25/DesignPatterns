package Hummer;

import model.AbstractModel;

//第一个悍马模型
public class HummerModelOne extends AbstractHummer {

    private boolean isAlarm = false;

    @Override
    protected void start() {
        System.out.println("HummerModelOne "+"start");
    }

    @Override
    protected void stop() {
        System.out.println("HummerModelOne "+"stop");

    }

    @Override
    protected void alarm() {
        System.out.println("HummerModelOne "+"alarm");

    }

    @Override
    protected void engineBoom() {
        System.out.println("HummerModelOne "+"engineBoom");

    }

    //控制是否需要喇叭
    protected boolean isAlarm(){
        return this.isAlarm;
    }

    //给外界提供是否需要喇叭的控制方法
    public void setAlarm(boolean alarmFlag){
        this.isAlarm = alarmFlag;
    }
}
