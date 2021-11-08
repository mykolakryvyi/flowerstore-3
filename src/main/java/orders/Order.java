package orders;
import delivery.Delivery;
import flowers.FlowerPack;
import flowers.Item;
import payment.Payment;
import users.user;
import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<Item> items = new LinkedList<>();
    private List<user> users = new LinkedList<>();
    private FlowerPack flowerbuck;
    private Delivery delivery;
    private Payment payment;

    public Order() {}

    public void removeUser(user user){
        users.remove(user);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(user user){
        users.add(user);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void notifyUsers(){
        for (user user : users) {
            user.update("delivered");
        }
    }
    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price = price + item.getPrice();
        }
        return price;
    }

    public void order(){
        notifyUsers();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public String processOrder() {
        return "Order in progress.";
    }

    public List<Item> getItems() {
        return items;
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public List<user> getUsers() {
        return users;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setUsers(List<user> users) {
        this.users = users;
    }

    public FlowerPack getFlowerbuck() {
        return flowerbuck;
    }

    public void setFlowerbuck(FlowerPack flowerbuck) {
        this.flowerbuck = flowerbuck;
    }
}