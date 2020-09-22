package demo_02.state;

import demo_02.Context;
import demo_02.LiftState;

public class RunningState extends LiftState {
    @Override
    public void open() {
        System.out.println("err");
    }

    @Override
    public void close() {
        System.out.println("Closing~~");
    }

    @Override
    public void run() {
        System.out.println("running~~");
    }

    @Override
    public void stop() {
        //运行中,使电梯停止
        super.context.setLiftState(Context.stoppingState);//环境设置为停止状态
        super.context.getLiftState().stop();
    }
}
