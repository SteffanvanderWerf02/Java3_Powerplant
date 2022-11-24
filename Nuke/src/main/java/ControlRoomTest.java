import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlRoomTest {
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
    void isNuclearReactorStable() {
        assertTrue(controlRoom.isNuclearReactorStable());
        powerplant.run(150, 100);
        assertFalse(controlRoom.isNuclearReactorStable(), "one of the buildings or needs attation or is unstable");
    }
}