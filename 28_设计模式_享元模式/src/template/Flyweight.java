package template;

/**
 * 抽象享元角色
 *  - 一个抽象的产品类，同时定义出对象的内部状态和外部状态的接口或实现
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    protected final String Extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String _Extrinsic) {
        this.Extrinsic = _Extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    //内部状态的getter/setter
    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
