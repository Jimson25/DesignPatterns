package demo.chain.task;

import demo.chain.ChainController;

public class Task01 extends ChainController {
    @Override
    protected void init() {
        System.out.println("Task01.init");
    }

    @Override
    protected void before() {
        System.out.println("Task01.before");
    }

    @Override
    protected void process() {
        System.out.println("Task01.process");
    }

    @Override
    protected void end() {
        System.out.println("Task01.end");
    }

    @Override
    protected void destroy() {
        System.out.println("Task01.destroy");
    }
}
