package fr.andrew.model.observers;

public class DeclenchementAlarme implements Observer {
    private int id;

    public DeclenchementAlarme(int id) {
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
        System.out.println(getId() +"DeclenchementAlarme recieved a notification : " + message);

    }
}
