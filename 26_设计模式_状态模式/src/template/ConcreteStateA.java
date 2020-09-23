package template;

/**
 * 具体角色
 * - 每一个具体状态必须完成两个职责：
 * 本状态的行为管理以及趋向状态处理，通俗地说，就是本状态下要做的事情
 * 本状态如何过渡到其他状态。
 */
public class ConcreteStateA extends State {
    @Override
    public void handle1() {
        System.out.println("这是A状态要执行的逻辑");
    }

    @Override
    public void handle2() {
        //设置当前状态为state2
        super.context.setCurrentState(Context.STATE2);
        //切换到state2状态
        super.context.handle2();
    }
}
