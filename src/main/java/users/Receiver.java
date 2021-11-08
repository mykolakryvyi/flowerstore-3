package users;

public class Receiver implements user {
    private int unid=1, id;
    public Receiver() {
        this.id = unid;
        unid++;
    }
    @Override
    public void update(String status) {
        System.out.println("Receiver with id = " + id + "has the following status" + status);
    }
    public int getId(){
        return this.id;
    }
}