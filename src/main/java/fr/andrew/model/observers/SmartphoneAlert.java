package fr.andrew.model.observers;

public class SmartphoneAlert implements Observer {

    @Override
    public void update(String message) {
        System.out.println("SmartphoneAlert recieved a notification : " + message);

    }
}
