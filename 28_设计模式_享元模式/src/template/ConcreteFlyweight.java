package template;

/**
 * 具体的一个产品类，实现抽象角色定义的业务。
 * 该角色中需要注意的是内部状态处理应该与环境无关，
 * 不应该出现一个操作改变了内部状态，同时修改了外部状态，这是绝对不允许的。
 */
public class ConcreteFlyweight extends Flyweight {
    public ConcreteFlyweight(String _Extrinsic) {
        super(_Extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteFlyweight.operate");
    }
}
