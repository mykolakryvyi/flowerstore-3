package decorators;

import flowers.Item;

public class FlowerDecorator extends ItemDecorator{
    public FlowerDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 1 + super.getPrice();
    }
    @Override
    public String getDescription() {
        super.getDescription();
        return("Put the flower");
    }

}