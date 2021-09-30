package demo.chain.task;

import demo.chain.ChainController;
import demo.chain.Rule;

public class Task01 extends ChainController implements Rule {
    static {
        System.out.println(Task01.class.getSuperclass().getName());
    }

    @Override
    public void init() { }

    @Override
    public void before() { }

    @Override
    public void process() { }

    @Override
    public void end() { }

    @Override
    public void destroy() { }
}
