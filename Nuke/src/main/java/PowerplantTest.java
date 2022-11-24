import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerplantTest {

    private Powerplant powerplant;
    private Generator generator;
    private CoolingSystem coolingSystem;
    private Reactor reactor;
    private NhilumCore nhilumCore;

    private ControlRoom controlRoom;
    @BeforeEach
    void setUp() {
        nhilumCore = new NhilumCore();
        generator = new Generator();
        coolingSystem = new CoolingSystem();
        reactor = new Reactor();
        reactor.addCores(nhilumCore);

        controlRoom = new ControlRoom();
        controlRoom.addBuilding(generator);
        controlRoom.addBuilding(coolingSystem);
        controlRoom.addBuilding(reactor);

        powerplant = new Powerplant(generator,reactor,coolingSystem,controlRoom);
    }

    @Test
    void run() {
        assertEquals(3556.45,powerplant.run(150, 300),0.01);
        assertEquals(3556.45, generator.getTotalYieldinKwh(),0.01);
        assertEquals(750.00, coolingSystem.getWaterTemp(), 0.01);

        assertEquals(82, nhilumCore.getRemainingPercentage(),0.01);

    }

    @Test
    void areWeGoingToDie() {
        assertFalse(powerplant.areWeGoingToDie());
        assertEquals(3556.45,powerplant.run(150, 300),0.01);
        assertTrue(powerplant.areWeGoingToDie());
    }
}