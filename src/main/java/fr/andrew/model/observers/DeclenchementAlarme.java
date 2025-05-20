package fr.andrew.model.observers;

public class DeclenchementAlarme implements Observer {

    @Override
    public void update(String message) {
        System.out.println("DeclenchementAlarme recieved a notification : " + message);

    }
}
