public abstract class Core {
    public static final int FULL_PERCENTAGE = 100;
    protected int remainingPercentage;

    public Core() {
        this.remainingPercentage = FULL_PERCENTAGE;
    }

    public Core(int remainingPercentage) {
        this.remainingPercentage = remainingPercentage;
    }

    public abstract SplitResult split (int tempInKelvin, int TimeInSeconds);
}