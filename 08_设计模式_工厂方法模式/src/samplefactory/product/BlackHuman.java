package samplefactory.product;

public class BlackHuman extends Human {
    @Override
    public void sayHi() {
        System.out.println("BlackHuman say Hi~~");
    }

    @Override
    public void sleep() {
        System.out.println("blackHuman sleep");
    }
}
