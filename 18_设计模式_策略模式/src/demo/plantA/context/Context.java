package demo.plantA.context;

import demo.plantA.strategy.Calculator;

public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }


    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }


}
