package fr.andrew.model.publishers;

import fr.andrew.model.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Publisher  {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void simulateDetectionEvent() {
        System.out.println("Temperature haut detected");
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
        String message = "TemperatureSensor activated";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
