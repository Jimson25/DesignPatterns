package demo.chain.task;

import demo.chain.ChainController;

public class Task02 extends ChainController {
    @Override
    protected void init() {
        System.out.println("Task02.init");
    }

    @Override
    protected void before() {
        System.out.println("Task02.before");
    }

    @Override
    protected void process() {
        System.out.println("Task02.process");
    }

    @Override
    protected void end() {
        System.out.println("Task02.end");
    }

    @Override
    protected void destroy() {
        System.out.println("Task02.destroy");
    }
}
