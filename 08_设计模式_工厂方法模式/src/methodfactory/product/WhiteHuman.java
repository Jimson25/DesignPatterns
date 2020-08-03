package methodfactory.product;

public class WhiteHuman extends Human {
    @Override
    public void sayHi() {
        System.out.println("WhiteHuman say Hi~~");
    }

    @Override
    public void sleep() {
        System.out.println("WhiteHuman sleep");
    }
}
