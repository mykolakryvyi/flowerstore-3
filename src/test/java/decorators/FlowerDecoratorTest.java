package decorators;

import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerDecoratorTest {

    Flower flower1 = new Flower(FlowerType.ROSE);

    @BeforeEach
    void setUp() {
        flower1.setPrice(1);
    }
    FlowerDecorator df = new FlowerDecorator(flower1);

    @Test
    void getPrice() {
        assertEquals(2, df.getPrice());
    }
}