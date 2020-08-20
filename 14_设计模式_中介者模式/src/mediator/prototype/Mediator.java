package mediator.prototype;

public abstract class Mediator {
    protected ConcreteColleagueOne colleagueOne;
    protected ConcreteColleagueTwo colleagueTwo;

    public ConcreteColleagueOne getColleagueOne() {
        return colleagueOne;
    }

    public void setColleagueOne(ConcreteColleagueOne colleagueOne) {
        this.colleagueOne = colleagueOne;
    }

    public ConcreteColleagueTwo getColleagueTwo() {
        return colleagueTwo;
    }

    public void setColleagueTwo(ConcreteColleagueTwo colleagueTwo) {
        this.colleagueTwo = colleagueTwo;
    }

    public abstract void doSomeThingOne();

    public abstract void doSomeThingTwo();

}
