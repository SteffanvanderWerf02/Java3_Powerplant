public class IctuimCore extends Core {
    @Override
    public SplitResult split(int tempInKelvin, int timeInSeconds) {
        float steamM3 = 0f;
        double remaingHeat = 0f;

        if (tempInKelvin > 333) {
            steamM3 = 40f * tempInKelvin;
            remaingHeat = (timeInSeconds / 0.3f) * 18f;
            reduceCoreHealthPercentage(0.00006f * tempInKelvin * timeInSeconds + 0.0004);
        }


        return new SplitResult(remaingHeat, steamM3);
    }
}