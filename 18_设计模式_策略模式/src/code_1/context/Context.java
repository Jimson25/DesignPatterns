package code_1.context;

import code_1.strategy.IStrategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
