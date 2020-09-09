package template;

/**
 * 发起人，需要建立备忘录的角色
 */
public class Originator {
    private String state = "这是当前的状态！！";

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
