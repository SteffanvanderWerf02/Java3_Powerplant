public class CoolingSystem {
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
        this.waterTemp = heat * 0.50;
    }
}