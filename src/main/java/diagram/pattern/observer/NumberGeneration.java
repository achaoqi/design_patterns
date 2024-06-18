package diagram.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGeneration {
    private List<Observer> observers=new ArrayList<>();

    public void addServers(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyServers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
