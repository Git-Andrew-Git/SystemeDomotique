package fr.andrew.model.observers;

public class AppelDirectSecours implements Observer {
    private int id;

    public AppelDirectSecours(int id) {
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
        System.out.println(getId() +"AppelDirectSecours recieved a notification : " + message);

    }
}
