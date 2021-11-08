package users;

public class Sender implements user {
    private int unid=1, id;
    public Sender() {
        this.id = unid;
        unid++;
    }
    @Override
    public void update(String status) {
        System.out.println("Sender with id = " + id + " has the following status " + status);
    }
    public String getStatus(String status) {
        return("Sender with id = " + id + " has the following status " + status);
    }
}