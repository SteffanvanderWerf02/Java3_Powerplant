public class Powerplant {
    private Generator generator;
    private Reactor reactor;
    private CoolingSystem coolingSystem;

    private ControlRoom controlRoom;


    public Powerplant(Generator generator, Reactor reactor, CoolingSystem coolingSystem, ControlRoom controlRoom) {
        this.generator = generator;
        this.reactor = reactor;
        this.coolingSystem = coolingSystem;
        this.controlRoom = controlRoom;
    }

    public double run(int tempInKelvin, int timeInSeconds) {
        SplitResult resultReactor = reactor.runReactor(tempInKelvin, timeInSeconds);

        coolingSystem.abductResidualHeat(resultReactor.getRemainingHeat());

        double kwh = generator.generateEnergy(resultReactor.getSteam());

        return kwh;
    }

    public boolean areWeGoingToDie() {
        return !controlRoom.isNuclearReactorStable();
    }
}