package model;

public abstract class AbstractModel {
    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public final void templateMethod() {
        doSomething();
        doAnything();
    }


}
