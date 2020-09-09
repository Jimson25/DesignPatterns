package extension_02;

public class Originator implements Cloneable {
    private Originator backup;

    private String state = "这是初始状态！！！";

    public void createMemento() {
        this.backup = this.clone();
    }

    public void restore() {
        this.state = this.backup.getState();
    }


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
