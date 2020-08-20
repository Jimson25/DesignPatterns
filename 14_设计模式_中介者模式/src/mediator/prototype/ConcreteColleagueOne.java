package mediator.prototype;

public class ConcreteColleagueOne extends Colleague{
    public ConcreteColleagueOne(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod(){
        System.out.println("mediator.prototype.ConcreteColleagueOne - selfMethod");
    }
    public void depMethod(){
        System.out.println("mediator.prototype.ConcreteColleagueOne - depMethod");
        super.mediator.doSomeThingOne();
    }

}
