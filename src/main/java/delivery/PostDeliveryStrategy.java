package delivery;

import flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    public void deliver(List<Item> items) {
        System.out.println("You delivered items with the help of post");
    }
}
