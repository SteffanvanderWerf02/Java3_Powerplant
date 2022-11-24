public class NhilumCore extends Core {
    @Override
    public SplitResult split(int tempInKelvin, int timeInSeconds) {
        double steamM3 = 0f;
        double remaingHeat = 0f;

        if (tempInKelvin < 323) {
            steamM3 = tempInKelvin / 62f * timeInSeconds * 0.7f;
            remaingHeat = timeInSeconds * 5f;
        } else {
            steamM3 = (0.9 * ((tempInKelvin * 0.5f) / timeInSeconds) * Math.sqrt(4) * timeInSeconds);
            remaingHeat = timeInSeconds / 0.5f;
        }

        reduceCoreHealthPercentage(0.06f * timeInSeconds);

        return new SplitResult(remaingHeat, steamM3);
    }
}