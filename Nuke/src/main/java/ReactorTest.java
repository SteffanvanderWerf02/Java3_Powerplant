import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReactorTest {

    private Reactor reactorNHL;
    private Reactor reactorICT;

    private NhilumCore nhilumCore;
    private IctuimCore ictuimCore1;
    private IctuimCore ictuimCore2;

    @BeforeEach
    void setUp() {
        reactorNHL = new Reactor();
        reactorICT = new Reactor();

        ictuimCore1 = new IctuimCore();
        ictuimCore2 = new IctuimCore();
        nhilumCore = new NhilumCore();

        reactorICT.addCores(ictuimCore1);
        reactorICT.addCores(ictuimCore2);

        reactorNHL.addCores(nhilumCore);

    }

    @Test
    void runReactor() {
        SplitResult resultNHL = reactorNHL.runReactor(322, 300);


        assertEquals(1090.65,resultNHL.getSteam(), 0.01 );
        assertEquals(1500.00,resultNHL.getRemainingHeat(), 0.01);

        SplitResult resultIct = reactorICT.runReactor(334, 300);
        assertEquals(26720.00,resultIct.getSteam(), 0.01 );
        assertEquals(36000.00,resultIct.getRemainingHeat(), 0.01);

    }

    @Test
    void getStatus() {
        assertEquals(STATUS.STABLE,reactorICT.getStatus());
        SplitResult resultIct = reactorICT.runReactor(334, 5000);
        assertEquals(STATUS.NEEDS_ATTENTION,reactorICT.getStatus());

    }
}