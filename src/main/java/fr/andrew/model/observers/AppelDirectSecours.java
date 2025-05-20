package fr.andrew.model.observers;

public class AppelDirectSecours implements Observer {
    @Override
    public void update(String message) {
        System.out.println("AppelDirectSecours recieved a notification : " + message);

    }
}
