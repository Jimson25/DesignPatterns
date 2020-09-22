package demo_02;

import demo_02.state.ClosingState;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.close();
        context.open();
        context.run();
        context.stop();
    }
}
