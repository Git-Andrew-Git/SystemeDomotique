package fr.andrew.model.observers;

public class SmartphoneAlert implements Observer {
    private int id;

    public SmartphoneAlert(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void update(String message) {
        System.out.println(getId() +"SmartphoneAlert recieved a notification : " + message);

    }
}
