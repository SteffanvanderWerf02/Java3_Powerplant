import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    private Generator generator;
    @BeforeEach
    void setUp() {
        generator = new Generator();
    }

    @Test
    void generateEnergy() {
        assertEquals(0 , generator.getTotalYieldinKwh());
        assertEquals(2032.80,generator.generateEnergy(290.40),0.01);
        assertEquals(2032.80 , generator.getTotalYieldinKwh(), 0.01);
    }

    @Test
    void getStatus() {
        assertEquals(STATUS.STABLE , generator.getStatus());

        assertEquals(140.00,generator.generateEnergy(20),0.01);
        assertEquals(STATUS.STABLE , generator.getStatus());

        assertEquals(560.00,generator.generateEnergy(80),0.01);
        assertEquals(STATUS.UNSTABLE , generator.getStatus());
    }

}