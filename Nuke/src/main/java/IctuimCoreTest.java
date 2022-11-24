import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IctuimCoreTest {

    private IctuimCore ictuimCore;

    @BeforeEach
    void setUp() {
        ictuimCore = new IctuimCore();
    }

    @Test
    void split() {
        SplitResult wrongresult = ictuimCore.split(323,300);

        assertEquals(100, ictuimCore.getRemainingPercentage());
        assertEquals(0, wrongresult.getSteam(),0.01);
        assertEquals(0, wrongresult.getRemainingHeat(),0.01);

        SplitResult goodresult = ictuimCore.split(334,300);

        assertEquals(13360, goodresult.getSteam(),0.01);
        assertEquals(18000, goodresult.getRemainingHeat(), 0.01);
        assertEquals(93.99, ictuimCore.getRemainingPercentage(), 0.01);


    }
}