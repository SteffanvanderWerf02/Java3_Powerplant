public class Powerplant {
    private Generator generator;
    private Reactor reactor;
    private CoolingSystem coolingSystem;


    public Powerplant(Generator generator, Reactor reactor, CoolingSystem coolingSystem) {
        this.generator = generator;
        this.reactor = reactor;
        this.coolingSystem = coolingSystem;
    }

    public double run(int tempInKelvin, int timeInSeconds) {
        SplitResult resultReactor = reactor.runReactor(tempInKelvin, timeInSeconds);

        coolingSystem.abductResidualHeat(resultReactor.getRemainingHeat());

        double kwh = generator.generateEnergy(resultReactor.getSteam());

        return kwh;
    }
}