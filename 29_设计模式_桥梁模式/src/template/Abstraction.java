package template;

/**
 * 抽象类角色
 *  - 他的主要职责是定义该角色的行为，同时保存一个对实现化角色的引用，一般是抽象类
 */
public abstract class Abstraction {
    //定义对实现化角色的引用
    private Implementor imp;
    //约束子类必须实现该构造函数
    public Abstraction(Implementor _imp){
        this.imp = _imp;
    }
    //自身的行为和属性
    public void request(){
        this.imp.doSomething();
    }
    //获得实现化角色
    public Implementor getImp(){
        return imp;
    }
}
