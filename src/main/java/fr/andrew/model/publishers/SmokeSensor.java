package fr.andrew.model.publishers;

import fr.andrew.model.observers.*;

import java.util.ArrayList;
import java.util.List;

public class SmokeSensor implements Publisher{
    private List<Observer> observers = new ArrayList<>();
    private int id;

    public SmokeSensor(int id) {
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
        System.out.println("smoke detected in detector #" + getId());
        notifySubscribers();
    }
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifySubscribers() {
        String message = "SmokeSensor activated";
        for (Observer observer : observers) {
            observer.update(getId() + message);
        }
    }

}
