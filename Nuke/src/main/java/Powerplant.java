public class Powerplant {
    private Generator generator;
    private Reactor reactor;
    private CoolingSystem coolingSystem;


    public Powerplant(Generator generator, Reactor reactor, CoolingSystem coolingSystem) {
        this.generator = generator;
        this.reactor = reactor;
        this.coolingSystem = coolingSystem;
    }

    public float run (float time, float temp) {
        return 0;
    }
}