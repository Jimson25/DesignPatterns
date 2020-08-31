package template.context;

import template.strategy.Strategy;

/**
 * 封装角色
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public void doAnything(){
        this.strategy.doSomething();
    }














}
