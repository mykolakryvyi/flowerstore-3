package flowers;

public class Flower extends Item{
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public void setSepalLength(double sepalLength) { this.sepalLength = sepalLength; }

    public void setPrice(double price) { this.price = price; }

    public void setFlowerType(FlowerType flowerType) { this.flowerType = flowerType; }

    public void setColor(Color color) { this.color = color; }

    public double getSepalLength() {return sepalLength; }

    public double getPrice() { return price; }

    public FlowerType getFlowerType() { return flowerType; }

    public Color getColor() { return color; }
    @Override
    public String getDescription() {
        return "";
    }
}
