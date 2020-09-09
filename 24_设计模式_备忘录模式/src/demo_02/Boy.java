package demo_02;

public class Boy {
    private String state = "";

    public void changeState() {
        this.state = "state change";
    }

    /**
     * 创建一个备份
     * @return 返回一个备份对象
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备份
     * @param memento 要恢复的备份对象
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
