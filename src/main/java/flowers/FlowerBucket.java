package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public double opt_price;
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList){
            price = price + flowerPack.price();
        }
        return price;
    }

    public double getOpt_price() {
        return opt_price;
    }

    public void setOpt_price(double opt_price) {
        this.opt_price = opt_price;
    }

    @Override
    public String toString() {
        String pr = String.format("%.2f", opt_price);
        return "FlowerBucket{" +
                "opt_price=" + pr +
                '}';
    }
}
