import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitResultTest {

    private SplitResult finalResult;
    private SplitResult startResult;

    @BeforeEach
    void setUp() {
        finalResult = new SplitResult(30,20);
        startResult = new SplitResult(0,0);
    }

    @Test
    void addRemaningHeat() {
        assertEquals(30, finalResult.getRemainingHeat(), "Heat is not the set value");
        assertEquals(0, startResult.getRemainingHeat(),"Heat is not the set value");

        startResult.addRemaningHeat(10);

        assertEquals(30, finalResult.getRemainingHeat(), "Heat is not the set value");
        assertEquals(10, startResult.getRemainingHeat(),"Heat is not the set value");

    }

    @Test
    void addSteam() {
        assertEquals(20, finalResult.getSteam(), "Heat is not the set value");
        assertEquals(0, startResult.getSteam(),"Heat is not the set value");

        startResult.addSteam(10);

        assertEquals(20, finalResult.getSteam(), "Heat is not the set value");
        assertEquals(10, startResult.getSteam(),"Heat is not the set value");
    }
}