public class SplitResult {
    private double remainingHeat;
    private double steam;

    public SplitResult(double remainingHeat, double steam) {
        this.remainingHeat = remainingHeat;
        this.steam = steam;
    }

    public double getRemainingHeat() {
        return remainingHeat;
    }

    public double getSteam() {
        return steam;
    }

    public void addRemaningHeat(double addHeat) {
        this.remainingHeat = this.remainingHeat + addHeat;
    }

    public void addSteam(double steam) {
        this.steam = this.steam + steam;
    }
}