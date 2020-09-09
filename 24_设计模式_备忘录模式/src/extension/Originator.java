package extension;

public class Originator implements Cloneable {
    private String state = "这是初始状态！！";

    //创建一个备忘录
    public Originator createMemento() {
        return this.clone();
    }

    //恢复一个备忘录
    public void restore(Originator originator) {
        this.state = originator.getState();
    }

    //克隆当前对象
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
