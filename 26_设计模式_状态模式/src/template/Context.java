package template;

public class Context {
    //定义状态
    public final static State STATE1 = new ConcreteStateA();
    public final static State STATE2 = new ConcreteStateB();
    //当前状态
    private State currentState;

    //行为委托
    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }
}
