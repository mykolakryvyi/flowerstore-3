package decorators;

import flowers.Item;

public class FlowerBucketDecorator extends ItemDecorator{
    public FlowerBucketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 2 + super.getPrice();
    }
    @Override
    public String getDescription() {
        super.getDescription();
        return("Put in the bucket");
    }
}