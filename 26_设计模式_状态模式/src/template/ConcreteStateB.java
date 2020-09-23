package template;

/**
 * 具体角色
 *  - 每一个具体状态必须完成两个职责：
 *      本状态的行为管理以及趋向状态处理，通俗地说，就是本状态下要做的事情
 *      本状态如何过渡到其他状态。
 */
public class ConcreteStateB extends State {
    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        //过渡到state1状态，由Context实现
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("这是B状态下的执行逻辑");
    }
}
