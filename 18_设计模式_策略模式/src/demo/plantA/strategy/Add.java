package demo.plantA.strategy;

public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return Math.addExact(a, b);
    }
}
