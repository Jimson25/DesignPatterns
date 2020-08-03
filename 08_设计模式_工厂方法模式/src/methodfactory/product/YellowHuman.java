package methodfactory.product;

public class YellowHuman extends Human {
    @Override
    public void sayHi() {
        System.out.println("YellowHuman say Hi~~");
    }

    @Override
    public void sleep() {
        System.out.println("YellowHuman sleep");
    }
}
