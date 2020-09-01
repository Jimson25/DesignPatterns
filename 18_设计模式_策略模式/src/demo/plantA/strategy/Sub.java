package demo.plantA.strategy;

public class Sub implements Calculator{
    @Override
    public int exec(int a, int b) {
        return Math.subtractExact(a,b);
    }
}
