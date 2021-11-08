package delivery;

import flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    public void deliver(List<Item> items) {
        System.out.println("You delivered items with the help of DHL");
    }
}
