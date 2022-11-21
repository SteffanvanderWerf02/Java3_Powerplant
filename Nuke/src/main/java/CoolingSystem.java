public class CoolingSystem {
    private float waterTemp;

    public CoolingSystem(float waterTemp) {
        this.waterTemp = waterTemp;
    }

    public float getWaterTemp() {
        return this.waterTemp;
    }

    public void setWaterTemp(float waterTemp) {
        this.waterTemp = waterTemp;
    }

    public float abductResidualHeat() {
        return 0;
    }
}