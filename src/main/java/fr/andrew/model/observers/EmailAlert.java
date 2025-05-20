package fr.andrew.model.observers;

public class EmailAlert implements Observer {
    @Override
    public void update(String message) {
        System.out.println("EmailAlert recieved a notification : " + message);

    }
}
