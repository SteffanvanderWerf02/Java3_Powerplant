public class CoolingSystem implements Controlable {
    private double waterTemp;

    public CoolingSystem() {
        this.waterTemp = 0;
    }

    public CoolingSystem(float waterTemp) {
        this.waterTemp = waterTemp;
    }

    public double getWaterTemp() {
        return this.waterTemp;
    }

    public void setWaterTemp(float waterTemp) {
        this.waterTemp = waterTemp;
    }

    public void abductResidualHeat(double heat) {
        this.waterTemp += heat * 0.50;
    }


    @Override
    public STATUS getStatus() {
        if (this.waterTemp >= 80 && this.waterTemp <= 90) {
            return STATUS.NEEDS_ATTENTION;
        } else if (this.waterTemp > 90) {
            return STATUS.UNSTABLE;
        }

        return STATUS.STABLE;
    }
}