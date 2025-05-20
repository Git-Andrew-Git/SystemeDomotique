package fr.andrew.model.observers;

public class EmailAlert implements Observer {
    private int id;

    public EmailAlert(int id) {
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
        System.out.println(getId() +"EmailAlert recieved a notification : " + message);

    }
}
