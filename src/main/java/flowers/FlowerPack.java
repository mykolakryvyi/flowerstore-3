package flowers;

public class FlowerPack {
    public int amount;
    public Flower flower;

    public double price(){
        return flower.getPrice() * amount;
    }

    public int getAmount() {
        return amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }
}
