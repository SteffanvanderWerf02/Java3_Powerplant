public class Generator {
    private double totalYieldinKwh;

    public Generator(double totalYieldinKwh) {
        this.totalYieldinKwh = totalYieldinKwh;
    }

    public Generator() {
        this.totalYieldinKwh = 0;
    }

    public void addGenPowerToTotal(double power) {
        this.totalYieldinKwh = this.totalYieldinKwh + power;
    }

    public double generateEnergy(double steam) {
        return steam * 7.0;
    }
}