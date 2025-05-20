package fr.andrew.model.publishers;

import fr.andrew.model.observers.Observer;

public interface Publisher {
    public abstract void simulateDetectionEvent();
    public abstract void subscribe(Observer observer);
    public abstract void unsubscribe(Observer observer);
    public abstract void notifySubscribers();
}
