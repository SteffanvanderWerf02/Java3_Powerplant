import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoolingSystemTest {

    private CoolingSystem coolingSystem;

    @BeforeEach
    void setUp() {
        coolingSystem = new CoolingSystem();
    }

    @Test
    void abductResidualHeat() {
        assertEquals(0, coolingSystem.getWaterTemp());
        coolingSystem.abductResidualHeat(160);

        assertEquals(80, coolingSystem.getWaterTemp());
        coolingSystem.abductResidualHeat(160);
        assertEquals(160, coolingSystem.getWaterTemp());

    }

    @Test
    void getStatus() {
        assertEquals(STATUS.STABLE, coolingSystem.getStatus());
        coolingSystem.abductResidualHeat(160);
        assertEquals(STATUS.NEEDS_ATTENTION, coolingSystem.getStatus());
        coolingSystem.abductResidualHeat(160);
        assertEquals(STATUS.UNSTABLE, coolingSystem.getStatus());
    }
}