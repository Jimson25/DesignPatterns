package code.observable;

import code.observer.Observer;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi, Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void haveBreakFast() {
        System.out.println("韩非子:开始吃饭了...");
        //通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer:this.observers) {
            observer.update(context);
        }
    }
}
