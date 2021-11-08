package order;

import orders.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import flowers.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order = new Order();

    @BeforeEach
    void setUp() {
        Flower flower1 = new Flower(FlowerType.ROSE);
        flower1.setPrice(15);
        Flower flower2 = new Flower(FlowerType.CHAMOMILE);
        flower2.setPrice(25);
        order.addItem(flower1);
        order.addItem(flower2);
    }

    @Test
    void checkprice(){
        assertEquals(order.calculateTotalPrice(), 40);
    }

    @Test
    void process() {
        assertEquals("Order in progress.", order.processOrder());
    }
}