import java.util.HashSet;

public class Reactor implements Controlable {
    private HashSet<Core> cores;

    public Reactor() {
        this.cores = new HashSet<>();
    }

    public HashSet<Core> getCores() {
        return this.cores;
    }

    public boolean addCores(Core core) {
        return cores.add(core);
    }

    public boolean removeCore(Core core) {
        return cores.remove(core);
    }


    public SplitResult runReactor(int temp, int time) {
        SplitResult result = new SplitResult(0, 0);
        for (Core core : this.cores) {
            SplitResult coreResult = core.split(temp, time);

            result.addRemaningHeat(coreResult.getRemainingHeat());
            result.addSteam(coreResult.getSteam());
        }

        return result;
    }

    @Override
    public STATUS getStatus() {
        for (Core core: this.cores) {
            if (core.getRemainingPercentage() <= 0.2) {
                return STATUS.NEEDS_ATTENTION;
            }
        }

        return STATUS.STABLE;
    }
}