package mediator.prototype;

public class ConcreteColleagueTwo extends Colleague{
    public ConcreteColleagueTwo(Mediator mediator) {
        super(mediator);
    }


    public void selfMethod(){
        System.out.println("mediator.prototype.ConcreteColleagueTwo - selfMethod");
    }
    public void depMethod(){
        System.out.println("mediator.prototype.ConcreteColleagueTwo - depMethod");
        super.mediator.doSomeThingTwo();
    }
}
