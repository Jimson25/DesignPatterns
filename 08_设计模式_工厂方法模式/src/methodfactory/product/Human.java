package methodfactory.product;

public abstract class Human {
    //不同人种肤色不同
    public String color;

    public abstract void sayHi();

    public abstract void sleep();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
