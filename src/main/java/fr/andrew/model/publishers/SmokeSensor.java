package fr.andrew.model.publishers;

import fr.andrew.model.observers.*;

import java.util.ArrayList;
import java.util.List;

public class SmokeSensor implements Publisher{
    private List<Observer> observers = new ArrayList<>();
    public void simulateDetectionEvent() {
        System.out.println("smoke detected");
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }

    public void notifySubscribers() {
        String message = "SmokeSensor activated";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
