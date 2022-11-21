public class Powerplant {
    private Generator generator;
    private Reactor reactor;
    private CoolingSystem coolingSystem;


    public Powerplant(Generator generator, Reactor reactor, CoolingSystem coolingSystem) {
        this.generator = generator;
        this.reactor = reactor;
        this.coolingSystem = coolingSystem;
    }

    public double run(int temp, int time) {
        SplitResult resultReactor = reactor.runReactor(temp, time);

        coolingSystem.abductResidualHeat(resultReactor.getRemainingHeat());
        double genPowerInKwh = generator.generateEnergy(resultReactor.getSteam());
        generator.addGenPowerToTotal(genPowerInKwh);

        return genPowerInKwh;
    }
}