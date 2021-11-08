package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FlowerPackTest {
    FlowerPack flp;

    @BeforeEach
    void setUp(){
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setPrice(3);
        flp = new FlowerPack();
        flp.setFlower(flower);
        flp.setAmount(50);
    }
    @Test
    void getAmount(){
        assertEquals(flp.getAmount(), 50);
    }

    @Test
    void getFlower(){
        Flower x = flp.getFlower();
        assertEquals(x.getFlowerType(), FlowerType.ROSE);
        assertEquals(x.getPrice(), 3);
    }

    @Test
    void getPrice(){
        assertEquals(flp.price(), 150);
    }

}
