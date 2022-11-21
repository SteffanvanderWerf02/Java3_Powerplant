public class IctuimCore extends Core {
    public IctuimCore(int remainingPercentage) {
        super(remainingPercentage);
    }

    @Override
    public SplitResult split(int tempInKelvin, int timeInSeconds) {
        float steamM3 = 0f;
        double remaingHeat = 0;

        if (tempInKelvin > 333) {
            steamM3 = 40 * tempInKelvin;
            remaingHeat = (timeInSeconds / 0.3) * 18;
            this.remainingPercentage = (this.remainingPercentage - (0.00006 * tempInKelvin * timeInSeconds + 0.0004));
        }


        return new SplitResult(remaingHeat, steamM3);
    }
}