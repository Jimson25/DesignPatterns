package mediator.prototype;

public class ConcretaMediator extends Mediator {
    @Override
    public void doSomeThingOne() {
        System.out.println("mediator.prototype.ConcretaMediator - doSomeThingOne");
    }

    @Override
    public void doSomeThingTwo() {
        System.out.println("mediator.prototype.ConcretaMediator - doSomeThingTwo");
    }
}
