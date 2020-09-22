package demo_02.state;

import demo_02.Context;
import demo_02.LiftState;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        //电梯停止的时候是可以开门的
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("Closing~~");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("Stopping~~");
    }
}
