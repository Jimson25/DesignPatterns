package code.observable;

import code.observer.Observer;

/**
 * 被观察者
 */
public interface Observable {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers(String context);
}
