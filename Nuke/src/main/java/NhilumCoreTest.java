import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhilumCoreTest {
    private NhilumCore nhilumCore;

    @BeforeEach
    void setUp() {
        nhilumCore  = new NhilumCore();
    }

    @Test
    void split() {
        SplitResult wrongresult = nhilumCore.split(322,300);

        assertEquals(82.00, nhilumCore.getRemainingPercentage(),0.01);
        assertEquals(1090.65, wrongresult.getSteam(),0.01);
        assertEquals(1500.00, wrongresult.getRemainingHeat(),0.01);

        SplitResult goodresult = nhilumCore.split(323,300);

        assertEquals(64.00, nhilumCore.getRemainingPercentage(),0.01);
        assertEquals(290.70, goodresult.getSteam(),0.01);
        assertEquals(600.00, goodresult.getRemainingHeat(), 0.01);
    }
}