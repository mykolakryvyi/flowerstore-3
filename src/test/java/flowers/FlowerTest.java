package flowers;

import flowers.Flower;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower = new Flower(FlowerType.ROSE);
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower.setPrice(10);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }
}