package orders;
import decorators.FlowerDecorator;
import decorators.ItemDecorator;
import flowers.*;
import decorators.FlowerBucketDecorator;
import delivery.Delivery;
import users.Receiver;
import users.Sender;
import delivery.DHLDeliveryStrategy;
import payment.CreditCardPaymentStrategy;
import payment.Payment;


public enum QuickOrder {
     ROSE_BUCKET,TULIP_BUCKET, CHAMOMILE_BUCKET;

    public static Order createOrder(QuickOrder orderConstrictor) {
        // initializing all necessary variables
        Order order = new Order();
        Receiver receiver = new Receiver();
        Sender sender = new Sender();
        Payment payment = new CreditCardPaymentStrategy();
        Delivery delivery = new DHLDeliveryStrategy();
        FlowerPack pack1 = new FlowerPack();

        if (orderConstrictor == QuickOrder.ROSE_BUCKET) {
            Flower flower1 = new Flower(FlowerType.ROSE);
            pack1.setFlower(flower1);
            pack1.setAmount(10);
        } else if (orderConstrictor == QuickOrder.TULIP_BUCKET) {
            Flower flower1 = new Flower(FlowerType.TULIP);
            pack1.setFlower(flower1);
            pack1.setAmount(20);
        } else if (orderConstrictor == QuickOrder.CHAMOMILE_BUCKET){
            Flower flower1 = new Flower(FlowerType.CHAMOMILE);
            pack1.setFlower(flower1);
            pack1.setAmount(30);
        } else {
            System.out.println("No buckets available!");
            return order;
        }
        order.setFlowerbuck(pack1);
        order.addUser(receiver);
        order.addUser(sender);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);
        return order;
    }
}