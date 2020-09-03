package 透明模式;

import java.util.ArrayList;

public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething(){
        System.out.println("Component.doSomething");
    }
    //增加一个叶子构件或树枝构件
    public abstract void add(Component component);
    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);
    //获得分支下的所有叶子构件和树枝构件
    public abstract ArrayList<Component> getChildren();
}
