public abstract class Core {
    public static final double FULL_PERCENTAGE = 100;
    protected double remainingPercentage;

    public Core() {
        this.remainingPercentage = FULL_PERCENTAGE;
    }

    public Core(double remainingPercentage) {
        this.remainingPercentage = remainingPercentage;
    }

    public double getRemainingPercentage() {
        return this.remainingPercentage;
    }
    public void reduceCoreHealthPercentage(double percentage) {
        this.remainingPercentage = this.remainingPercentage - percentage;
    }
    public abstract SplitResult split(int tempInKelvin, int TimeInSeconds);
}