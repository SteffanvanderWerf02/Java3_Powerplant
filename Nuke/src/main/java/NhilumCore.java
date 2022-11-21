public class NhilumCore extends Core {

    public NhilumCore(int remainingPercentage) {
        super(remainingPercentage);
    }

    @Override
    public SplitResult split(int tempInKelvin, int timeInSeconds) {
        float steamM3 = 0f;
        double remaingHeat = 0;

        if (tempInKelvin < 323) {
            steamM3 = (tempInKelvin / 62f) * timeInSeconds * 0.7f;
            remaingHeat = timeInSeconds * 5;
        } else {
            steamM3 = (float) (0.9f * ((tempInKelvin * 0.5f) / timeInSeconds) * Math.sqrt(4f * timeInSeconds));
            remaingHeat = timeInSeconds / 0.5;
        }

        this.remainingPercentage = (this.remainingPercentage - (0.06 * timeInSeconds));

        return new SplitResult(remaingHeat, steamM3);
    }
}