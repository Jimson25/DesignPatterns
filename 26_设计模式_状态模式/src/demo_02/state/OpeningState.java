package demo_02.state;

import demo_02.Context;
import demo_02.LiftState;

public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启中~~");
    }

    @Override
    public void close() {
        //当电梯处于开启状态在调用关闭方法时,将电梯的状态设置为关闭
        super.context.setLiftState(Context.closingState);
        //关闭电梯
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        System.out.println("err");
    }

    @Override
    public void stop() {
        System.out.println("Stopping~~");
    }
}
