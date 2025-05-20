package fr.andrew.model.publishers;

import fr.andrew.model.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class NO2Sensor implements Publisher  {
    private List<Observer> observers = new ArrayList<>();

    private int id;

    public NO2Sensor(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println("NO2 detected in detector #" + getId());
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        String message = "NO2Sensor activated";
        for (Observer observer : observers) {
            observer.update(getId() + message);
        }
    }
}
